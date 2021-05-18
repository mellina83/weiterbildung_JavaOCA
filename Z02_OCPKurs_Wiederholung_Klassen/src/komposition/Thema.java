package komposition;

public class Thema {

	private String titel;
	
	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public Thema(String titel) {
		this.titel = titel;
	}
	
	@Override
	public String toString() {
		return "Thema [getTitel()=" + getTitel() + "]";
	}
}
