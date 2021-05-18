package wrapper;

import wrapper.persistenz.DataProvider;
import wrapper.persistenz.IPersistence;
import wrapper.persistenz.csv.CSVPersistenz;
import wrapper.persistenz.json.JSONPersistenz;

public class Applikation {

	public static void main(String[] args) {
		String[] texte = { "Hallo", "Welt", "hier", "ist", "Java" };

		/*
		 * CSV - Comma-separated values
		 * 
		 * JSON - JavaScript Object Notation
		 */
		IPersistence ref = IPersistence.of("JsOn");
		
		test(ref, texte);
	}

	public static void test(IPersistence ref,String... data) {
		ref.writeData(data);
	}
}
