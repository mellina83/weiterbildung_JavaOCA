package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionsTest {

	public static void main(String[] args) {
		// CheckedExceptions sind alle Exceptions, die NICHT RuntimeException sind.
		// Checked Exceptions müssen behandelt oder deklariert werden (handle or declare).
		System.out.println("Eins");
		// 5 Sekunden Pause
		// Thread.sleep kann eine InterruptedException werfen. Diese ist checked und muss daher vom Programmierer behandelt oder deklariert werden.
		// Behandeln (handle) mit einem try-catch-Block
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Unbehandelte Ausnahme an 0xFE45AFFE");
		}
		System.out.println("Zwei");
		// 5 Sekunden Pause
		// Behandeln (handle) mit einem try-catch-Block
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Drei");
		try {
			schlafen(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Vier");
		try {
			schlafen(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		FileReader fr = null;
		try {
			fr = new FileReader("test.txt");
			char zeichen = (char) fr.read();
			System.out.println(zeichen);
		} catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden");		
		} catch (IOException e) {
			System.out.println("Allgemeiner IO-Fehler");		
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				System.out.println("finally Ade");
			}
		}
		
		try {
			leseDatei("test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int augenzahl = 0;
		try {
			augenzahl = wuerfeln();
		} catch (IllegaleAugenzahlException e) {
			System.out.println("IllegaleAugenzahlException");			
			// z.B. Schreiben der Exception in ein Log 
//			throw e; // Weiterwerfen der ursprünglichen Exception nach Behandlung (handle or declare notwendig!)
			throw new RuntimeException(e); // Weiterwerfen einer RuntimeException mit e als Auslöser (ohne handle or declare)
		}
		
		System.out.println("augenzahl = " + augenzahl);
		
		System.out.println("Ade");
	}
	
	public static int wuerfeln() throws IllegaleAugenzahlException {
		int augenzahl = (int) (Math.random() * 6) + 10;
		if (augenzahl < 1 || augenzahl > 6) {
			// Exception werfen (werfen kann man nur ein Throwable)
			throw new IllegaleAugenzahlException("Augenzahl  muss zwischen 1 und 6 liegen: " + augenzahl);
		}
		return augenzahl;
	}
	
	public static void schlafen(int sekunden) throws InterruptedException  {
		// Deklarieren in der aufrufenden Methode (declare)
		Thread.sleep(sekunden * 1000);		
	}
	
	public static void leseDatei(String dateiname) throws FileNotFoundException, IOException{
		FileReader fr = new FileReader(dateiname);
		System.out.println((char) fr.read());
		fr.close();
	}

}
