package by.academy.lesson6.object;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String fullName;
	private int age;
	private boolean retired;

	public Person() {
		super();
	}

	public Person(String fullName, int age, boolean retired) {
		this.fullName = fullName;
		this.age = age;
		this.retired = retired;
	}

	public String getFullName() {
		return fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isRetired() {
		return retired;
	}

	public void setRetired(boolean retired) {
		this.retired = retired;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + (retired ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (retired != other.retired)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [fullName=");
		builder.append(fullName);
		builder.append(", age=");
		builder.append(age);
		builder.append(", retired=");
		builder.append(retired);
		builder.append("]");
		return builder.toString();
	}

}