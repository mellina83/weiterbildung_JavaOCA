package classes_interfaces;

// Klassen werden erweitert, Interfaces werden implementiert
// Wenn eine Klasse ein Interface implementiert, muss sie alle Methoden des Interfaces implementieren
public class Buch extends Ware implements Verleihbar{
	
	private String autor;
	private int verleihpreis;
	
	public Buch() {}
	public Buch(String bezeichnung, int preis, String autor) {
		super(bezeichnung, preis);
		this.setAutor(autor);
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
		return this.verleihpreis;
	}
	
	public void setVerleihpreis(int verleihpreis) {
		this.verleihpreis = verleihpreis;
	}
}
