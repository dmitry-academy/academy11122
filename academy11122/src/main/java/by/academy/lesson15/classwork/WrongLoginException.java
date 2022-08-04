package by.academy.lesson15.classwork;

public class WrongLoginException extends Exception{

	public WrongLoginException() {
	}
	
	public WrongLoginException(String massage) {
		super(massage);
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
