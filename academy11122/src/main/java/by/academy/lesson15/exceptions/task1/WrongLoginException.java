package by.academy.lesson15.exceptions.task1;

public class WrongLoginException extends Exception {

	private static final long serialVersionUID = 1L;

	public WrongLoginException() {
		super();
	}

	public WrongLoginException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WrongLoginException [");
		builder.append(getMessage());
		builder.append("]");
		return builder.toString();
	}

}
