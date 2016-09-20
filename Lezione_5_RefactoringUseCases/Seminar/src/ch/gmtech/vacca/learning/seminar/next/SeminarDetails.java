package ch.gmtech.vacca.learning.seminar.next;
import java.util.Arrays;
import java.util.List;



public class SeminarDetails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new SeminarDetails().start();
	}


	private void start() {
		Seminar matematica = new Seminar("Lugano", new Course("Fondamenti di matematica", 1, "Aritmetica di base", "15.01.2016"));
		Student stefano = new Student("Stefano", "Coluccia");
		matematica.enroll(stefano);
		matematica.enroll(new Student("ValentN-ANO", "Decarli"));
		matematica.enroll(new Student("Manlio", "VaccaLuzzo"));
		
		Seminar informatica = new Seminar("Manno", new Course("informatica", 2, "Sequence diagrams", "15.01.2016"));
		informatica.enroll(stefano);
		
		Seminar chimica = new Seminar("Bioggio", new Course("Chimica", 3, "Ossidoriduzioni", "15.01.2016"));
		
		List<Seminar> seminars = Arrays.asList(matematica, informatica, chimica);
		
		for (Seminar seminar : seminars) {
			
			System.out.println("***************************************************************************************************************\n");
			System.out.println("Seminario di " + seminar.course().name() + " (" + seminar.course().number() + ")" + " su " + seminar.course().description()+ "\n");
			System.out.println("Il seminario si terra'  presso " + seminar.location() + " e al momento sono ci sono ancora " + seminar.seatsLeft() + " disponibili \n");
			System.out.println("***************************************************************************************************************" + "\n\nGli studenti attualmente iscritti sono: \n");

			System.out.println(new PrintFactory(seminar).printPlain());
			System.out.println(new PrintFactory(seminar).printHtml());
		}
	}
}