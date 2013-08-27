package org.matheclipse.generic.nested;

import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;

public class Generating {
	final private IAST fOuterList;

	final private IAST fInnerList;

	final private int fHeadOffset;

	public Generating(IAST outerList, IAST innerList, int headOffset) {
		this.fOuterList = outerList;
		this.fInnerList = innerList;
		this.fHeadOffset = headOffset;
	}

	/**
	 * Outer product - every element from the first list will be combined with the second list
	 * 
	 */
	public IAST outer(IAST first, IAST second) {
		IAST result1 = fOuterList.clone();
		IAST result2;
		IAST temp;
		for (int i = fHeadOffset; i < first.size(); i++) {

			if (first.get(i).isAST()) {
				result1.add(outer(first.get(i), second));
			} else {
				result2 = fOuterList.clone();
				for (int j = fHeadOffset; j < second.size(); j++) {

					if (second.get(j).isAST()) {
						result2.add(outer(first.get(i), (IAST) second.get(j)));
					} else {
						temp = fInnerList.clone();
						temp.add(first.get(i));
						temp.add(second.get(j));
						result2.add(temp);
					}
				}
				result1.add(result2);
			}
		}

		return result1;
	}

	private IAST outer(IExpr element, IAST second) {
		IAST result = fOuterList.clone();
		IAST temp;
		for (int j = fHeadOffset; j < second.size(); j++) {

			if (second.get(j).isAST()) {
				result.add(outer(element, (IAST) second.get(j)));
			} else {
				temp = fInnerList.clone();
				temp.add(element);
				temp.add(second.get(j));
				result.add(temp);
			}
		}

		return result;
	}

}
