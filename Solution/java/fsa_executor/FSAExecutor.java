package toc.fsa_executor;

import toc.fsa.FSA;

public abstract class FSAExecutor {
    protected FSA fsa;

    public boolean execute(String input) {
        if (this.fsa == null) {
            throw new NullPointerException("FSA is null, Please assign FSA first!");
        }

        return this.fsa.isAccepted(input);
    }
}
