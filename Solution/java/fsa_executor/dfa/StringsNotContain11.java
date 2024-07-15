package toc.fsa_executor.dfa;

import toc.fsa.DFA;
import toc.fsa_executor.FSAExecutor;

public class StringsNotContain11 extends FSAExecutor {
    public StringsNotContain11(){
        this.fsa = new DFA(5, 0, new int[]{1, 4});

        this.fsa.addTransition(0, 1, '1');
        this.fsa.addTransition(0, 4, '0');
        this.fsa.addTransition(1, 2, '1');
        this.fsa.addTransition(1, 4, '0');
        this.fsa.addTransition(2, 3, '1');
        this.fsa.addTransition(2, 4, '0');
        this.fsa.addTransition(3, 4, '0');
        this.fsa.addTransition(3, 4, '1');
        this.fsa.addTransition(4, 4, '0');
        this.fsa.addTransition(4, 4, '1');
    }
}
