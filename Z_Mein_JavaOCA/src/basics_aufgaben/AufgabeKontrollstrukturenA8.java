package basics_aufgaben;

public class AufgabeKontrollstrukturenA8 {

	/*

Als Grundlage ist folgende Schleife zu nehmen:

		for(int monat = 1; monat<=12; monat++) {
		    //mehr Code hier
		}

Programmieren Sie bitte den Körper der Schleife so,
 dass mit der Schleife folgende Ausgaben erzeugt werden:

	    Monat 1: 1 2 3 ... 30 31
	    Monat 2: 1 2 3 ... 28 (29)
	    Monat 3: 1 2 3 ... 30 31
	    Monat 4: 1 2 3 ... 30
	    Monat 5: 1 2 3 ... 30 31
	    ...
	    Monat 12: 1 2 3 ... 30 31


	 */
	
	public static void main(String[] args) {

		for(int monat = 1; monat<=12; monat++) {
		    System.out.print("Monat " + monat + ": ");
			
		    int tageImMonat = 31;
		    
		    if(monat==2) {
		    	tageImMonat = 28;
		    } else if(monat==4 || monat==6 || monat==9 || monat==11) {
		    	tageImMonat = 30;
		    } 
		    
		    for (int tag = 1; tag <= tageImMonat; tag++) {
				System.out.print(tag + " ");
			}
		    
		    if(monat==2) {
		    	System.out.print("(29)");
		    }
		    
		    System.out.println();
		}
	}

}
