package wrapper.persistenz;

import wrapper.persistenz.csv.CSVPersistenz;
import wrapper.persistenz.json.JSONPersistenz;

public interface IPersistence {
	public abstract boolean writeData(String... data);

	public static IPersistence of(String provider) {
		IPersistence result = null;

		switch (provider.toLowerCase()) {
			case "json": {
				result = new JSONPersistenz();
				break;
			}
			case "csv": {
				result = new CSVPersistenz();
				break;
			}
			default: {
				result = new CSVPersistenz();
				break;
			}
		}
		return result;
	}

	public static IPersistence of() {
		return of("csv");
	}
}
