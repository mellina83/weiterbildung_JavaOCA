package com.comcave.java;

import java.time.LocalDate;

// Kapselung (encapsulation): Variablen des Objekts werden geschützt, Zugrifff von außen nur über wohldefinierte Methoden
// Schutz der Variablen mit private/protected
// Problem bei protected: Sichtabrkeit in der Klasse, in allen Unterklassen, aber auch im selben Package
// Sichtbarkeiten bei Variablen und Methoden: private = Klasse, default = package, protected = package + Unterklassen, public = alle
// ACHTUNG: bei Klassen gibt es nur public oder default
public class Buch implements Comparable<Buch>{
	
	private static final int MIN_ERSCHEINUNGSJAHR;
	
	static {
		MIN_ERSCHEINUNGSJAHR = 1800;
	}
	
//	public int test = 42;
	private String isbn;
	private String autor;
	private String titel;
	private int erscheinungsjahr;
	private int preis;	
	private StringBuilder beschreibung;
	
	public Buch() {}
	
	public Buch(String isbn, String autor, String titel, int erscheinungsjahr, int preis) {
		this.setIsbn(isbn);
		this.setAutor(autor);
		this.setTitel(titel);
		this.setErscheinungsjahr(erscheinungsjahr);
		this.setPreis(preis);
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		if (isbn.length() != 13) {
			throw new IllegalArgumentException("ISBN muss die Länge 13 haben: " + isbn);
		}
		for (char zeichen : isbn.toCharArray()) {
			if (!Character.isDigit(zeichen)) {
				throw new IllegalArgumentException("ISBN muss auf Ziffern bestehen: " + isbn);
			}
		}
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		if (autor == null || autor.length() < 2) {
			throw new IllegalArgumentException("Autor muss mind. 2 Zeichen haben: " + autor);
		}
		this.autor = autor;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		if (titel == null || titel.length() < 2) {
			throw new IllegalArgumentException("Titel muss mind. 2 Zeichen haben: " + titel);
		}
		this.titel = titel;
	}
	public int getErscheinungsjahr() {
		return erscheinungsjahr;
	}
	public void setErscheinungsjahr(int erscheinungsjahr) {
		if (erscheinungsjahr < MIN_ERSCHEINUNGSJAHR || erscheinungsjahr > LocalDate.now().getYear()) {
			throw new IllegalArgumentException("Ungütliges Erscheinungsjahr: " + erscheinungsjahr);
		}
		this.erscheinungsjahr = erscheinungsjahr;
	}
	public int getPreis() {
		return preis;
	}
	public void setPreis(int preis) {
		if (preis <= 0) {
			throw new IllegalArgumentException("Preis muss positiv sein: " + preis);
		}
		this.preis = preis;
	}

	public StringBuilder getBeschreibung() {
		return new StringBuilder(beschreibung);
	}

	public void setBeschreibung(StringBuilder beschreibung) { 
		if (beschreibung.length() < 5 || beschreibung.length() > 100) {
			throw new IllegalArgumentException("Beschreibung zu kurz oder zu lang: " + beschreibung);
		}
		this.beschreibung = beschreibung;
	}
	
	@Override
	public String toString() {
		return "Buch ISBN: " + isbn + ", Autor: " + autor + ", Titel: " + titel + System.lineSeparator() +
				"Erscheinungsjahr: " + erscheinungsjahr+ ", Preis: " + String.format("%,.2f €", preis/100.)  + System.lineSeparator() +
				"Beschreibung: " + beschreibung;
	}

	@Override
	public int compareTo(Buch b) {
		return this.autor.compareTo(b.autor);
	}
	

}
