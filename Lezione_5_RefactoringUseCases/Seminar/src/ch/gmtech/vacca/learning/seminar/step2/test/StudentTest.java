package ch.gmtech.vacca.learning.seminar.step2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch.gmtech.vacca.learning.seminar.step2.Student;

public class StudentTest {

	@Test
	public void testGetInfo() {
		Student student = new Student("Stefano", "Coluccia");
		assertEquals("Stefano Coluccia", student.getInfo());
	}

}
