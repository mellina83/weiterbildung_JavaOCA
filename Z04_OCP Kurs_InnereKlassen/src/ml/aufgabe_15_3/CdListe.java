package ml.aufgabe_15_3;

import java.util.ArrayList;
import java.util.List;

public class CdListe {

	private class Cd {
		private String cdTitel;
		private String kuenstler;
		private Integer jahr;

		public Cd(String cdTitel, String kuenstler, int jahr) {
			this.cdTitel = cdTitel;
			this.kuenstler = kuenstler;
			this.jahr = jahr;
		}

		public String toString() {
			return this.kuenstler + ", " + this.cdTitel + ", " + this.jahr;
		}
	}

	private String archivTitel;
	private int maxAnzahl;

	private int anz = 0;
	private List<Cd> archiv = new ArrayList<>();

	public void setMaxAnzahl(int ma) {
		this.maxAnzahl = ma;
	}

	public CdListe(String archivTitel, int maxAnzahl) {
		this.archivTitel = archivTitel;
		this.maxAnzahl = maxAnzahl;
	}

	public void cdHinzufuegen(String cdTitel, String kuenstler, int jahr) {
		if (this.anz >= this.maxAnzahl) {
			System.out.println();
			System.out.println("---------------------------");
			System.out.println("Keine neue CD mehr möglich!");
			System.out.println("---------------------------");
			return;
		}
		this.archiv.add(this.new Cd(cdTitel, kuenstler, jahr));
		anz++;
	}

	public void listeAnzeigen() {

		System.out.println(
				this.archivTitel + " Sammlung hat " + this.anz + " CDs.");
		if (anz > 0) {
			for (int i = 0; i < anz; i++) {
				System.out
						.println("CD " + (i + 1) + " : " + this.archiv.get(i));
			}
		} else {
			System.out.println(this.archiv);
		}

	}

}
