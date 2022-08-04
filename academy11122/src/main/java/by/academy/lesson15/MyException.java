package by.academy.lesson15;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	private int detail;

	public MyException(int detail, String message) {
		super(message);
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "MyException{" + "detail=" + detail + ", message=" + getMessage() + "} ";
	}
}
