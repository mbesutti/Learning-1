package ch.gmtech.vacca.learning.seminar.next.test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ch.gmtech.vacca.learning.seminar.next.Course;
import ch.gmtech.vacca.learning.seminar.next.PrintFactory;
import ch.gmtech.vacca.learning.seminar.next.Seminar;
import ch.gmtech.vacca.learning.seminar.next.Student;

public class PrintTest {

	private PrintFactory _printFactory;

	@Before
	public void setUp() {
		Seminar seminar = new Seminar("Zürich", new Course("Computer science", 1, "Lorem ipsum dolor sit amet"));
		seminar.enroll(new Student("Ugo", "Campione"));
		seminar.enroll(new Student("Sandra", "Bach"));
		_printFactory = new PrintFactory(seminar);
	}

	@Test
	public void plain() {
		String expected = "			** Ugo Campione ** \n" +
				"			** Sandra Bach ** \n";
		assertEquals(expected, _printFactory.printPlain());
	}

	@Test
	public void html() {
		String expected = "<html>"+
				"<head>"+
				"<title>Computer science</title>"+
				"</head>"+
				"<body>"+
				"<div>Computer science:</div>"+
				"<ul>"+
				"<li>Lorem ipsum dolor sit amet</li>"+
				"<li>Zürich</li>"+
				"<li>18</li>"+
				"</ul>"+
				"<div>partecipanti:</div>"+
				"<ul>"+
				"<li>Ugo Campione</li>"+
				"<li>Sandra Bach</li>"+
				"</ul>"+
				"</body>"+
				"</html>";
		assertEquals(expected, _printFactory.printHtml());
	}

	@Test
	public void csv() {
		String expected = "\"1\";\"Computer science\";\"Lorem ipsum dolor sit amet\";\"Zürich\";\"18\"\n" +
				"\"Ugo\";\"Campione\"\n" +
				"\"Sandra\";\"Bach\"";
		assertEquals(expected, _printFactory.printCsv());
	}
}
