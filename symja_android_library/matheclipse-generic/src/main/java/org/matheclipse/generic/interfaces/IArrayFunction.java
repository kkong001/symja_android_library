package org.matheclipse.generic.interfaces;

import org.matheclipse.core.interfaces.IExpr;

public interface IArrayFunction {
	IExpr evaluate(IExpr[] index);
}
