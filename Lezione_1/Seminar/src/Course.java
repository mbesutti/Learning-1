
public class Course {
	
	private String _courseName;
	private String _description;
	private int _courseNumber;
	
	public Course(String courseName, int courseNumber, String description) {
		_courseName = courseName;
		_courseNumber = courseNumber;
		_description = description;
	}

	public String getName(){
		return _courseName;
	}
	
	public int getNumber(){
		return _courseNumber;
	}
	
	public String getDescription(){
		return _description;
	}

}
