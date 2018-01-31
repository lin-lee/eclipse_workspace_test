package parsing.backtrack;

public class NoViableAltException extends RecognitionException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoViableAltException(String msg) {
        super(msg);
    }
}
