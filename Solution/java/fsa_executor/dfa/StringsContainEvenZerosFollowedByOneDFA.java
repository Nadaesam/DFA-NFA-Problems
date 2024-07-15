package toc.fsa_executor.dfa;

import toc.fsa.DFA;
import toc.fsa_executor.FSAExecutor;

public class StringsContainEvenZerosFollowedByOneDFA extends FSAExecutor {
    public StringsContainEvenZerosFollowedByOneDFA() {
        this.fsa = new DFA(5, 0, new int[]{3, 4});

        this.fsa.addTransition(0, 1, '0');
        this.fsa.addTransition(1, 2, '0');
        this.fsa.addTransition(2, 1, '0');
        this.fsa.addTransition(2, 3, '1');
        this.fsa.addTransition(3, 1, '0');

        this.fsa.addTransition(0, 4, '1');
        this.fsa.addTransition(4, 4, '1');
        this.fsa.addTransition(4, 1, '0');
    }
}
