package parsing.backtrack;


public class MismatchedTokenException extends RecognitionException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MismatchedTokenException(String msg) {
        super(msg);
    }
}