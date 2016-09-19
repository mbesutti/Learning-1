package ch.gmtech.vacca.learning.seminar.step1;

@Deprecated
public class Course {

	private String _name;
	private String _number;
	private String _description;
	
	public Course(String name, String number, String description) {
		_name = name;
		_number = number;
		_description = description;
	}

	public String getName() {
		return _name;
	}

	public String getNumber() {
		return _number;
	}

	public String getDescription() {
		return _description;
	}

}
