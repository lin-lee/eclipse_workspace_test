package parsing.memoize;

import parsing.backtrack.RecognitionException;

public class PreviousParseFailedException extends RecognitionException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PreviousParseFailedException() {
        super(null);
    }
}