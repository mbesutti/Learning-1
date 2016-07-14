import java.util.ArrayList;
import java.util.Iterator;


public class Seminar {
	
	private Course _course;
	private int _seatsLeft = 20;
	private String _location;
	private ArrayList<Enrollment> _enrollments = new ArrayList<Enrollment>();
	
	public Seminar(String location, Course course) {
		_course = course;
		_location = location;
	}

	public String getName(){
		return _course.getName() + " (" + Integer.toString(_course.getNumber()) + ")";
	}
	
	public String getDescription(){
		return _course.getDescription();
	}
	
	public String getLocation(){
		return _location;
	}

	public int getSeatsLeft(){
		return _seatsLeft;
	}

	public void enroll(Student student) {
		_seatsLeft--;
		_enrollments.add(new Enrollment(student));
	}

	public String getStudentList() {
		String studentList = "";
		Iterator<Enrollment> it = _enrollments.iterator();

		while (it.hasNext()) {
		    studentList= studentList + "			** " + it.next().getInfo() + " ** \n";
		}
		return studentList;
	}

}
