package basics_operatoren;

public class WdhPostUndPraeInkrement {

	public static void main(String[] args) {
		int x = 3;
		
		;
		
		//gleich wird x gelesen,  um den Parameter zu initialisieren
		System.out.println( x ) // int param = x
		
		;

		//gleich wird x gelesen,  um den Parameter zu initialisieren,
		// x wird dabei inkrementiert 
		System.out.println( x++ ) // int param = x
		
		;
		
		// gleich wird x gelesen um den Wert aus x mit 2 zu addieren
		int y = x + 2
		
		;
		
		x++ // x wird hier an keine weiteren Operation als Inkrementieren beteiligt
		
		;
		
		
		x = 0;
		// x nimmt an der Zuweisung teil, dabei wird x auch inkrementiert
		int var1 = x++; // inkrementieren NACH dem Lesen für die Zuweisung
		
		x = 0;
		// x nimmt an der Zuweisung teil, dabei wird x auch inkrementiert
		int var2 = ++x; // inkrementieren VOR dem Lesen für die Zuweisung
	
		x = 0;
		System.out.println(x++); // 0
		
		x = 0;
		System.out.println(++x); // 1 
	}

}

