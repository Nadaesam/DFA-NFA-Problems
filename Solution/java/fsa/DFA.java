package toc.fsa;

import java.util.Map;
import java.util.HashMap;

public class DFA extends FSA {
    /*
     *  src_state -> {
     *    char1 -> dest_state
     *    char2 -> dest_state
     *  }
     * */
    private final Map<Integer, Map<Character, Integer>> transitions;

    public DFA(int statesLen, int startState, int[] finalStates) {
        super(statesLen, startState, finalStates);
        this.transitions = new HashMap<>();
    }

    @Override
    public void doAddTransition(int src, int dest, char alphabet) {
        if (!this.transitions.containsKey(src)) {
            this.transitions.put(src, new HashMap<>());
        }

        this.transitions.get(src).put(alphabet, dest);
    }

    @Override
    public boolean isAccepted(String input) {
        var currState = this.startState;

        for (char c : input.toCharArray()) {
            if (!this.transitions.getOrDefault(currState, Map.of()).containsKey(c)) {
                return false;
            }

            currState = this.transitions.get(currState).get(c);
        }

        return this.finalStates.contains(currState);
    }
}
