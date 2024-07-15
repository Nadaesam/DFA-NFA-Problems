package toc.fsa_executor.dfa;

import toc.fsa.DFA;
import toc.fsa_executor.FSAExecutor;

public class StringsContainOddNumberOfXs extends FSAExecutor {

    public StringsContainOddNumberOfXs() {
        this.fsa = new DFA(2, 0, new int[]{1});

        this.fsa.addTransition(0, 0, 'y');
        this.fsa.addTransition(0, 1, 'x');
        this.fsa.addTransition(1, 0, 'x');
        this.fsa.addTransition(1, 1, 'y');

    }
}
