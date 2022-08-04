package by.academy.lesson15.classwork;

public class CatException extends Exception {

	private static final long serialVersionUID = 1L;

	private int detail;

	public CatException(int detail, String message) {
		super(message);
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "CatException{" + "detail=" + detail + ", message=" + getMessage() + "} ";
	}
}