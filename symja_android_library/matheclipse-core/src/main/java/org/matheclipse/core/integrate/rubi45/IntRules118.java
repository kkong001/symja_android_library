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
public class IntRules118 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),Times(CN1,b,c,n,Int(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x))),And(And(FreeQ(List(a,b,c),x),RationalQ(n)),Greater(n,C0)))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_),x_Symbol),
    Condition(Plus(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),Times(CN1,c,Power(Times(b,Plus(n,C1)),-1),Int(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x))),And(And(FreeQ(List(a,b,c),x),RationalQ(n)),Less(n,CN1)))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_),x_Symbol),
    Condition(Times(CN1,Power(Times(b,c),-1),Subst(Int(Times(Power(x,n),Sinh(Plus(Times(a,Power(b,-1)),Times(CN1,x,Power(b,-1))))),x),x,Plus(a,Times(b,ArcCosh(Times(c,x)))))),FreeQ(List(a,b,c,n),x))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Plus(a,Times(b,ArcCosh(Times(c,x)))),Power(Times(e,Plus(m,C1)),-1)),Times(CN1,b,c,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Times(e,Plus(m,C1),Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x))),And(FreeQ(List(a,b,c,d,e),x),IntegerQ(Plus(m,C1D2))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(e,Plus(m,C1)),-1)),Times(CN1,b,c,n,Power(Times(e,Plus(m,C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,m),x),RationalQ(n)),Greater(n,C0)),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),Times(Power(Times(b,Power(c,Plus(m,C1)),Plus(n,C1)),-1),Subst(Int(ExpandTrigReduce(Times(Power(Plus(a,Times(b,x)),Plus(n,C1)),Power(Cosh(x),Plus(m,Negate(C1))),Plus(m,Times(CN1,Plus(m,C1),Sqr(Cosh(x))))),x),x),x,ArcCosh(Times(c,x))))),And(And(And(FreeQ(List(a,b,c),x),RationalQ(n)),And(LessEqual(CN2,n),Less(n,CN1))),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),Times(m,Power(Times(b,c,Plus(n,C1)),-1),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x)),Times(CN1,c,Plus(m,C1),Power(Times(b,Plus(n,C1)),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x))),And(And(And(FreeQ(List(a,b,c),x),RationalQ(n)),Less(n,CN2)),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(And(And(FreeQ(List(a,b,c,d,e),x),RationalQ(n)),Less(n,CN1)),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Power(c,Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Plus(Times(c,d),Times(e,Cosh(x))),m),Sinh(x)),x),x,ArcCosh(Times(c,x)))),And(And(FreeQ(List(a,b,c,d,e,n),x),IntegerQ(m)),Or(Greater(m,C0),PositiveIntegerQ(n))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,m,n),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(d,Times(e,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(And(And(FreeQ(List(a,b,c,d,e,m),x),IntegerQ(p)),PositiveIntegerQ(n)),Or(PositiveIntegerQ(p),NonzeroQ(a))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(d,Times(e,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,m,n,p),x))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Times(Sqrt(Plus(d_,Times(e_DEFAULT,x_))),Sqrt(Plus(f_,Times(g_DEFAULT,x_)))),-1)),x_Symbol),
    Condition(Times(Power(Times(b,c,Sqrt(d),Sqrt(Negate(f))),-1),Subst(Int(Power(x,n),x),x,Plus(a,Times(b,ArcCosh(Times(c,x)))))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveQ(d)),NegativeQ(f)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Plus(Times(C2,p),C1),-1)),Times(CN1,b,c,n,Sqrt(d),Sqrt(Negate(f)),Power(Plus(Times(C2,p),C1),-1),Int(Times(x,Power(Plus(d,Times(e,x)),Plus(p,Negate(C1D2))),Power(Plus(f,Times(g,x)),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x)),Times(C2,d,f,p,Power(Plus(Times(C2,p),C1),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(p,Negate(C1))),Power(Plus(f,Times(g,x)),Plus(p,Negate(C1))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),RationalQ(n)),Greater(n,C0)),Greater(p,C0)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Times(Plus(d_,Times(e_DEFAULT,x_)),Plus(f_,Times(g_DEFAULT,x_))),-1)),x_Symbol),
    Condition(Times(CN1,Power(Times(c,d,f),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Csch(x)),x),x,ArcCosh(Times(c,x)))),And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveQ(d)),NegativeQ(f)),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),QQ(3L,2L)),Power(Plus(f_,Times(g_DEFAULT,x_)),QQ(3L,2L))),-1)),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(d,f,Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x)))),-1)),Times(CN1,b,c,n,Power(Times(Sqrt(d),Sqrt(Negate(f))),-1),Int(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(Plus(d,Times(e,x)),Plus(f,Times(g,x))),-1)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveQ(d)),NegativeQ(f)),RationalQ(n)),Greater(n,C0)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,x,Power(Plus(d,Times(e,x)),Plus(p,C1)),Power(Plus(f,Times(g,x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(C2,d,f,Plus(p,C1)),-1)),Times(CN1,b,c,n,Power(Times(C2,Sqrt(d),Sqrt(Negate(f)),Plus(p,C1)),-1),Int(Times(x,Power(Plus(d,Times(e,x)),Plus(p,C1D2)),Power(Plus(f,Times(g,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x)),Times(Plus(Times(C2,p),C3),Power(Times(C2,d,f,Plus(p,C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(p,C1)),Power(Plus(f,Times(g,x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),RationalQ(n)),Greater(n,C0)),Less(p,CN1)),Unequal(p,QQ(-2L,3L))))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,x)),Plus(p,C1D2)),Power(Plus(f,Times(g,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Sqrt(Negate(f)),Plus(n,C1)),-1)),Times(CN1,e,g,Plus(Times(C2,p),C1),Power(Times(b,c,Sqrt(d),Sqrt(Negate(f)),Plus(n,C1)),-1),Int(Times(x,Power(Plus(d,Times(e,x)),Plus(p,Negate(C1D2))),Power(Plus(f,Times(g,x)),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),RationalQ(n)),Less(n,CN1)),Unequal(p,CN1D2)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,p),Power(Negate(f),p),Power(c,-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Sinh(x),Plus(Times(C2,p),C1))),x),x,ArcCosh(Times(c,x)))),And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveIntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,p),Power(Negate(f),p),Int(Times(Power(Plus(C1,Times(c,x)),p),Power(Plus(CN1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(p)),Not(And(PositiveQ(d),NegativeQ(f)))))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,Plus(p,Negate(C1D2))),Power(Negate(f),Plus(p,Negate(C1D2))),Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x))),Power(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),-1),Int(Times(Power(Plus(C1,Times(c,x)),p),Power(Plus(CN1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveIntegerQ(Plus(p,C1D2))),Not(And(PositiveQ(d),NegativeQ(f)))))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,Plus(p,C1D2)),Power(Negate(f),Plus(p,C1D2)),Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x))),Power(Times(Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x)))),-1),Int(Times(Power(Plus(C1,Times(c,x)),p),Power(Plus(CN1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),NegativeIntegerQ(Plus(p,Negate(C1D2)))),Not(And(PositiveQ(d),NegativeQ(f)))))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcCosh(Times(c,x)))),u,x),Times(CN1,b,c,Int(SimplifyIntegrand(Times(u,Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),PositiveIntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcCosh(Times(c,x)))),u,x),Times(CN1,b,c,Int(Dist(Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1),u,x),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),NegativeIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,f,g,n,p),x))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Power(Plus(d,Times(e,Sqr(x))),p),x)))),Plus(Dist(Plus(a,Times(b,ArcCosh(Times(c,x)))),u,x),Times(CN1,b,c,Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x),x)))),And(FreeQ(List(a,b,c,d,e),x),Or(PositiveIntegerQ(p),NegativeIntegerQ(Plus(p,C1D2)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(d,Times(CN1,c,d,x)),p),Power(Plus(C1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(Sqrt(Plus(d,Times(CN1,c,d,x))),Sqrt(Plus(C1,Times(c,x)))),-1),Int(Times(Power(Plus(d,Times(CN1,c,d,x)),p),Power(Plus(C1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x)),And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(Sqrt(Plus(d,Times(CN1,c,d,x))),Sqrt(Plus(C1,Times(c,x))),Power(Plus(d,Times(e,Sqr(x))),CN1D2),Int(Times(Power(Plus(d,Times(CN1,c,d,x)),p),Power(Plus(C1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x)),And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),NegativeIntegerQ(Plus(p,Negate(C1D2)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),PositiveIntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(Sqrt(d),Times(CN1,Sqrt(Negate(e)),x)),p),Power(Plus(Sqrt(d),Times(Sqrt(Negate(e)),x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(And(FreeQ(List(a,b,c,d,e,n),x),NegativeIntegerQ(p)),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,n,p),x))),
ISetDelayed(Int(Times(x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,x)),Plus(p,C1)),Power(Plus(f,Times(g,x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(C2,e,g,Plus(p,C1)),-1)),Times(CN1,b,n,Power(Times(C2,c,Sqrt(d),Sqrt(Negate(f)),Plus(p,C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(p,C1D2)),Power(Plus(f,Times(g,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),RationalQ(n)),Greater(n,C0)),Unequal(p,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Plus(m,C1),-1)),Times(CN1,b,c,Sqrt(d),Sqrt(Negate(f)),n,Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,x)),Plus(p,Negate(C1D2))),Power(Plus(f,Times(g,x)),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x)),Times(CN1,C2,e,g,p,Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,x)),Plus(p,Negate(C1))),Power(Plus(f,Times(g,x)),Plus(p,Negate(C1))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),RationalQ(m,n)),Greater(n,C0)),Greater(p,C0)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Plus(m,Times(C2,p),C1),-1)),Times(CN1,b,c,n,Sqrt(d),Sqrt(Negate(f)),Power(Plus(m,Times(C2,p),C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,x)),Plus(p,Negate(C1D2))),Power(Plus(f,Times(g,x)),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x)),Times(C2,d,f,p,Power(Plus(m,Times(C2,p),C1),-1),Int(Times(Power(x,m),Power(Plus(d,Times(e,x)),Plus(p,Negate(C1))),Power(Plus(f,Times(g,x)),Plus(p,Negate(C1))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),RationalQ(m,n)),Greater(n,C0)),Greater(p,C0)),Unequal(Plus(m,Times(C2,p),C1),C0)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,x)),Plus(p,C1)),Power(Plus(f,Times(g,x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(d,f,Plus(m,C1)),-1)),Times(b,c,n,Power(Times(Sqrt(d),Sqrt(Negate(f)),Plus(m,C1)),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,x)),Plus(p,C1D2)),Power(Plus(f,Times(g,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x))),And(And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),RationalQ(m,n)),Greater(n,C0)),Less(p,C0)),Unequal(m,CN1)),Equal(Plus(m,Times(C2,p),C3),C0)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Times(Plus(d_,Times(e_DEFAULT,x_)),Plus(f_,Times(g_DEFAULT,x_))),-1)),x_Symbol),
    Condition(Times(CN1,Power(Times(Power(c,Plus(m,C1)),d),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Cosh(x),m),Csch(x)),x),x,ArcCosh(Times(c,x)))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveQ(d)),NegativeQ(f)),PositiveIntegerQ(n)),IntegerQ(m)),Equal(Sqr(m),C1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(d,Times(e,x)),Plus(p,C1)),Power(Plus(f,Times(g,x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(e,g,Plus(m,Times(C2,p),C1)),-1)),Times(CN1,b,c,Sqrt(d),Sqrt(Negate(f)),n,Power(Times(e,g,Plus(m,Times(C2,p),C1)),-1),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(d,Times(e,x)),Plus(p,C1D2)),Power(Plus(f,Times(g,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x)),Times(Plus(m,Negate(C1)),Power(Times(Sqr(c),Plus(m,Times(C2,p),C1)),-1),Int(Times(Power(x,Plus(m,Negate(C2))),Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),RationalQ(m,n)),Greater(n,C0)),And(LessEqual(CN1,p),Less(p,C0))),Greater(m,C1)),NonzeroQ(Plus(m,Times(C2,p),C1))))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(d,Times(e,x)),Plus(p,C1)),Power(Plus(f,Times(g,x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(C2,e,g,Plus(p,C1)),-1)),Times(CN1,b,n,Power(Times(C2,c,Sqrt(d),Sqrt(Negate(f)),Plus(p,C1)),-1),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(d,Times(e,x)),Plus(p,C1D2)),Power(Plus(f,Times(g,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x)),Times(CN1,Plus(m,Negate(C1)),Power(Times(C2,e,g,Plus(p,C1)),-1),Int(Times(Power(x,Plus(m,Negate(C2))),Power(Plus(d,Times(e,x)),Plus(p,C1)),Power(Plus(f,Times(g,x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),RationalQ(m,n)),Greater(n,C0)),Less(p,CN1)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Times(x_,Sqrt(Plus(d_,Times(e_DEFAULT,x_))),Sqrt(Plus(f_,Times(g_DEFAULT,x_)))),-1),ArcCosh(Times(c_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Times(CN2,ArcCosh(Times(c,x)),ArcTan(Plus(Times(c,x),Times(CN1,Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))))),Power(Times(Sqrt(d),Sqrt(Negate(f))),-1)),Times(CI,PolyLog(C2,Times(CI,Plus(Times(c,x),Times(CN1,Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x))))))),Power(Times(Sqrt(d),Sqrt(Negate(f))),-1)),Times(CN1,CI,PolyLog(C2,Times(CI,Plus(Times(CN1,c,x),Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x))))))),Power(Times(Sqrt(d),Sqrt(Negate(f))),-1))),And(And(And(And(FreeQ(List(c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveQ(d)),NegativeQ(f)))),
ISetDelayed(Int(Times(Plus(a_,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),Power(Times(x_,Sqrt(Plus(d_,Times(e_DEFAULT,x_))),Sqrt(Plus(f_,Times(g_DEFAULT,x_)))),-1)),x_Symbol),
    Condition(Plus(Times(a,Int(Power(Times(x,Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x)))),-1),x)),Times(b,Int(Times(ArcCosh(Times(c,x)),Power(Times(x,Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x)))),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveQ(d)),NegativeQ(f)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_),Power(x_,-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Sqr(c),Int(Times(x,Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x)),Times(Power(Times(d,f),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(p,C1)),Power(Plus(f,Times(g,x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(x,-1)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),RationalQ(n)),Greater(n,C0)),Less(p,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,x)),Plus(p,C1)),Power(Plus(f,Times(g,x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(d,f,Plus(m,C1)),-1)),Times(b,c,n,Power(Times(Sqrt(d),Sqrt(Negate(f)),Plus(m,C1)),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,x)),Plus(p,C1D2)),Power(Plus(f,Times(g,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x)),Times(Sqr(c),Plus(m,Times(C2,p),C3),Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x))),And(And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),RationalQ(m,n)),Greater(n,C0)),Less(p,C0)),Less(m,CN1)),Unequal(Plus(m,Times(C2,p),C3),C0)))),
ISetDelayed(Int(Times(Power(x_,m_),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),Power(Times(Sqrt(Plus(d_,Times(e_DEFAULT,x_))),Sqrt(Plus(f_,Times(g_DEFAULT,x_)))),-1)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Plus(a,Times(b,ArcCosh(Times(c,x)))),Hypergeometric2F1(C1D2,Times(C1D2,Plus(C1,m)),Times(C1D2,Plus(C3,m)),Times(Sqr(c),Sqr(x))),Power(Times(Plus(m,C1),Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x)))),-1)),Times(b,c,Power(x,Plus(m,C2)),HypergeometricPFQ(List(C1,Plus(C1,Times(C1D2,m)),Plus(C1,Times(C1D2,m))),List(Plus(QQ(3L,2L),Times(C1D2,m)),Plus(C2,Times(C1D2,m))),Times(Sqr(c),Sqr(x))),Power(Times(Sqrt(d),Sqrt(Negate(f)),Plus(m,C1),Plus(m,C2)),-1))),And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveQ(d)),NegativeQ(f)),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_),Power(Times(Sqrt(Plus(d_,Times(e_DEFAULT,x_))),Sqrt(Plus(f_,Times(g_DEFAULT,x_)))),-1)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Sqrt(Negate(f)),Plus(n,C1)),-1)),Times(CN1,m,Power(Times(b,c,Sqrt(d),Sqrt(Negate(f)),Plus(n,C1)),-1),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,m),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveQ(d)),NegativeQ(f)),RationalQ(n)),Less(n,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(d,Times(e,x)),Plus(p,C1D2)),Power(Plus(f,Times(g,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Sqrt(Negate(f)),Plus(n,C1)),-1)),Times(m,Sqrt(d),Sqrt(Negate(f)),Power(Times(b,c,Plus(n,C1)),-1),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(d,Times(e,x)),Plus(p,Negate(C1D2))),Power(Plus(f,Times(g,x)),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),RationalQ(m,n)),Less(n,CN1)),Equal(Plus(m,Times(C2,p),C1),C0)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,m),Power(Plus(d,Times(e,x)),Plus(p,C1D2)),Power(Plus(f,Times(g,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Sqrt(Negate(f)),Plus(n,C1)),-1)),Times(m,Sqrt(d),Sqrt(Negate(f)),Power(Times(b,c,Plus(n,C1)),-1),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(d,Times(e,x)),Plus(p,Negate(C1D2))),Power(Plus(f,Times(g,x)),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x)),Times(CN1,c,Sqrt(d),Sqrt(Negate(f)),Plus(m,Times(C2,p),C1),Power(Times(b,Plus(n,C1)),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,x)),Plus(p,Negate(C1D2))),Power(Plus(f,Times(g,x)),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),RationalQ(m,n)),Less(n,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Plus(Times(Power(Times(d,f),-1),Int(Times(Power(x,m),Power(Plus(d,Times(e,x)),Plus(p,C1)),Power(Plus(f,Times(g,x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x)),Times(CN1,e,g,Power(Times(d,f),-1),Int(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),NegativeIntegerQ(Plus(p,C1D2))),PositiveQ(d)),NegativeQ(f)),NegativeIntegerQ(Times(C1D2,Plus(m,Negate(C1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Times(Sqrt(Plus(d_,Times(e_DEFAULT,x_))),Sqrt(Plus(f_,Times(g_DEFAULT,x_)))),-1)),x_Symbol),
    Condition(Times(Power(Times(Power(c,Plus(m,C1)),Sqrt(d),Sqrt(Negate(f))),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Cosh(x),m)),x),x,ArcCosh(Times(c,x)))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveQ(d)),NegativeQ(f)),IntegerQ(m)),Or(Greater(m,C0),PositiveIntegerQ(n))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,p),Power(Negate(f),p),Power(Power(c,Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Cosh(x),m),Power(Sinh(x),Plus(Times(C2,p),C1))),x),x,ArcCosh(Times(c,x)))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveIntegerQ(Times(C2,p))),PositiveQ(d)),NegativeQ(f)),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x)))),-1)),Times(Power(x,m),Power(Plus(d,Times(e,x)),Plus(p,C1D2)),Power(Plus(f,Times(g,x)),Plus(p,C1D2))),x),x),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveIntegerQ(Plus(p,C1D2))),PositiveQ(d)),NegativeQ(f)),Not(PositiveIntegerQ(Times(C1D2,Plus(m,C1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,p),Power(Negate(f),p),Int(Times(Power(x,m),Power(Plus(C1,Times(c,x)),p),Power(Plus(CN1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),IntegerQ(p)),Not(And(PositiveQ(d),NegativeQ(f)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Times(Power(d,Plus(p,Negate(C1D2))),Power(Negate(f),Plus(p,Negate(C1D2))),Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x))),Power(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),-1),Int(Times(Power(x,m),Power(Plus(C1,Times(c,x)),p),Power(Plus(CN1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),PositiveIntegerQ(Plus(p,C1D2))),Not(And(PositiveQ(d),NegativeQ(f)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),p_)),x_Symbol),
    Condition(Times(Power(d,Plus(p,C1D2)),Power(Negate(f),Plus(p,C1D2)),Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x))),Power(Times(Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x)))),-1),Int(Times(Power(x,m),Power(Plus(C1,Times(c,x)),p),Power(Plus(CN1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(e,Times(CN1,c,d)))),ZeroQ(Plus(g,Times(c,f)))),NegativeIntegerQ(Plus(p,Negate(C1D2)))),Not(And(PositiveQ(d),NegativeQ(f)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),PositiveIntegerQ(p)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(d,Times(e,x)),p),Power(Plus(f,Times(g,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,f,g,m,n,p),x))),
ISetDelayed(Int(Times(x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCosh(Times(c,x)))),Power(Times(C2,e,Plus(p,C1)),-1)),Times(CN1,b,c,Power(Times(C2,e,Plus(p,C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x))),And(FreeQ(List(a,b,c,d,e,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcCosh(Times(c,x)))),u,x),Times(CN1,b,c,Int(SimplifyIntegrand(Times(u,Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,e,m,p),x),Or(Or(And(PositiveIntegerQ(p),Not(And(NegativeIntegerQ(Times(C1D2,Plus(m,Negate(C1)))),Greater(Plus(m,Times(C2,p),C3),C0)))),And(PositiveIntegerQ(Times(C1D2,Plus(m,C1))),Not(And(NegativeIntegerQ(p),Greater(Plus(m,Times(C2,p),C3),C0))))),And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(C2,p),C1))),Not(NegativeIntegerQ(Times(C1D2,Plus(m,Negate(C1)))))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(d,Times(CN1,c,d,x)),p),Power(Plus(C1,Times(c,x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(p))))
  );
}
