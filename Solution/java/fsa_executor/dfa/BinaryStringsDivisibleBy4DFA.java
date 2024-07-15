package toc.fsa_executor.dfa;

import toc.fsa.DFA;
import toc.fsa_executor.FSAExecutor;

public class BinaryStringsDivisibleBy4DFA extends FSAExecutor {
    public BinaryStringsDivisibleBy4DFA() {
        this.fsa = new DFA(4, 0, new int[]{3});

        this.fsa.addTransition(0, 1, '1');
        this.fsa.addTransition(1, 1, '1');
        this.fsa.addTransition(1, 2, '0');
        this.fsa.addTransition(2, 3, '0');

        this.fsa.addTransition(0, 3, '0');
        this.fsa.addTransition(3, 3, '0');
    }
}
