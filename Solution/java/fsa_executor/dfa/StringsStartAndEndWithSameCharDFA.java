package toc.fsa_executor.dfa;

import toc.fsa.DFA;
import toc.fsa_executor.FSAExecutor;

public class StringsStartAndEndWithSameCharDFA extends FSAExecutor {
    public StringsStartAndEndWithSameCharDFA() {
        this.fsa = new DFA(5, 0, new int[]{2, 4});

        this.fsa.addTransition(0, 1, 'a');
        this.fsa.addTransition(1, 1, 'b');
        this.fsa.addTransition(1, 2, 'a');
        this.fsa.addTransition(2, 2, 'a');
        this.fsa.addTransition(2, 1, 'b');

        this.fsa.addTransition(0, 3, 'b');
        this.fsa.addTransition(3, 3, 'a');
        this.fsa.addTransition(3, 4, 'b');
        this.fsa.addTransition(4, 4, 'b');
        this.fsa.addTransition(4, 3, 'a');
    }
}
