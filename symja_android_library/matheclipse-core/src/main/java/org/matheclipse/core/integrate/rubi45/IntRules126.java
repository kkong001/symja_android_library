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
public class IntRules126 { 
  public static IAST RULES = List( 
ISetDelayed(Int(ArcSech(Times(c_DEFAULT,x_)),x_Symbol),
    Condition(Plus(Times(x,ArcSech(Times(c,x))),Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Power(Plus(C1,Times(c,x)),-1)),Int(Power(Times(Sqrt(Plus(C1,Times(CN1,c,x))),Sqrt(Plus(C1,Times(c,x)))),-1),x))),FreeQ(c,x))),
ISetDelayed(Int(ArcCsch(Times(c_DEFAULT,x_)),x_Symbol),
    Condition(Plus(Times(x,ArcCsch(Times(c,x))),Times(Power(c,-1),Int(Power(Times(x,Sqrt(Plus(C1,Power(Times(Sqr(c),Sqr(x)),-1)))),-1),x))),FreeQ(c,x))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),n_),x_Symbol),
    Condition(Times(CN1,Power(c,-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Sech(x),Tanh(x)),x),x,ArcSech(Times(c,x)))),FreeQ(List(a,b,c,n),x))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),n_),x_Symbol),
    Condition(Times(CN1,Power(c,-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Csch(x),Coth(x)),x),x,ArcCsch(Times(c,x)))),FreeQ(List(a,b,c,n),x))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),Power(x_,-1)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Plus(a,Times(b,ArcCosh(Times(x,Power(c,-1))))),Power(x,-1)),x),x,Power(x,-1))),FreeQ(List(a,b,c),x))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),Power(x_,-1)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Plus(a,Times(b,ArcSinh(Times(x,Power(c,-1))))),Power(x,-1)),x),x,Power(x,-1))),FreeQ(List(a,b,c),x))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(a,Times(b,ArcSech(Times(c,x)))),Power(Plus(m,C1),-1)),Times(b,Sqrt(Plus(C1,Times(c,x))),Power(Plus(m,C1),-1),Sqrt(Power(Plus(C1,Times(c,x)),-1)),Int(Times(Power(x,m),Power(Times(Sqrt(Plus(C1,Times(CN1,c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x))),And(FreeQ(List(a,b,c,m),x),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(a,Times(b,ArcCsch(Times(c,x)))),Power(Plus(m,C1),-1)),Times(b,Power(Times(c,Plus(m,C1)),-1),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(C1,Power(Times(Sqr(c),Sqr(x)),-1)),CN1D2)),x))),And(FreeQ(List(a,b,c,m),x),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Times(CN1,Power(Power(c,Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Sech(x),Plus(m,C1)),Tanh(x)),x),x,ArcSech(Times(c,x)))),And(FreeQ(List(a,b,c,n),x),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Times(CN1,Power(Power(c,Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Csch(x),Plus(m,C1)),Coth(x)),x),x,ArcCsch(Times(c,x)))),And(FreeQ(List(a,b,c,n),x),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(a,Times(b,ArcSech(Times(c,x)))),n)),x),FreeQ(List(a,b,c,m,n),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(a,Times(b,ArcCsch(Times(c,x)))),n)),x),FreeQ(List(a,b,c,m,n),x))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Power(Plus(d,Times(e,Sqr(x))),p),x)))),Plus(Dist(Plus(a,Times(b,ArcSech(Times(c,x)))),u,x),Times(b,Sqrt(Plus(C1,Times(c,x))),Sqrt(Power(Plus(C1,Times(c,x)),-1)),Int(SimplifyIntegrand(Times(u,Power(Times(x,Sqrt(Plus(C1,Times(CN1,c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,e),x),Or(PositiveIntegerQ(p),NegativeIntegerQ(Plus(p,C1D2)))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Power(Plus(d,Times(e,Sqr(x))),p),x)))),Plus(Dist(Plus(a,Times(b,ArcCsch(Times(c,x)))),u,x),Times(CN1,b,c,x,Power(Times(CN1,Sqr(c),Sqr(x)),CN1D2),Int(SimplifyIntegrand(Times(u,Power(Times(x,Sqrt(Plus(CN1,Times(CN1,Sqr(c),Sqr(x))))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,e),x),Or(PositiveIntegerQ(p),NegativeIntegerQ(Plus(p,C1D2)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCosh(Times(x,Power(c,-1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,d,e,n),x),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(x,Power(c,-1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,d,e,n),x),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(CN1,Sqrt(Sqr(x)),Power(x,-1),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCosh(Times(x,Power(c,-1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),-1)),x),x,Power(x,-1))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Plus(p,C1D2))),PositiveQ(e)),Negative(d)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(CN1,Sqrt(Sqr(x)),Power(x,-1),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(x,Power(c,-1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),-1)),x),x,Power(x,-1))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),IntegerQ(Plus(p,C1D2))),PositiveQ(e)),Negative(d)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(CN1,Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(x,Sqrt(Plus(e,Times(d,Power(x,-2))))),-1),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCosh(Times(x,Power(c,-1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),-1)),x),x,Power(x,-1))),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(Plus(p,C1D2))),Not(And(PositiveQ(e),Negative(d)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(CN1,Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(x,Sqrt(Plus(e,Times(d,Power(x,-2))))),-1),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(x,Power(c,-1))))),n),Power(Power(x,Times(C2,Plus(p,C1))),-1)),x),x,Power(x,-1))),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),IntegerQ(Plus(p,C1D2))),Not(And(PositiveQ(e),Negative(d)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSech(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,n,p),x))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCsch(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,n,p),x))),
ISetDelayed(Int(Times(x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcSech(Times(c,x)))),Power(Times(C2,e,Plus(p,C1)),-1)),Times(b,Sqrt(Plus(C1,Times(c,x))),Power(Times(C2,e,Plus(p,C1)),-1),Sqrt(Power(Plus(C1,Times(c,x)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Times(x,Sqrt(Plus(C1,Times(CN1,c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x))),And(FreeQ(List(a,b,c,d,e,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCsch(Times(c,x)))),Power(Times(C2,e,Plus(p,C1)),-1)),Times(CN1,b,c,x,Power(Times(C2,e,Plus(p,C1),Sqrt(Times(CN1,Sqr(c),Sqr(x)))),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Times(x,Sqrt(Plus(CN1,Times(CN1,Sqr(c),Sqr(x))))),-1)),x))),And(FreeQ(List(a,b,c,d,e,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcSech(Times(c,x)))),u,x),Times(b,Sqrt(Plus(C1,Times(c,x))),Sqrt(Power(Plus(C1,Times(c,x)),-1)),Int(SimplifyIntegrand(Times(u,Power(Times(x,Sqrt(Plus(C1,Times(CN1,c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,e,m,p),x),Or(Or(And(PositiveIntegerQ(p),Not(And(NegativeIntegerQ(Times(C1D2,Plus(m,Negate(C1)))),Greater(Plus(m,Times(C2,p),C3),C0)))),And(PositiveIntegerQ(Times(C1D2,Plus(m,C1))),Not(And(NegativeIntegerQ(p),Greater(Plus(m,Times(C2,p),C3),C0))))),And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(C2,p),C1))),Not(NegativeIntegerQ(Times(C1D2,Plus(m,Negate(C1)))))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p)),x)))),Plus(Dist(Plus(a,Times(b,ArcCsch(Times(c,x)))),u,x),Times(CN1,b,c,x,Power(Times(CN1,Sqr(c),Sqr(x)),CN1D2),Int(SimplifyIntegrand(Times(u,Power(Times(x,Sqrt(Plus(CN1,Times(CN1,Sqr(c),Sqr(x))))),-1)),x),x)))),And(FreeQ(List(a,b,c,d,e,m,p),x),Or(Or(And(PositiveIntegerQ(p),Not(And(NegativeIntegerQ(Times(C1D2,Plus(m,Negate(C1)))),Greater(Plus(m,Times(C2,p),C3),C0)))),And(PositiveIntegerQ(Times(C1D2,Plus(m,C1))),Not(And(NegativeIntegerQ(p),Greater(Plus(m,Times(C2,p),C3),C0))))),And(NegativeIntegerQ(Times(C1D2,Plus(m,Times(C2,p),C1))),Not(NegativeIntegerQ(Times(C1D2,Plus(m,Negate(C1)))))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCosh(Times(x,Power(c,-1))))),n),Power(Power(x,Plus(m,Times(C2,Plus(p,C1)))),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,d,e,n),x),IntegersQ(m,p)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(x,Power(c,-1))))),n),Power(Power(x,Plus(m,Times(C2,Plus(p,C1)))),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,b,c,d,e,n),x),IntegersQ(m,p)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Sqrt(Sqr(x)),Power(x,-1),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCosh(Times(x,Power(c,-1))))),n),Power(Power(x,Plus(m,Times(C2,Plus(p,C1)))),-1)),x),x,Power(x,-1))),And(And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(m)),IntegerQ(Plus(p,C1D2))),PositiveQ(e)),Negative(d)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Sqrt(Sqr(x)),Power(x,-1),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(x,Power(c,-1))))),n),Power(Power(x,Plus(m,Times(C2,Plus(p,C1)))),-1)),x),x,Power(x,-1))),And(And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),IntegerQ(m)),IntegerQ(Plus(p,C1D2))),PositiveQ(e)),Negative(d)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(x,Sqrt(Plus(e,Times(d,Power(x,-2))))),-1),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcCosh(Times(x,Power(c,-1))))),n),Power(Power(x,Plus(m,Times(C2,Plus(p,C1)))),-1)),x),x,Power(x,-1))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),IntegerQ(m)),IntegerQ(Plus(p,C1D2))),Not(And(PositiveQ(e),Negative(d)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(x,Sqrt(Plus(e,Times(d,Power(x,-2))))),-1),Subst(Int(Times(Power(Plus(e,Times(d,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(x,Power(c,-1))))),n),Power(Power(x,Plus(m,Times(C2,Plus(p,C1)))),-1)),x),x,Power(x,-1))),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(e,Times(CN1,Sqr(c),d)))),IntegerQ(m)),IntegerQ(Plus(p,C1D2))),Not(And(PositiveQ(e),Negative(d)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSech(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,m,n,p),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCsch(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,m,n,p),x))),
ISetDelayed(Int(ArcSech(Plus(a_,Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Times(Plus(a,Times(b,x)),ArcSech(Plus(a,Times(b,x))),Power(b,-1)),Int(Times(Sqrt(Times(Plus(C1,Negate(a),Times(CN1,b,x)),Power(Plus(C1,a,Times(b,x)),-1))),Power(Plus(C1,Negate(a),Times(CN1,b,x)),-1)),x)),FreeQ(List(a,b),x))),
ISetDelayed(Int(ArcCsch(Plus(a_,Times(b_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Times(Plus(a,Times(b,x)),ArcCsch(Plus(a,Times(b,x))),Power(b,-1)),Int(Power(Times(Plus(a,Times(b,x)),Sqrt(Plus(C1,Power(Plus(a,Times(b,x)),-2)))),-1),x)),FreeQ(List(a,b),x))),
ISetDelayed(Int(Power(ArcSech(Plus(a_,Times(b_DEFAULT,x_))),n_),x_Symbol),
    Condition(Times(CN1,Power(b,-1),Subst(Int(Times(Power(x,n),Sech(x),Tanh(x)),x),x,ArcSech(Plus(a,Times(b,x))))),FreeQ(List(a,b,n),x))),
ISetDelayed(Int(Power(ArcCsch(Plus(a_,Times(b_DEFAULT,x_))),n_),x_Symbol),
    Condition(Times(CN1,Power(b,-1),Subst(Int(Times(Power(x,n),Csch(x),Coth(x)),x),x,ArcCsch(Plus(a,Times(b,x))))),FreeQ(List(a,b,n),x))),
ISetDelayed(Int(Times(Power(x_,-1),ArcSech(Plus(a_,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN1,ArcSech(Plus(a,Times(b,x))),Log(Plus(C1,Power(E,Times(CN2,ArcSech(Plus(a,Times(b,x)))))))),Times(ArcSech(Plus(a,Times(b,x))),Log(Plus(C1,Times(CN1,Plus(C1,Negate(Sqrt(Plus(C1,Negate(Sqr(a)))))),Power(Times(Power(E,ArcSech(Plus(a,Times(b,x)))),a),-1))))),Times(ArcSech(Plus(a,Times(b,x))),Log(Plus(C1,Times(CN1,Plus(C1,Sqrt(Plus(C1,Negate(Sqr(a))))),Power(Times(Power(E,ArcSech(Plus(a,Times(b,x)))),a),-1))))),Times(C1D2,PolyLog(C2,Negate(Power(E,Times(CN2,ArcSech(Plus(a,Times(b,x)))))))),Negate(PolyLog(C2,Times(Plus(C1,Negate(Sqrt(Plus(C1,Negate(Sqr(a)))))),Power(Times(Power(E,ArcSech(Plus(a,Times(b,x)))),a),-1)))),Negate(PolyLog(C2,Times(Plus(C1,Sqrt(Plus(C1,Negate(Sqr(a))))),Power(Times(Power(E,ArcSech(Plus(a,Times(b,x)))),a),-1))))),FreeQ(List(a,b),x))),
ISetDelayed(Int(Times(Power(x_,-1),ArcCsch(Plus(a_,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Negate(Sqr(ArcCsch(Plus(a,Times(b,x))))),Times(CN1,ArcCsch(Plus(a,Times(b,x))),Log(Plus(C1,Negate(Power(E,Times(CN2,ArcCsch(Plus(a,Times(b,x))))))))),Times(ArcCsch(Plus(a,Times(b,x))),Log(Plus(C1,Times(Plus(C1,Negate(Sqrt(Plus(C1,Sqr(a))))),Power(E,ArcCsch(Plus(a,Times(b,x)))),Power(a,-1))))),Times(ArcCsch(Plus(a,Times(b,x))),Log(Plus(C1,Times(Plus(C1,Sqrt(Plus(C1,Sqr(a)))),Power(E,ArcCsch(Plus(a,Times(b,x)))),Power(a,-1))))),Times(C1D2,PolyLog(C2,Power(E,Times(CN2,ArcCsch(Plus(a,Times(b,x))))))),PolyLog(C2,Times(CN1,Plus(C1,Negate(Sqrt(Plus(C1,Sqr(a))))),Power(E,ArcCsch(Plus(a,Times(b,x)))),Power(a,-1))),PolyLog(C2,Times(CN1,Plus(C1,Sqrt(Plus(C1,Sqr(a)))),Power(E,ArcCsch(Plus(a,Times(b,x)))),Power(a,-1)))),FreeQ(List(a,b),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),ArcSech(Plus(a_,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Power(Negate(a),Plus(m,C1)),Times(CN1,Power(b,Plus(m,C1)),Power(x,Plus(m,C1)))),ArcSech(Plus(a,Times(b,x))),Power(Times(Power(b,Plus(m,C1)),Plus(m,C1)),-1)),Times(Power(Times(Power(b,Plus(m,C1)),Plus(m,C1)),-1),Subst(Int(Times(Plus(Power(Times(CN1,a,x),Plus(m,C1)),Negate(Power(Plus(C1,Times(CN1,a,x)),Plus(m,C1)))),Power(Times(Power(x,Plus(m,C1)),Sqrt(Plus(CN1,x)),Sqrt(Plus(C1,x))),-1)),x),x,Power(Plus(a,Times(b,x)),-1)))),And(And(FreeQ(List(a,b,m),x),IntegerQ(m)),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),ArcCsch(Plus(a_,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Power(Negate(a),Plus(m,C1)),Times(CN1,Power(b,Plus(m,C1)),Power(x,Plus(m,C1)))),ArcCsch(Plus(a,Times(b,x))),Power(Times(Power(b,Plus(m,C1)),Plus(m,C1)),-1)),Times(Power(Times(Power(b,Plus(m,C1)),Plus(m,C1)),-1),Subst(Int(Times(Plus(Power(Times(CN1,a,x),Plus(m,C1)),Negate(Power(Plus(C1,Times(CN1,a,x)),Plus(m,C1)))),Power(Times(Power(x,Plus(m,C1)),Sqrt(Plus(C1,Sqr(x)))),-1)),x),x,Power(Plus(a,Times(b,x)),-1)))),And(And(FreeQ(List(a,b,m),x),IntegerQ(m)),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(ArcSech(Plus(a_,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Times(CN1,Power(Power(b,Plus(m,C1)),-1),Subst(Int(Times(Power(x,n),Power(Plus(Negate(a),Sech(x)),m),Sech(x),Tanh(x)),x),x,ArcSech(Plus(a,Times(b,x))))),And(FreeQ(List(a,b,n),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(ArcCsch(Plus(a_,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Times(CN1,Power(Power(b,Plus(m,C1)),-1),Subst(Int(Times(Power(x,n),Power(Plus(Negate(a),Csch(x)),m),Csch(x),Coth(x)),x),x,ArcCsch(Plus(a,Times(b,x))))),And(FreeQ(List(a,b,n),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(ArcSech(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),-1))),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(ArcCosh(Plus(Times(a,Power(c,-1)),Times(b,Power(x,n),Power(c,-1)))),m)),x),FreeQ(List(a,b,c,n,m),x))),
ISetDelayed(Int(Times(u_DEFAULT,Power(ArcCsch(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),-1))),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(ArcSinh(Plus(Times(a,Power(c,-1)),Times(b,Power(x,n),Power(c,-1)))),m)),x),FreeQ(List(a,b,c,n,m),x))),
ISetDelayed(Int(Power(E,ArcSech(Times(a_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Times(x,Power(E,ArcSech(Times(a,x)))),Times(Log(x),Power(a,-1)),Times(Power(a,-1),Int(Times(Power(Times(x,Plus(C1,Times(CN1,a,x))),-1),Sqrt(Times(Plus(C1,Times(CN1,a,x)),Power(Plus(C1,Times(a,x)),-1)))),x))),FreeQ(a,x))),
ISetDelayed(Int(Power(E,ArcSech(Times(a_DEFAULT,Power(x_,p_)))),x_Symbol),
    Condition(Plus(Times(x,Power(E,ArcSech(Times(a,Power(x,p))))),Times(p,Power(a,-1),Int(Power(Power(x,p),-1),x)),Times(p,Sqrt(Plus(C1,Times(a,Power(x,p)))),Power(a,-1),Sqrt(Power(Plus(C1,Times(a,Power(x,p))),-1)),Int(Power(Times(Power(x,p),Sqrt(Plus(C1,Times(a,Power(x,p)))),Sqrt(Plus(C1,Times(CN1,a,Power(x,p))))),-1),x))),FreeQ(List(a,p),x))),
ISetDelayed(Int(Power(E,ArcCsch(Times(a_DEFAULT,Power(x_,p_DEFAULT)))),x_Symbol),
    Condition(Plus(Times(Power(a,-1),Int(Power(Power(x,p),-1),x)),Int(Sqrt(Plus(C1,Power(Times(Sqr(a),Power(x,Times(C2,p))),-1))),x)),FreeQ(List(a,p),x))),
ISetDelayed(Int(Power(E,Times(n_DEFAULT,ArcSech(u_))),x_Symbol),
    Condition(Int(Power(Plus(Power(u,-1),Sqrt(Times(Plus(C1,Negate(u)),Power(Plus(C1,u),-1))),Times(Power(u,-1),Sqrt(Times(Plus(C1,Negate(u)),Power(Plus(C1,u),-1))))),n),x),IntegerQ(n))),
ISetDelayed(Int(Power(E,Times(n_DEFAULT,ArcCsch(u_))),x_Symbol),
    Condition(Int(Power(Plus(Power(u,-1),Sqrt(Plus(C1,Power(u,-2)))),n),x),IntegerQ(n))),
ISetDelayed(Int(Times(Power(E,ArcSech(Times(a_DEFAULT,Power(x_,p_DEFAULT)))),Power(x_,-1)),x_Symbol),
    Condition(Plus(Negate(Power(Times(a,p,Power(x,p)),-1)),Times(Sqrt(Plus(C1,Times(a,Power(x,p)))),Power(a,-1),Sqrt(Power(Plus(C1,Times(a,Power(x,p))),-1)),Int(Times(Sqrt(Plus(C1,Times(a,Power(x,p)))),Sqrt(Plus(C1,Times(CN1,a,Power(x,p)))),Power(Power(x,Plus(p,C1)),-1)),x))),FreeQ(List(a,p),x))),
ISetDelayed(Int(Times(Power(E,ArcSech(Times(a_DEFAULT,Power(x_,p_DEFAULT)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(E,ArcSech(Times(a,Power(x,p)))),Power(Plus(m,C1),-1)),Times(p,Power(Times(a,Plus(m,C1)),-1),Int(Power(x,Plus(m,Negate(p))),x)),Times(p,Sqrt(Plus(C1,Times(a,Power(x,p)))),Power(Times(a,Plus(m,C1)),-1),Sqrt(Power(Plus(C1,Times(a,Power(x,p))),-1)),Int(Times(Power(x,Plus(m,Negate(p))),Power(Times(Sqrt(Plus(C1,Times(a,Power(x,p)))),Sqrt(Plus(C1,Times(CN1,a,Power(x,p))))),-1)),x))),And(FreeQ(List(a,m,p),x),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(E,ArcCsch(Times(a_DEFAULT,Power(x_,p_DEFAULT)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(a,-1),Int(Power(x,Plus(m,Negate(p))),x)),Int(Times(Power(x,m),Sqrt(Plus(C1,Power(Times(Sqr(a),Power(x,Times(C2,p))),-1)))),x)),FreeQ(List(a,m,p),x))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcSech(u_))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(Power(u,-1),Sqrt(Times(Plus(C1,Negate(u)),Power(Plus(C1,u),-1))),Times(Power(u,-1),Sqrt(Times(Plus(C1,Negate(u)),Power(Plus(C1,u),-1))))),n)),x),And(FreeQ(m,x),IntegerQ(n)))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcCsch(u_))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(Power(u,-1),Sqrt(Plus(C1,Power(u,-2)))),n)),x),And(FreeQ(m,x),IntegerQ(n)))),
ISetDelayed(Int(ArcSech(u_),x_Symbol),
    Condition(Plus(Times(x,ArcSech(u)),Times(Sqrt(Plus(C1,Negate(Sqr(u)))),Power(Times(u,Sqrt(Plus(CN1,Power(u,-1))),Sqrt(Plus(C1,Power(u,-1)))),-1),Int(SimplifyIntegrand(Times(x,D(u,x),Power(Times(u,Sqrt(Plus(C1,Negate(Sqr(u))))),-1)),x),x))),And(InverseFunctionFreeQ(u,x),Not(FunctionOfExponentialQ(u,x))))),
ISetDelayed(Int(ArcCsch(u_),x_Symbol),
    Condition(Plus(Times(x,ArcCsch(u)),Times(CN1,u,Power(Negate(Sqr(u)),CN1D2),Int(SimplifyIntegrand(Times(x,D(u,x),Power(Times(u,Sqrt(Plus(CN1,Negate(Sqr(u))))),-1)),x),x))),And(InverseFunctionFreeQ(u,x),Not(FunctionOfExponentialQ(u,x))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSech(u_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Plus(a,Times(b,ArcSech(u))),Power(Times(d,Plus(m,C1)),-1)),Times(b,Sqrt(Plus(C1,Negate(Sqr(u)))),Power(Times(d,Plus(m,C1),u,Sqrt(Plus(CN1,Power(u,-1))),Sqrt(Plus(C1,Power(u,-1)))),-1),Int(SimplifyIntegrand(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),D(u,x),Power(Times(u,Sqrt(Plus(C1,Negate(Sqr(u))))),-1)),x),x))),And(And(And(And(FreeQ(List(a,b,c,d,m),x),NonzeroQ(Plus(m,C1))),InverseFunctionFreeQ(u,x)),Not(FunctionOfQ(Power(Plus(c,Times(d,x)),Plus(m,C1)),u,x))),Not(FunctionOfExponentialQ(u,x))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCsch(u_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Plus(a,Times(b,ArcCsch(u))),Power(Times(d,Plus(m,C1)),-1)),Times(CN1,b,u,Power(Times(d,Plus(m,C1),Sqrt(Negate(Sqr(u)))),-1),Int(SimplifyIntegrand(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),D(u,x),Power(Times(u,Sqrt(Plus(CN1,Negate(Sqr(u))))),-1)),x),x))),And(And(And(And(FreeQ(List(a,b,c,d,m),x),NonzeroQ(Plus(m,C1))),InverseFunctionFreeQ(u,x)),Not(FunctionOfQ(Power(Plus(c,Times(d,x)),Plus(m,C1)),u,x))),Not(FunctionOfExponentialQ(u,x)))))
  );
}
