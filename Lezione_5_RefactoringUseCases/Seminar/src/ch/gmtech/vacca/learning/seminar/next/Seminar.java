package ch.gmtech.vacca.learning.seminar.next;
import java.util.ArrayList;
import java.util.List;


public class Seminar {
	
	private final Course _course;

	private final int _capacity = 20;
	private final String _location;
	private final List<Student> _students = new ArrayList<Student>();
	
	public Seminar(String location, Course course) {
		_course = course;
		_location = location;
	}

	public Course course() {
		return _course;
	}
	
	public String location() {
		return _location;
	}

	public int seatsLeft() {
		return _capacity - _students.size();
	}

	//TODO don't allow enrollment when the capacity is reached
	public void enroll(Student student) {
		_students.add(student);
	}

	//TODO don't permit external manipulations (add/remove)
	public List<Student> students() {
		return _students;
	}
}
