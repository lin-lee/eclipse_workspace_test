package parsing.backtrack;


public abstract class RecognitionException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RecognitionException(String msg) {
        super(msg);
    }
}