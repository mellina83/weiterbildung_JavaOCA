package arrays_arrays;

import java.util.Formatter;
import java.util.Random;

/*
 * 'format' ist nicht in der Prüfung.
 * 
 * Die Einzelheiten zur 'format' findet man hier:
 * 
 * 	https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
 * 
 */
public class B10_Varargs_format {

	public static void main(String[] param) {

		/*
		 * Zuweisung in Object-Variable geht mit allen möglichen Werten (Stichwort: Vererbung)
		 */
		Object x = "hallo";
		x = new Random();
		x = 12; // Autoboxing
		x = true; // Autoboxing
		
		/*
		 * Viele format-Methoden aus der Standardbibliothek benutzen den Formatter.
		 * 
		 *  z.B. die aus der KLasse 'PrintStream':
		 *  
		 *  	format(String format, Object ... args) 
		 */
		
		String format = "Hallo %s! %n";
		Object[] args = { "Welt" };
		
		System.out.format(format, args);
		System.out.format("Hallo %s!%n", "Welt");

		System.out.format("Name = %s, Alter = %s%n", "Tom", 3); // Name = Tom, Alter = 3
		
		/*
		 * auch in der Klasse String gibt es eine ähnliche Methode: 
		 */
		String s = String.format("Hallo %s!", "Java");
		System.out.println(s); // Hallo Java!
		
	}

}
