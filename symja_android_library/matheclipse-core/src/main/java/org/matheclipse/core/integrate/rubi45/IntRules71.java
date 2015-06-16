package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules71 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),QQ(3L,2L))),x_Symbol),
    Condition(Times(d,Sqrt(Times(d,Cos(Plus(e,Times(f,x))))),Sqrt(Times(d,Sec(Plus(e,Times(f,x))))),Int(Power(Times(Sqrt(Times(d,Cos(Plus(e,Times(f,x))))),Plus(b,Times(a,Cos(Plus(e,Times(f,x)))))),-1),x)),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),QQ(3L,2L))),x_Symbol),
    Condition(Times(d,Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Int(Power(Times(Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Plus(b,Times(a,Sin(Plus(e,Times(f,x)))))),-1),x)),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),QQ(5L,2L))),x_Symbol),
    Condition(Plus(Times(d,Power(b,-1),Int(Power(Times(d,Sec(Plus(e,Times(f,x)))),QQ(3L,2L)),x)),Times(CN1,a,d,Power(b,-1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),-1)),x))),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),QQ(5L,2L))),x_Symbol),
    Condition(Plus(Times(d,Power(b,-1),Int(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),x)),Times(CN1,a,d,Power(b,-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),-1)),x))),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1),x_Symbol),
    Condition(Plus(Times(Sqr(b),Power(Times(Sqr(a),Sqr(d)),-1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),-1)),x)),Times(Power(a,-2),Int(Times(Plus(a,Times(CN1,b,Sec(Plus(e,Times(f,x))))),Power(Times(d,Sec(Plus(e,Times(f,x)))),CN1D2)),x))),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1),x_Symbol),
    Condition(Plus(Times(Sqr(b),Power(Times(Sqr(a),Sqr(d)),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),-1)),x)),Times(Power(a,-2),Int(Times(Plus(a,Times(CN1,b,Csc(Plus(e,Times(f,x))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x))),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,Tan(Plus(e,Times(f,x))),Power(Times(d,Sec(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),-1)),Times(CN1,Power(Times(a,d,n),-1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),-1),Simp(Plus(Times(b,n),Times(CN1,a,Plus(n,C1),Sec(Plus(e,Times(f,x)))),Times(CN1,b,Plus(n,C1),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),LessEqual(n,CN1)),IntegerQ(Times(C2,n))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(Cot(Plus(e,Times(f,x))),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),-1)),Times(CN1,Power(Times(a,d,n),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),-1),Simp(Plus(Times(b,n),Times(CN1,a,Plus(n,C1),Csc(Plus(e,Times(f,x)))),Times(CN1,b,Plus(n,C1),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),LessEqual(n,CN1)),IntegerQ(Times(C2,n))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(a,Int(Times(Sqrt(Times(d,Sec(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x)),Times(b,Power(d,-1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x))),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(a,Int(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x)),Times(b,Power(d,-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x))),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(C2,d,Sin(Plus(e,Times(f,x))),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x)))))),Power(Times(f,Plus(Times(C2,n),Negate(C1))),-1)),Times(Sqr(d),Power(Plus(Times(C2,n),Negate(C1)),-1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Simp(Plus(Times(C2,a,Plus(n,Negate(C2))),Times(b,Plus(Times(C2,n),Negate(C3)),Sec(Plus(e,Times(f,x)))),Times(a,Sqr(Sec(Plus(e,Times(f,x)))))),x),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Greater(n,C1)),IntegerQ(Times(C2,n))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(CN2,d,Cos(Plus(e,Times(f,x))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(f,Plus(Times(C2,n),Negate(C1))),-1)),Times(Sqr(d),Power(Plus(Times(C2,n),Negate(C1)),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Simp(Plus(Times(C2,a,Plus(n,Negate(C2))),Times(b,Plus(Times(C2,n),Negate(C3)),Csc(Plus(e,Times(f,x)))),Times(a,Sqr(Csc(Plus(e,Times(f,x)))))),x),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Greater(n,C1)),IntegerQ(Times(C2,n))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x)))))),Power(Times(Sqrt(Times(d,Sec(Plus(e,Times(f,x))))),Sqrt(Plus(b,Times(a,Cos(Plus(e,Times(f,x))))))),-1),Int(Sqrt(Plus(b,Times(a,Cos(Plus(e,Times(f,x)))))),x)),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))))),-1),Int(Sqrt(Plus(b,Times(a,Sin(Plus(e,Times(f,x)))))),x)),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,Tan(Plus(e,Times(f,x))),Power(Times(d,Sec(Plus(e,Times(f,x)))),n),Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x)))))),Power(Times(f,n),-1)),Times(CN1,Power(Times(C2,d,n),-1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(b,Times(CN1,C2,a,Plus(n,C1),Sec(Plus(e,Times(f,x)))),Times(CN1,b,Plus(Times(C2,n),C3),Sqr(Sec(Plus(e,Times(f,x)))))),x),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),LessEqual(n,CN1)),IntegerQ(Times(C2,n))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(Cot(Plus(e,Times(f,x))),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(f,n),-1)),Times(CN1,Power(Times(C2,d,n),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(b,Times(CN1,C2,a,Plus(n,C1),Csc(Plus(e,Times(f,x)))),Times(CN1,b,Plus(Times(C2,n),C3),Sqr(Csc(Plus(e,Times(f,x)))))),x),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),LessEqual(n,CN1)),IntegerQ(Times(C2,n))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2),Sqrt(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Times(Sqrt(Times(d,Sec(Plus(e,Times(f,x))))),Sqrt(Plus(b,Times(a,Cos(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2),Int(Power(Plus(b,Times(a,Cos(Plus(e,Times(f,x))))),CN1D2),x)),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2),Sqrt(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(b,Times(a,Sin(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2),Int(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),CN1D2),x)),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),QQ(3L,2L))),x_Symbol),
    Condition(Times(d,Sqrt(Times(d,Sec(Plus(e,Times(f,x))))),Sqrt(Plus(b,Times(a,Cos(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2),Int(Times(Sec(Plus(e,Times(f,x))),Power(Plus(b,Times(a,Cos(Plus(e,Times(f,x))))),CN1D2)),x)),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),QQ(3L,2L))),x_Symbol),
    Condition(Times(d,Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(b,Times(a,Sin(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),CN1D2)),x)),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(C2,Sqr(d),Sin(Plus(e,Times(f,x))),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x)))))),Power(Times(b,f,Plus(Times(C2,n),Negate(C3))),-1)),Times(Power(d,3),Power(Times(b,Plus(Times(C2,n),Negate(C3))),-1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C3))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2),Simp(Plus(Times(C2,a,Plus(n,Negate(C3))),Times(b,Plus(Times(C2,n),Negate(C5)),Sec(Plus(e,Times(f,x)))),Times(CN1,C2,a,Plus(n,Negate(C2)),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Greater(n,C2)),IntegerQ(Times(C2,n))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(CN2,Sqr(d),Cos(Plus(e,Times(f,x))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(b,f,Plus(Times(C2,n),Negate(C3))),-1)),Times(Power(d,3),Power(Times(b,Plus(Times(C2,n),Negate(C3))),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C3))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2),Simp(Plus(Times(C2,a,Plus(n,Negate(C3))),Times(b,Plus(Times(C2,n),Negate(C5)),Csc(Plus(e,Times(f,x)))),Times(CN1,C2,a,Plus(n,Negate(C2)),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Greater(n,C2)),IntegerQ(Times(C2,n))))),
ISetDelayed(Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),-1),x_Symbol),
    Condition(Plus(Times(Sin(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x)))))),Power(Times(a,f),-1)),Times(CN1,b,Power(Times(C2,a),-1),Int(Times(Plus(C1,Sqr(Sec(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x))),And(FreeQ(List(a,b,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),-1),x_Symbol),
    Condition(Plus(Times(CN1,Cos(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(a,f),-1)),Times(CN1,b,Power(Times(C2,a),-1),Int(Times(Plus(C1,Sqr(Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x))),And(FreeQ(List(a,b,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1),x_Symbol),
    Condition(Plus(Times(Power(a,-1),Int(Times(Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x)))))),Power(Times(d,Sec(Plus(e,Times(f,x)))),CN1D2)),x)),Times(CN1,b,Power(Times(a,d),-1),Int(Times(Sqrt(Times(d,Sec(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x))),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1),x_Symbol),
    Condition(Plus(Times(Power(a,-1),Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x)),Times(CN1,b,Power(Times(a,d),-1),Int(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x))),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,Sin(Plus(e,Times(f,x))),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x)))))),Power(Times(a,d,f,n),-1)),Times(Power(Times(C2,a,d,n),-1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2),Simp(Plus(Times(CN1,b,Plus(Times(C2,n),C1)),Times(C2,a,Plus(n,C1),Sec(Plus(e,Times(f,x)))),Times(b,Plus(Times(C2,n),C3),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Less(n,CN1)),IntegerQ(Times(C2,n))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(Cos(Plus(e,Times(f,x))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(a,d,f,n),-1)),Times(Power(Times(C2,a,d,n),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2),Simp(Plus(Times(CN1,b,Plus(Times(C2,n),C1)),Times(C2,a,Plus(n,C1),Csc(Plus(e,Times(f,x)))),Times(b,Plus(Times(C2,n),C3),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Less(n,CN1)),IntegerQ(Times(C2,n))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),QQ(3L,2L)),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,a,Tan(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x)))))),Power(Times(d,Sec(Plus(e,Times(f,x)))),n),Power(Times(f,n),-1)),Times(Power(Times(C2,d,n),-1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2),Simp(Plus(Times(a,b,Plus(Times(C2,n),Negate(C1))),Times(C2,Plus(Times(Sqr(b),n),Times(Sqr(a),Plus(n,C1))),Sec(Plus(e,Times(f,x)))),Times(a,b,Plus(Times(C2,n),C3),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),LessEqual(n,CN1)),IntegersQ(Times(C2,n))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),QQ(3L,2L)),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(a,Cot(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(f,n),-1)),Times(Power(Times(C2,d,n),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2),Simp(Plus(Times(a,b,Plus(Times(C2,n),Negate(C1))),Times(C2,Plus(Times(Sqr(b),n),Times(Sqr(a),Plus(n,C1))),Csc(Plus(e,Times(f,x)))),Times(a,b,Plus(Times(C2,n),C3),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),LessEqual(n,CN1)),IntegersQ(Times(C2,n))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(Power(d,3),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C3))),Power(Times(b,f,Plus(m,n,Negate(C1))),-1)),Times(Power(d,3),Power(Times(b,Plus(m,n,Negate(C1))),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C3))),Simp(Plus(Times(a,Plus(n,Negate(C3))),Times(b,Plus(m,n,Negate(C2)),Sec(Plus(e,Times(f,x)))),Times(CN1,a,Plus(n,Negate(C2)),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,d,e,f,m),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Greater(n,C3)),Or(IntegerQ(n),IntegersQ(Times(C2,m),Times(C2,n)))),Not(And(IntegerQ(m),Greater(m,C2)))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(d,3),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C3))),Power(Times(b,f,Plus(m,n,Negate(C1))),-1)),Times(Power(d,3),Power(Times(b,Plus(m,n,Negate(C1))),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C3))),Simp(Plus(Times(a,Plus(n,Negate(C3))),Times(b,Plus(m,n,Negate(C2)),Csc(Plus(e,Times(f,x)))),Times(CN1,a,Plus(n,Negate(C2)),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,d,e,f,m),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Greater(n,C3)),Or(IntegerQ(n),IntegersQ(Times(C2,m),Times(C2,n)))),Not(And(IntegerQ(m),Greater(m,C2)))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(b,d,Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,Plus(m,n,Negate(C1))),-1)),Times(d,Power(Plus(m,n,Negate(C1)),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,Negate(C2))),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Simp(Plus(Times(a,b,Plus(n,Negate(C1))),Times(Plus(Times(Sqr(b),Plus(m,n,Negate(C2))),Times(Sqr(a),Plus(m,n,Negate(C1)))),Sec(Plus(e,Times(f,x)))),Times(a,b,Plus(Times(C2,m),n,Negate(C2)),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m,n)),Less(Less(C0,m),C2)),Less(Less(C0,n),C3)),NonzeroQ(Plus(m,n,Negate(C1)))),Or(IntegerQ(m),IntegersQ(Times(C2,m),Times(C2,n)))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,b,d,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,Plus(m,n,Negate(C1))),-1)),Times(d,Power(Plus(m,n,Negate(C1)),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C2))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Simp(Plus(Times(a,b,Plus(n,Negate(C1))),Times(Plus(Times(Sqr(b),Plus(m,n,Negate(C2))),Times(Sqr(a),Plus(m,n,Negate(C1)))),Csc(Plus(e,Times(f,x)))),Times(a,b,Plus(Times(C2,m),n,Negate(C2)),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m,n)),Less(Less(C0,m),C2)),Less(Less(C0,n),C3)),NonzeroQ(Plus(m,n,Negate(C1)))),Or(IntegerQ(m),IntegersQ(Times(C2,m),Times(C2,n)))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(Sqr(d),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Power(Times(f,Plus(m,n,Negate(C1))),-1)),Times(Sqr(d),Power(Times(b,Plus(m,n,Negate(C1))),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Simp(Plus(Times(a,b,Plus(n,Negate(C2))),Times(Sqr(b),Plus(m,n,Negate(C2)),Sec(Plus(e,Times(f,x)))),Times(a,b,m,Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m,n)),Less(Less(C1,n),C3)),Less(Less(CN1,m),C2)),NonzeroQ(Plus(m,n,Negate(C1)))),Or(IntegerQ(n),IntegersQ(Times(C2,m),Times(C2,n)))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,Sqr(d),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Power(Times(f,Plus(m,n,Negate(C1))),-1)),Times(Sqr(d),Power(Times(b,Plus(m,n,Negate(C1))),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Simp(Plus(Times(a,b,Plus(n,Negate(C2))),Times(Sqr(b),Plus(m,n,Negate(C2)),Csc(Plus(e,Times(f,x)))),Times(a,b,m,Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m,n)),Less(Less(C1,n),C3)),Less(Less(CN1,m),C2)),NonzeroQ(Plus(m,n,Negate(C1)))),Or(IntegerQ(n),IntegersQ(Times(C2,m),Times(C2,n)))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),QQ(3L,2L)),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2)),x_Symbol),
    Condition(Plus(Times(a,Int(Times(Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x)))))),Power(Times(d,Sec(Plus(e,Times(f,x)))),CN1D2)),x)),Times(b,Power(d,-1),Int(Times(Sqrt(Times(d,Sec(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))))),x))),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),QQ(3L,2L)),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2)),x_Symbol),
    Condition(Plus(Times(a,Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x)),Times(b,Power(d,-1),Int(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),x))),And(FreeQ(List(a,b,d,e,f),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(b,Power(d,-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,C1))),x)),Times(a,Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Sec(Plus(e,Times(f,x)))),n)),x))),And(FreeQ(List(a,b,d,e,f,n),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(b,Power(d,-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1))),x)),Times(a,Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Csc(Plus(e,Times(f,x)))),n)),x))),And(FreeQ(List(a,b,d,e,f,n),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),n)),x),And(FreeQ(List(a,b,d,e,f,m,n),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),n)),x),And(FreeQ(List(a,b,d,e,f,m,n),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b)))))))
  );
}
