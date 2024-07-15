package toc.fsa_executor.nfa;

import toc.fsa.NFA;
import toc.fsa_executor.FSAExecutor;

public class StringsWithEqualOccurrenceOf01And10NFA extends FSAExecutor {
    public StringsWithEqualOccurrenceOf01And10NFA() {
        this.fsa = new NFA(8, 0, new int[]{0, 7});

        this.fsa.addTransition(0, 1, NFA.EPSILON);
        this.fsa.addTransition(1, 2, '0');
        this.fsa.addTransition(2, 2, '0');
        this.fsa.addTransition(2, 3, '1');
        this.fsa.addTransition(3, 3, '1');
        this.fsa.addTransition(3, 2, '0');
        this.fsa.addTransition(2, 7, NFA.EPSILON);

        this.fsa.addTransition(0, 4, NFA.EPSILON);
        this.fsa.addTransition(4, 5, '1');
        this.fsa.addTransition(5, 5, '1');
        this.fsa.addTransition(5, 6, '0');
        this.fsa.addTransition(6, 6, '0');
        this.fsa.addTransition(6, 5, '1');
        this.fsa.addTransition(5, 7, NFA.EPSILON);
    }
}
