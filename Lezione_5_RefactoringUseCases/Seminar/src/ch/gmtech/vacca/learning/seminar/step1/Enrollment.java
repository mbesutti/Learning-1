package ch.gmtech.vacca.learning.seminar.step1;

@Deprecated
public class Enrollment {

	private Student _student;

	public Enrollment(Student student) {
		_student = student;
	}

	public String getInfo() {
		return _student.getInfo() + " is enrolled.";
	}

}
