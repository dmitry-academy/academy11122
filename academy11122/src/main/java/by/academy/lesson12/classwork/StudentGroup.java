package by.academy.lesson12.classwork;

import java.util.Arrays;

public class StudentGroup {

	private Student[] students;
	private int size;

	public StudentGroup() {
		super();
		this.students = new Student[10];
	}

	public StudentGroup(int capacity) {
		super();
		this.students = new Student[capacity];
	}

	public int size() {
		return size;
	}

	public Student get(int index) {
		if (index < 0 || index > students.length - 1) {
			System.err.println("Index of bound exception");
			return null;
		}
		return students[index];
	}

	public void remove() {
		if (size == 0) {
			System.err.println("Index of bound exception");
			return;
		}
		students[--size] = null;
	}

	public void remove(int index) {
		if (index < 0 || index > students.length - 1) {
			System.err.println("Index of bound exception");
			return;
		}
		System.arraycopy(students, index + 1, students, index, size - index);
		students[--size] = null;
	}

	public void add(Student student) {
		if (size + 1 >= students.length) {
			grow();
		}
		students[size++] = student;
	}

	public void add(int index, Student student) {
		if (index > students.length) {
			System.err.println("Index of bound exception");
			return;
		}
		if (size + 1 >= students.length) {
			grow();
		}
		System.arraycopy(students, index, students, index + 1, size - index);
		students[index] = student;
		size++;
	}

	private void grow() {
		Student[] newStudents = new Student[students.length * 2 + 1];
		System.arraycopy(students, 0, newStudents, 0, students.length);
		students = newStudents;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentGroup [students=");
		builder.append(Arrays.toString(students));
		builder.append("]");
		return builder.toString();
	}

}
