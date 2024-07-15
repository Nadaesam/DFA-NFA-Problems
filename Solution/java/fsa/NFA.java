package toc.fsa;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class NFA extends FSA {
    public static char EPSILON = 'ε';

    /*
     *  src_state -> {
     *    char1 -> {dest_state1, dest_state2, ...}
     *    char2 -> {dest_state1, ...}
     *  }
     * */
    private final Map<Integer, Map<Character, Set<Integer>>> transitions;

    public NFA(int statesLen, int startState, int[] finalStates) {
        super(statesLen, startState, finalStates);
        this.transitions = new HashMap<>();
    }

    @Override
    protected void doAddTransition(int src, int dest, char alphabet) {
        if (!this.transitions.containsKey(src)) {
            this.transitions.put(src, new HashMap<>());
        }

        if (!this.transitions.get(src).containsKey(alphabet)) {
            this.transitions.get(src).put(alphabet, new HashSet<>());
        }

        this.transitions.get(src).get(alphabet).add(dest);
    }

    private boolean isAcceptedRec(String input, int idx, int currState) {
        boolean accepted = idx == input.length() && this.finalStates.contains(currState);

        var epsTransitions = this.transitions.getOrDefault(currState, Map.of()).getOrDefault(NFA.EPSILON, Set.of());

        for (var state : epsTransitions) {
            accepted |= isAcceptedRec(input, idx, state);
        }

        if (idx < input.length()) {
            var currCharTransitions = this.transitions.getOrDefault(currState, Map.of()).getOrDefault(input.charAt(idx), Set.of());

            for (var state : currCharTransitions) {
                accepted |= isAcceptedRec(input, idx + 1, state);
            }
        }

        return accepted;
    }

    @Override
    public boolean isAccepted(String input) {
        return this.isAcceptedRec(input, 0, this.startState);
    }
}
