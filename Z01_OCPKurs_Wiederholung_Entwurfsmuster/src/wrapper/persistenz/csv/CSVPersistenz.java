package wrapper.persistenz.csv;

import wrapper.persistenz.IPersistence;

public class CSVPersistenz implements IPersistence{

	@Override
	public boolean writeData(String... data) {
		return writeToCSVFile(data);
	}
	
	public boolean writeToCSVFile(String... strings) {
		
		for (String text : strings) {
			System.out.print(text + ",");
		}
		System.out.println();
		System.out.println("CSV wurde erstellt.");
		return true;
	}


	
}
