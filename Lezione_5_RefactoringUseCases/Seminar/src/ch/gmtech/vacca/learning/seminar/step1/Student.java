package ch.gmtech.vacca.learning.seminar.step1;

@Deprecated
public class Student {

	private String _fullName;

	public Student(String fullName) {
		_fullName = fullName;
	}

	public String getInfo() {
		return "Student: " + getFullName();
	}

	public String getFullName() {
		return _fullName;
	}

}
