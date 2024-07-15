package toc;

import toc.fsa_executor.FSAExecutor;

import toc.fsa_executor.dfa.*;
import toc.fsa_executor.nfa.*;

public class FSAExecutorFactor {
    private final Integer fsaId;

    public FSAExecutorFactor(Integer regexId) {
        this.fsaId = regexId;
    }

    public FSAExecutor getFSAExecutor() {
        return switch (this.fsaId) {
            case 1 -> new StringsNotContainBaDFA();
            case 2 -> new StringsContainEvenZerosFollowedByOneDFA();
            case 3 -> new StringsContainOddNumberOfXs();
            case 4 -> new StringsStartAndEndWithSameCharDFA();
            case 5 -> new BinaryStringsDivisibleBy4DFA();
            case 6 -> new StringsNotContain11();
            case 7 -> new StringsWithEqualOccurrenceOf01And10NFA();
            case 8 -> new StringsContain101Or010NFA();
            case 9 -> new StringsWhereNoTwoConsecutiveCharactersAreTheSame();
            case 10 -> new StringsEvery0followedby1();
            default -> null;
        };
    }
}
