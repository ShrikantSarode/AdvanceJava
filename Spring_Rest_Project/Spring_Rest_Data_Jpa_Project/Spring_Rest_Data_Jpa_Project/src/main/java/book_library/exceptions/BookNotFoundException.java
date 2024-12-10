package book_library.exceptions;

public class BookNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3333015630524945558L;
	private int invalidId;

	public BookNotFoundException(String errorMessage, int invalidId) {
		super(errorMessage);
		this.invalidId = invalidId;
	}

	@Override
	public String getMessage() {
		String message = super.getMessage();
		String finalMessage = message + "==>" + invalidId;
		return finalMessage;
	}
}
