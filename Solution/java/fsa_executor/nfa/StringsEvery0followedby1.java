package toc.fsa_executor.nfa;

import toc.fsa.NFA;
import toc.fsa_executor.FSAExecutor;

public class StringsEvery0followedby1 extends FSAExecutor {
    public StringsEvery0followedby1(){
        this.fsa = new NFA(3, 0, new int[]{0,2});

        this.fsa.addTransition(0, 0, '1');
        this.fsa.addTransition(0, 1, '0');
        this.fsa.addTransition(1, 1, '1');
        this.fsa.addTransition(1, 2, '1');
        this.fsa.addTransition(2, 1, '0');
    }
}
