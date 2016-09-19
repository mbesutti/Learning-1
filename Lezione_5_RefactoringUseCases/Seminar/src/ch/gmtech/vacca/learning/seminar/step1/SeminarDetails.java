package ch.gmtech.vacca.learning.seminar.step1;

import java.util.Arrays;
import java.util.List;

@Deprecated
public class SeminarDetails {

	public static void main(String[] args) {
		Course course = new Course("Refactoring", "1", "Improving the Design of Existing Code");
		String location = "Manno Suglio";
		Integer seatsLeft = 10;
		Student enrico = new Student("Enrico Mangano");
		Student manlio = new Student("Manlio Modugno");
		Student valentino = new Student("Valentino Decarli");
		Student vacca = new Student("Manlio Vaccalluzzo");
		Student stefano = new Student("Stefano Coluccia");
		Student mattia = new Student("Mattia Cattaneo");
		Student gennaro = new Student("Gennaro Errico");
		Student dario = new Student("Dario Zivko");
		Student alessandro = new Student("Alessandro Misenta");
		Student chicco = new Student("Enrico Mazzi");
		List<Enrollment> enrollments = Arrays.asList(
				new Enrollment(enrico),
				new Enrollment(manlio),
				new Enrollment(valentino),
				new Enrollment(vacca),
				new Enrollment(stefano),
				new Enrollment(mattia),
				new Enrollment(gennaro),
				new Enrollment(dario),
				new Enrollment(alessandro),
				new Enrollment(chicco)
			);
		Seminar seminar = new Seminar(course, location, seatsLeft, enrollments);
		System.out.println("Course: " + seminar.getName());
		System.out.println("Description: " + seminar.getDescription());
		System.out.println("Location: " + seminar.getLocation());
		System.out.println("Seats left: " + seminar.getSeatsLeft());
		System.out.println(seminar.getStudentList());

	}

}
