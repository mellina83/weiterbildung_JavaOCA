package inner01member;

import inner01member.MoebliertesHaus.Raum.Moebelstueck;

public class MoebliertesHaus {

	String s = "Haus";
	
	class Raum{
		String s = "Raum";
		
		class Moebelstueck{
			String s = "Moebelstueck";
			
			void output() {
				System.out.println(s);//Moebelstueck
				System.out.println(this.s);//Moebelstueck
				System.out.println(Moebelstueck.this.s);//Moebelstueck
				System.out.println(Raum.this.s);//Raum
				System.out.println(MoebliertesHaus.this.s);//"Haus"
				System.out.println("-------------");
				System.out.println(MoebliertesHaus.Raum.Moebelstueck.this.s);//"Moebelstueck"
			}
		}
	}
	
	public static void main(String[] args) {
		MoebliertesHaus h = new MoebliertesHaus();
		Raum r01 = h.new Raum();
		MoebliertesHaus.Raum r02 = h.new Raum();
		Moebelstueck ms = r02.new Moebelstueck();
		ms.output();
		System.out.println("***********************");
		// oder in einen Schritt mit einer anonymen Instanz
		new MoebliertesHaus().new Raum().new Moebelstueck().output();
	}
}
