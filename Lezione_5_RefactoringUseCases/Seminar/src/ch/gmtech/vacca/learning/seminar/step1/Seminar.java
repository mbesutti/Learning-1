package ch.gmtech.vacca.learning.seminar.step1;

import java.util.List;

@Deprecated
public class Seminar {

	private Course _course;
	private String _location;
	private Integer _seatsLeft;
	private List<Enrollment> _enrollments;

	public Seminar(Course course, String location, Integer seatsLeft, List<Enrollment> enrollments) {
		_course = course;
		_location = location;
		_seatsLeft = seatsLeft;
		_enrollments = enrollments;
	}

	public String getName() {
		String courseName = _course.getName();
		String courseNumber = _course.getNumber();

		return courseName + " (" + courseNumber + ")";
	}

	public String getDescription() {
		return _course.getDescription();
	}

	public String getLocation() {
		return _location;
	}

	public Integer getSeatsLeft() {
		return _seatsLeft;
	}

	public String getStudentList() {
		String studentList = "";
		for (Enrollment enrollment : _enrollments) {
			studentList += enrollment.getInfo() + "\n";
		}

		return studentList;
	}

}
