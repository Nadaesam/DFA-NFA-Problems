package toc.fsa_executor.nfa;

import toc.fsa.NFA;
import toc.fsa_executor.FSAExecutor;

public class StringsContain101Or010NFA extends FSAExecutor {
    public StringsContain101Or010NFA() {
        this.fsa = new NFA(10, 0, new int[]{9});

        this.fsa.addTransition(0, 1, NFA.EPSILON);
        this.fsa.addTransition(1, 1, '0');
        this.fsa.addTransition(1, 1, '1');
        this.fsa.addTransition(1, 2, '1');
        this.fsa.addTransition(2, 3, '0');
        this.fsa.addTransition(3, 4, '1');
        this.fsa.addTransition(4, 4, '0');
        this.fsa.addTransition(4, 4, '1');
        this.fsa.addTransition(4, 9, NFA.EPSILON);

        this.fsa.addTransition(0, 5, NFA.EPSILON);
        this.fsa.addTransition(5, 5, '0');
        this.fsa.addTransition(5, 5, '1');
        this.fsa.addTransition(5, 6, '0');
        this.fsa.addTransition(6, 7, '1');
        this.fsa.addTransition(7, 8, '0');
        this.fsa.addTransition(8, 8, '0');
        this.fsa.addTransition(8, 8, '1');
        this.fsa.addTransition(8, 9, NFA.EPSILON);
    }
}
