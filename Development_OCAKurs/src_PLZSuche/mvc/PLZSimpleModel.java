package mvc;

public class PLZSimpleModel implements PLZModelInterface {

	@Override
	public String sucheOrt(String postleitzahl) {
		return "Duisburg";
	}

	@Override
	public String sucheBundesland(String postleitzahl) {
		return "NRW";
	}

}
