

public class SeminarDetails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Seminar seminar = new Seminar("Lugano", new Course("Fondamenti di matematica", 1, "Aritmetica di base"));
		seminar.enroll(new Student("Stefano", "Coluccia"));
		seminar.enroll(new Student("ValentN-ANO", "Decarli"));
		seminar.enroll(new Student("Manlio", "VaccaLuzzo"));
		
		System.out.println("***************************************************************************************************************\n");
		System.out.println("Seminario di " + seminar.getName() + " su " + seminar.getDescription()+ "\n");
		System.out.println("Il seminario si terrà presso " + seminar.getLocation() + " e al momento sono ci sono ancora " + seminar.getSeatsLeft() + " disponibili \n");
		System.out.println("***************************************************************************************************************" + "\n\nGli studenti attualmente iscritti sono: \n");

		if(seminar.getStudentList().isEmpty()){
			System.out.println("AL MOMENTO NON SONO PRESENTI ISCRIZIONI");
		}else {
			System.out.println(seminar.getStudentList());
		}


	}

}
