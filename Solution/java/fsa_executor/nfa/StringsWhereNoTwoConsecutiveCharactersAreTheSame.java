package toc.fsa_executor.nfa;

import toc.fsa.NFA;
import toc.fsa_executor.FSAExecutor;

public class StringsWhereNoTwoConsecutiveCharactersAreTheSame extends FSAExecutor {
    public StringsWhereNoTwoConsecutiveCharactersAreTheSame() {
        this.fsa = new NFA(5, 0, new int[]{1, 2, 3, 4});

        this.fsa.addTransition(0, 1, NFA.EPSILON);
        this.fsa.addTransition(0, 2, NFA.EPSILON);
        this.fsa.addTransition(1, 3, '0');
        this.fsa.addTransition(3, 1, '1');
        this.fsa.addTransition(2, 4, '1');
        this.fsa.addTransition(4, 2, '0');
    }
}
