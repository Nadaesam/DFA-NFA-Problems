package toc.fsa_executor.dfa;

import toc.fsa.DFA;
import toc.fsa_executor.FSAExecutor;

public class StringsNotContainBaDFA extends FSAExecutor {
    public StringsNotContainBaDFA() {
        this.fsa = new DFA(3, 0, new int[]{0, 1});

        this.fsa.addTransition(0, 0, 'a');
        this.fsa.addTransition(0, 1, 'b');
        this.fsa.addTransition(1, 1, 'b');
        this.fsa.addTransition(1, 2, 'a');
        this.fsa.addTransition(2, 2, 'a');
        this.fsa.addTransition(2, 2, 'b');
    }
}
