package ch.gmtech.vacca.learning.seminar.next;

public class PrintFactory {

	private final Seminar _seminar;

	public PrintFactory(Seminar seminar) {
		_seminar = seminar;
	}

	public String printPlain() {

		String studentList = "";

		for (Student student : _seminar.students()) {
			studentList +=  "			** " + student.name() + " " + student.lastname() + " ** \n";
		}
		return studentList;
	}

	public String printHtml() {

		String head = "<head><title>" + _seminar.course().name() + "</title></head>";

		String courseDetails = "<div>" + _seminar.course().name() + ":</div>" +
				"<ul>" +
					"<li>" + _seminar.course().description() + "</li>" +
					"<li>" + _seminar.location() + "</li>" +
					"<li>" + _seminar.seatsLeft() + "</li>" +
				"</ul>";

		String studentList = "<div>partecipanti:</div>"
				+ "<ul>";
		for (Student student : _seminar.students()) {
			studentList +=  "<li>" + student.name() + " " + student.lastname() + "</li>";
		}
		studentList += "</ul>";

		return "<html>" +
			head +
			"<body>" +
			courseDetails +
			studentList +
			"</body>" +
			"</html>";
	}

	public String printCsv() {
		String studentList = "";
		for (Student student : _seminar.students()) {
			studentList +=  quote(student.name()) + ";" + quote(student.lastname()) + System.getProperty("line.separator");
		}
		studentList = studentList.substring(0, studentList.lastIndexOf(System.getProperty("line.separator")));

		return quote(_seminar.course().number()) + ";" +
				quote(_seminar.course().name()) + ";" +
				quote(_seminar.course().description()) + ";" +
				quote(_seminar.location()) + ";" +
				quote(_seminar.seatsLeft()) + System.getProperty("line.separator") +
				studentList;
	}

	private String quote(Object field) {
		return wrap("\"", field);
	}

	private String wrap(String wrapper, Object wrapped) {
		return wrapper + wrapped + wrapper;
	}
}
