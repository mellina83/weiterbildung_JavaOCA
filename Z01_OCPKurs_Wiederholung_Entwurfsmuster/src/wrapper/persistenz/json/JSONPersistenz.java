package wrapper.persistenz.json;

import wrapper.persistenz.IPersistence;

public class JSONPersistenz implements IPersistence{

	@Override
	public boolean writeData(String... data) {
		return writeToJSONFile(data);
	}
	
	public boolean writeToJSONFile(String... json) {
		System.out.println("{");
		
		for (String text : json) {
			System.out.println("\t" + text + ",");
		}
		
		System.out.println("}");
		System.out.println("JSON wurde erstellt.");
		return true;
	}
	
}
