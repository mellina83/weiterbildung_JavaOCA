package basics_kontrollstrukturen;

public class IfAbfrageKombinationen {

	public static void main(String[] args) {
		
		int tag = 4;

		/*
		 * if
		 */
		if(tag==1) {
			System.out.println("1. Mo");
		}
		
		/*
		 * if
		 * else
		 */
		if(tag>0 && tag<6) {
			System.out.println("2. Arbeitstag");
		} else {
			System.out.println("2. Wochenede");
		}
		
		
		/*
		 * if
		 * else if
		 * else if
		 * else if
		 * else if
		 * ...
		 * else
		 */
		if(tag>0 && tag<6) {
			System.out.println("3. Arbeitstag");
		} else if(tag==6 || tag==7) {
			System.out.println("3. Wochenende");
		} else {
			System.out.println("3. Fehlerhafter Tag-Wert: " + tag);
			// System.exit(0); // Damit kann die VM beendet werden.  
		}
		
		/*
		 * if
		 * else if
		 * else if
		 * ...
		 * 
		 * Ohne else geht es auch
		 */
		if(tag==1) {
			System.out.println("4. Mo");
		} else if(tag==2) {
			System.out.println("4. Di");
		} else if(tag==3) {
			System.out.println("4. Mi");
		} 
		//...
		
		
		System.out.println("end of main");
	}

}
