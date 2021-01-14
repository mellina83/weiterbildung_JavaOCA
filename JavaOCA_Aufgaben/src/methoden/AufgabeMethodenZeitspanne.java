package methoden;

/*
 * # Aufgabe 'Methoden - Zeitspanne'

	- Definieren Sie eine statische Methode "getZeitspanneInGanzenTagen", an die man als Argumente zwei Datumsangaben (zu Tag 1 und Tag 2) übergibt.
	  Die Methode liefert dann die Anzahl der ganzen Tage zwischen den zwei Daten.
	> Ein Datum kann man durch drei Angaben beschreiben: Tag, Monat, Jahr 
	> Tipp: bei der Lösung ist es sinnvoll weitere Hilfsmethoden zu definieren, z.B. "istSchaltjahr"

	- Optional. Lösen Sie die Aufgabe mit Hilfe der Klasse `java.util.Calendar`
	- Optional. Lösen Sie die Aufgabe mit der java.time-API (Java SE 8)
 */

public class AufgabeMethodenZeitspanne {
	
	//static void getZeitspanneInGanzenTagen(int tag1, int tag2) {
	
	static void getZeitspanneInGanzenTagen(int tag1, int monat1, int jahr1, int tag2, int monat2, int jahr2) {
		
		for(int monat = 1; monat<=12; monat++) {
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
	

	public static void main(String[] args) {
		
		getZeitspanneInGanzenTagen(01022021, 05022021);

	} // Ende Main

}
