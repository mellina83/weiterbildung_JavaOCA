package interfaces;

public class Buch extends Ware implements Verleihbar {
	private String autor;
	private int verleihpreis;
	

	public Buch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Buch(String bezeichnung, int preis, String autor) {
		super(bezeichnung, preis);
		this.autor = autor;
		// TODO Auto-generated constructor stub
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString() {
		return super.toString() + ", Autor: " + autor;
	}
	
	public int getVerleihpreis() {
		return verleihpreis;
	}
	public void setVerleihpreis(int verleihpreis) {
		this.verleihpreis = verleihpreis;
	}
}
