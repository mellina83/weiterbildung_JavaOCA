package polymorph;

public class BauernhofSimulator {

	public static void main(String[] args) {
		Schwein s01 = new Schwein();
		
		s01.fressen(new Traube());
		s01.fressen(new Ananas());
		s01.fressen(new Apfel());
		s01.fressen(new KraftFutter());
		s01.fressen(new Stein());
		s01.fressen(new Schwein());
		s01.fressen(s01);

	}

}
