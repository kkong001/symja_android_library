package org.matheclipse.core.expression;

import java.io.ObjectStreamException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.math4.fraction.BigFraction;
import org.apache.commons.math4.util.ArithmeticUtils;
import org.matheclipse.core.basic.Config;
import org.matheclipse.core.form.output.OutputFormFactory;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.INumber;

/**
 * IFraction implementation which reimplements methods of the Apache
 * <code>org.apache.commons.math4.fraction.Fraction</code> methods.
 * 
 * @see AbstractFractionSym
 * @see BigFractionSym
 */
public class FractionSym extends AbstractFractionSym {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1225728601457694359L;

	/**
	 * Check if numerator and denominator are equal and the numerator isn't
	 * zero.
	 * 
	 * @param num
	 *            Numerator
	 * @param den
	 *            Denominator
	 * @return
	 */
	private static boolean isOne(long num, long den) {
		return num == den && num != 0;
	}

	int fNumerator;

	int fDenominator;

	/**
	 * Construct a rational from two ints. The constructor is private and does
	 * not normalize. Use the static constructor valueOf instead.
	 * 
	 * @param nom
	 *            Numerator
	 * @param denom
	 *            Denominator
	 */
	FractionSym(int nom, int denom) {
		fNumerator = nom;
		fDenominator = denom;
	}

	/**
	 * Compute the absolute of this rational.
	 * 
	 * @return Rational that is equal to the absolute value of this rational.
	 */
	@Override
	public AbstractFractionSym abs() {
		return newinstance(Math.abs((long) fNumerator), fDenominator);
	}

	/**
	 * Return a new rational representing <code>this + other</code>.
	 * 
	 * @param other
	 *            Rational to add.
	 * @return Sum of <code>this</code> and <code>other</code>.
	 */
	@Override
	public AbstractFractionSym add(AbstractFractionSym other) {
		if (fNumerator == 0) {
			return other;
		}
		if (other instanceof BigFractionSym) {
			return ((BigFractionSym) other).add(this);
		} else {
			FractionSym fs = (FractionSym) other;
			if (fs.fNumerator == 0) {
				return this;
			}
			if (fDenominator == fs.fDenominator) {
				return newinstance((long) fNumerator + fs.fNumerator, fDenominator);
			}
			int gcd = ArithmeticUtils.gcd(fDenominator, fs.fDenominator);
			if (gcd == 1) {
				long denomgcd = fDenominator;
				long otherdenomgcd = fs.fDenominator;
				long newdenom = denomgcd * otherdenomgcd;
				long newnum = otherdenomgcd * fNumerator + (long) fDenominator * (long) fs.fNumerator;
				return newinstance(newnum, newdenom);
			}
			long denomgcd = fDenominator / gcd;
			long otherdenomgcd = fs.fDenominator / gcd;
			long newdenom = denomgcd * fs.fDenominator;
			long newnum = otherdenomgcd * fNumerator + denomgcd * fs.fNumerator;
			return newinstance(newnum, newdenom);
		}
	}

	/**
	 * Return a new rational representing the smallest integral rational not
	 * smaller than <code>this</code>.
	 * 
	 * @return Next bigger integer of <code>this</code>.
	 */
	@Override
	public AbstractFractionSym ceil() {
		if (fDenominator == 1) {
			return this;
		}
		int div = fNumerator / fDenominator;
		// Java rounds the wrong way for positive numbers.
		// We know that the division is not exact due to
		// normalization and mdenom != 1, so adding
		// one fixes the result for positive numbers.
		if (fNumerator > 0) {
			div++;
		}
		return newinstance(div, 1);
	}

	@Override
	public int compareAbsValueToOne() {
		long num = fNumerator;
		if (fNumerator < 0) {
			num *= (-1);
		}
		if (isOne(num, fDenominator)) {
			return 0;
		}
		return (num > fDenominator) ? 1 : -1;
	}

	@Override
	public int compareTo(IExpr expr) {
		if (expr instanceof FractionSym) {
			FractionSym temp = (FractionSym) expr;
			if (temp.fDenominator == fDenominator) {
				return fNumerator < temp.fNumerator ? -1 : fNumerator == temp.fNumerator ? 0 : 1;
			}
			long valt = (long) fNumerator * (long) temp.fDenominator;
			long valo = (long) temp.fNumerator * (long) fDenominator;
			return valt < valo ? -1 : valt == valo ? 0 : 1;
		}
		if (expr instanceof IntegerSym) {
			return compareTo(new BigFractionSym(((IntegerSym) expr).fInteger, BigInteger.ONE));
		}
		if (expr instanceof Num) {
			double d = doubleValue() - ((Num) expr).getRealPart();
			if (d < 0.0) {
				return -1;
			}
			if (d > 0.0) {
				return 1;
			}
			return super.compareTo(expr);
		}
		if (expr instanceof BigFractionSym) {
			return -expr.compareTo(this);
		}
		return super.compareTo(expr);
	}

	@Override
	public ComplexNum complexNumValue() {
		// double precision complex number
		double nr = fNumerator;
		double dr = fDenominator;
		return ComplexNum.valueOf(nr / dr);
	}

	/**
	 * Return a new rational representing <code>this / other</code>.
	 * 
	 * @param other
	 *            Rational to divide.
	 * @return Quotient of <code>this</code> and <code>other</code>.
	 */
	@Override
	public AbstractFractionSym div(AbstractFractionSym other) {
		if (other instanceof BigFractionSym) {
			return ((BigFractionSym) other).idiv(this);
		}

		FractionSym fs = (FractionSym) other;
		if (fs.fDenominator == 1) {
			if (fs.fNumerator == 1) {
				return this;
			}
			if (fs.fNumerator == -1) {
				return this.negate();
			}
		}
		long newnum = (long) fNumerator * fs.fDenominator;
		long newdenom = (long) fDenominator * fs.fNumerator;
		// +-inf : -c = -+inf
		if (newdenom == 0 && fs.fNumerator < 0)
			newnum = -newnum;
		return newinstance(newnum, newdenom);
	}

	@Override
	public double doubleValue() {
		return ((double) fNumerator) / ((double) fDenominator);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof FractionSym) {
			FractionSym r = (FractionSym) o;
			return fNumerator == r.fNumerator && fDenominator == r.fDenominator;
		}
		if (o instanceof BigFractionSym) {
			return o.equals(this);
		}
		return false;
	}

	/**
	 * Return a new rational representing the biggest integral rational not
	 * bigger than <code>this</code>.
	 * 
	 * @return Next smaller integer of <code>this</code>.
	 */
	@Override
	public AbstractFractionSym floor() {
		if (fDenominator == 1) {
			return this;
		}
		int div = fNumerator / fDenominator;
		// Java rounds the wrong way for negative numbers.
		// We know that the division is not exact due to
		// normalization and mdenom != 1, so subtracting
		// one fixes the result for negative numbers.
		if (fNumerator < 0) {
			div--;
		}
		return newinstance(div, 1);
	}

	/**
	 * Returns the fractional part of the rational, i.e. the number
	 * this.sub(this.floor()).
	 * 
	 * @return Next smaller integer of <code>this</code>.
	 */
	public AbstractFractionSym frac() {
		if (fDenominator == 1) {
			return AbstractFractionSym.ZERO;
		}
		int newnum = fNumerator % fDenominator;
		// Java rounds the wrong way for negative numbers.
		// We know that the division is not exact due to
		// normalization and mdenom != 1, so subtracting
		// one fixes the result for negative numbers.
		if (newnum < 0)
			newnum += fDenominator;
		return newinstance(newnum, fDenominator);
	}

	@Override
	public String fullFormString() {
		StringBuffer buf = new StringBuffer("Rational");
		if (Config.PARSER_USE_LOWERCASE_SYMBOLS) {
			buf.append('(');
		} else {
			buf.append('[');
		}
		buf.append(Integer.toString(fNumerator));
		buf.append(',');
		buf.append(Integer.toString(fDenominator));
		if (Config.PARSER_USE_LOWERCASE_SYMBOLS) {
			buf.append(')');
		} else {
			buf.append(']');
		}
		return buf.toString();
	}

	/**
	 * Compute the gcd of two rationals (this and other). The gcd is the
	 * rational number, such that dividing this and other with the gcd will
	 * yield two co-prime integers.
	 * 
	 * @param other
	 *            the second rational argument.
	 * @return the gcd of this and other.
	 */
	public AbstractFractionSym gcd(AbstractFractionSym other) {
		if (isZero()) {
			return other;
		}
		if (other.isZero()) {
			return this;
		}
		if (other instanceof BigFractionSym) {
			return ((BigFractionSym) other).gcd(this);
		}
		/* new numerator = gcd(num, other.num) */
		/* new denominator = lcm(denom, other.denom) */
		FractionSym fs = (FractionSym) other;
		int gcddenom = ArithmeticUtils.gcd(fDenominator, fs.fDenominator);
		long denom = ((long) (fDenominator / gcddenom)) * (long) fs.fDenominator;
		long num = ArithmeticUtils.gcd(fNumerator < 0 ? -fNumerator : fNumerator,
				fs.fNumerator < 0 ? -fs.fNumerator : fs.fNumerator);
		return newinstance(num, denom);
	}

	@Override
	public IExpr gcd(IExpr that) {
		if (that instanceof FractionSym) {
			return gcd((FractionSym) that);
		}
		return super.gcd(that);
	}

	@Override
	public BigInteger getBigDenominator() {
		return BigInteger.valueOf(fDenominator);
	}

	@Override
	public BigInteger getBigNumerator() {
		return BigInteger.valueOf(fNumerator);
	}

	/** {@inheritDoc} */
	@Override
	public BigFraction getFraction() {
		return new BigFraction(fNumerator, fDenominator);
	}

	@Override
	public BigFraction getRational() {
		return new BigFraction(fNumerator, fDenominator);
	}

	@Override
	public int hashCode() {
		return 37 * (37 * 17 + fNumerator) + fDenominator;
	}

	@Override
	public String internalFormString(boolean symbolsAsFactoryMethod, int depth) {
		return internalJavaString(symbolsAsFactoryMethod, depth, false);
	}

	@Override
	public String internalJavaString(boolean symbolsAsFactoryMethod, int depth, boolean useOperators) {
		if (fNumerator == 1) {
			switch (fDenominator) {
			case 2:
				return "C1D2";
			case 3:
				return "C1D3";
			case 4:
				return "C1D4";
			}
		}
		if (fNumerator == -1) {
			switch (fDenominator) {
			case 2:
				return "CN1D2";
			case 3:
				return "CN1D3";
			case 4:
				return "CN1D4";
			}
		}
		return "QQ(" + fNumerator + "L," + fDenominator + "L)";
	}

	@Override
	public String internalScalaString(boolean symbolsAsFactoryMethod, int depth) {
		return internalJavaString(symbolsAsFactoryMethod, depth, true);
	}

	/**
	 * Returns a new rational representing the inverse of <code>this</code>.
	 * 
	 * @return Inverse of <code>this</code>.
	 */
	@Override
	public AbstractFractionSym inverse() {
		return newinstance(fDenominator, fNumerator);
	}

	/**
	 * Check whether this rational corresponds to a (finite) rational value.
	 * This function can be used to test for infinites and NaNs.
	 * 
	 * @return true if and only if this rational is not infinite or NaN.
	 */
	public boolean isDefined() {
		return fDenominator != 0;
	}

	/**
	 * Check whether this rational represents an integral value.  
	 * 
	 * @return <code>true</code> iff value is integral.
	 */
	@Override
	public boolean isIntegral() {
		return fDenominator == 1;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isMinusOne() {
		return fNumerator == (-1 * fDenominator) && fNumerator != 0;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isNegative() {
		return fNumerator < 0;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isOne() {
		return fNumerator == fDenominator && fNumerator != 0;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isPositive() {
		return fNumerator > 0;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isZero() {
		return fNumerator == 0;
	}

	/**
	 * Return a new rational representing <code>this * other</code>.
	 * 
	 * @param other
	 *            Rational to multiply.
	 * @return Product of <code>this</code> and <code>other</code>.
	 */
	@Override
	public AbstractFractionSym mul(AbstractFractionSym other) {
		if (other.isOne()) {
			return this;
		}
		if (this.isOne()) {
			return other;
		}
		if (other.isMinusOne()) {
			return this.negate();
		}
		if (this.isMinusOne()) {
			return other.negate();
		}
		if (other instanceof BigFractionSym) {
			return other.mul(this);
		}

		FractionSym fs = (FractionSym) other;
		long newnum = (long) fNumerator * fs.fNumerator;
		long newdenom = (long) fDenominator * fs.fDenominator;
		return newinstance(newnum, newdenom);
	}

	/**
	 * Return a new rational representing <code>this * other</code>.
	 * 
	 * @param other
	 *            big integer to multiply.
	 * @return Product of <code>this</code> and <code>other</code>.
	 */
	public AbstractFractionSym mul(BigInteger other) {
		if (other.bitLength() < 32) { 
			int oint = other.intValue();
			if (oint == 1)
				return this;
			if (oint == -1)
				return this.negate();
			long newnum = (long) fNumerator * oint;
			return newinstance(newnum, fDenominator);
		}

		if (this.isOne()) {
			return valueOf(other, BigInteger.ONE);
		}
		if (this.isMinusOne()) {
			return valueOf(other.negate(), BigInteger.ONE);
		}

		return valueOf(getBigNumerator().multiply(other), getBigDenominator());
	}

	/**
	 * Returns a new rational equal to <code>-this</code>.
	 * 
	 * @return <code>-this</code>.
	 */
	@Override
	public AbstractFractionSym negate() {
		return AbstractFractionSym.newinstance(-(long) fNumerator, fDenominator);
	}

	/** {@inheritDoc} */
	@Override
	public INumber normalize() {
		if (fDenominator == 1) {
			return F.integer(fNumerator);
		}
		if (isZero()) {
			return F.C0;
		}
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public IInteger round() {
		BigFraction temp = new BigFraction(fNumerator, fDenominator);
		return IntegerSym.valueOf(NumberUtil.round(temp, BigDecimal.ROUND_HALF_EVEN));
	}

	/** {@inheritDoc} */
	@Override
	public int sign() {
		return fNumerator < 0 ? -1 : fNumerator == 0 ? 0 : 1;
	}

	/** {@inheritDoc} */
	@Override
	public int toInt() throws ArithmeticException {
		if (fDenominator == 1) {
			return fNumerator;
		}
		if (fNumerator == 0) {
			return 0;
		}
		throw new ArithmeticException("toInt: denominator != 1");
	}

	/** {@inheritDoc} */
	@Override
	public long toLong() throws ArithmeticException {
		if (fDenominator == 1) {
			return fNumerator;
		}
		if (fNumerator == 0) {
			return 0L;
		}
		throw new ArithmeticException("toLong: denominator != 1");
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		try {
			StringBuilder sb = new StringBuilder();
			OutputFormFactory.get().convertFraction(sb, getBigNumerator(), getBigDenominator(), Integer.MIN_VALUE,
					OutputFormFactory.NO_PLUS_CALL);
			return sb.toString();
		} catch (Exception e1) {
		}
		// fall back to simple output format
		return getBigNumerator().toString() + "/" + getBigDenominator().toString();
	}

	private Object writeReplace() throws ObjectStreamException {
		return optional(F.GLOBAL_IDS_MAP.get(this));
	}
}
