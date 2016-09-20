package ch.gmtech.vacca.learning.seminar.next;

public class Course {
	
	private final String _name;
	private final Integer _number;
	private final String _description;
	private final String _date;

	public Course(String courseName, Integer courseNumber, String description, String date) {
		_name = courseName;
		_number = courseNumber;
		_description = description;
		_date = date;
	}

	public String description(){
		return _description;
	}

	public String name() {
		return _name;
	}

	public String date() {
		return _date;
	}

	public Integer number() {
		return _number;
	}
}