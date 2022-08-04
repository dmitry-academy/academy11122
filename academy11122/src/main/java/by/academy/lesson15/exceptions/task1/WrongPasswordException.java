package by.academy.lesson15.exceptions.task1;

public class WrongPasswordException extends Exception {

	private static final long serialVersionUID = 1L;

	public WrongPasswordException() {
		super();
	}

	public WrongPasswordException(String massage) {
		super(massage);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WrongPasswordException [");
		builder.append(getMessage());
		builder.append("]");
		return builder.toString();
	}

}