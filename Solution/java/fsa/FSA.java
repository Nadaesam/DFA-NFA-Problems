package toc.fsa;

import java.util.*;

public abstract class FSA {
    protected int statesLen;
    protected int startState;
    protected Set<Integer> finalStates;

    public FSA(int statesLen, int startState, int[] finalStates) {
        this.statesLen = statesLen;

        if (startState < 0 || startState >= statesLen) {
            throw new IllegalArgumentException("Invalid start state. It must be between 0 and " + (statesLen - 1));
        }

        this.startState = startState;

        if (finalStates == null || finalStates.length == 0) {
            throw new IllegalArgumentException("The \"finalStates\" array cannot be null or empty");
        }

        this.finalStates = new HashSet<>();

        for (int finalState : finalStates) {
            if (finalState < 0 || finalState >= statesLen) {
                throw new IllegalArgumentException("Invalid end state. It must be between 0 and " + (statesLen - 1));
            }

            this.finalStates.add(finalState);
        }
    }

    protected abstract void doAddTransition(int src, int dest, char alphabet);

    public void addTransition(int src, int dest, char alphabet) {
        if (src < 0 || src >= this.statesLen) {
            throw new IllegalArgumentException("Invalid src state. It must be between 0 and " + (statesLen - 1));
        }

        if (dest < 0 || dest >= this.statesLen) {
            throw new IllegalArgumentException("Invalid dest state. It must be between 0 and " + (statesLen - 1));
        }

        this.doAddTransition(src, dest, alphabet);
    }

    public abstract boolean isAccepted(String input);
}
