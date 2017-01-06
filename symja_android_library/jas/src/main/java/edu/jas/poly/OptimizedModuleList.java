/*
 * $Id: OptimizedModuleList.java 5086 2015-01-29 23:10:21Z kredel $
 */

package edu.jas.poly;


import java.util.List;

import edu.jas.structure.RingElem;


/**
 * Container for optimization results.
 * @author Heinz Kredel
 */

public class OptimizedModuleList<C extends RingElem<C>> extends ModuleList<C> {


    /**
     * Permutation vector used to optimize term order.
     */
    public final List<Integer> perm;


    /**
     * Constructor.
     */
    public OptimizedModuleList(List<Integer> P, GenPolynomialRing<C> R, List<List<GenPolynomial<C>>> L) {
        super(R, L);
        perm = P;
    }


    /**
     * String representation.
     */
    @Override
    public String toString() {
        return "permutation = " + perm + "\n" + super.toString();
    }


    /**
     * Comparison with any other object.
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object B) {
        if (!(B instanceof OptimizedModuleList)) {
            return false;
        }
        return super.equals(B);
    }

}
