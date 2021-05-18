package wrapper.persistenz;

import wrapper.persistenz.csv.CSVPersistenz;
import wrapper.persistenz.json.JSONPersistenz;

/**
 * Wrapperklasse zu Persistenz
 *
 */
public class DataProvider implements IPersistence {

	private JSONPersistenz jsonPersistence;
	private CSVPersistenz csvPersistenz;

	private DataProvider() {

	}

	public DataProvider(String provider) {
		switch (provider.toLowerCase()) {
			case "json": {
				this.jsonPersistence = new JSONPersistenz();
				break;
			}
			case "csv": {
				this.csvPersistenz = new CSVPersistenz();
				break;
			}
			default: {
				this.csvPersistenz = new CSVPersistenz();
				break;
			}
		}
	}

	@Override
	public boolean writeData(String... data) {
		if (this.csvPersistenz != null) {
			return this.csvPersistenz.writeData(data);
		} else if (this.jsonPersistence != null) {
			return this.jsonPersistence.writeData(data);
		}
		return false;
	}
}
