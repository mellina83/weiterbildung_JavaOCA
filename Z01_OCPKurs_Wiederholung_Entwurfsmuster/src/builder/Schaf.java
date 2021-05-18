package builder;

public class Schaf {

	public static class SchafBuilder {
		private String name;// null
		private String wollfarbe;// null
		private double wollqualitaet;// 0
		private double wollmenge;// 0
		private int alter;// 0
		private float gewicht;// 0

		public SchafBuilder name(String name) {
			this.name = name;
			return this;
		}

		public SchafBuilder wollfarbe(String wollfarbe) {
			this.wollfarbe = wollfarbe;
			return this;
		}
		
		public SchafBuilder wollqualitaet(double wollqualitaet) {
			this.wollqualitaet = wollqualitaet;
			return this;
		}
		
		public SchafBuilder wollmenge(double wollmenge) {
			this.wollmenge = wollmenge;
			return this;
		}
		
		public SchafBuilder alter(int alter) {
			this.alter = alter;
			return this;
		}
		
		public SchafBuilder gewicht(float gewicht) {
			this.gewicht = gewicht;
			return this;
		}

		public Schaf build() {
			if(name == null || wollfarbe == null) {
				throw new IllegalArgumentException("name oder wollfarbe darf nicht null sein.");
			}
			return new Schaf(name, wollfarbe, wollqualitaet, wollmenge, alter, gewicht);
		}
	}

	private String name;
	private String wollfarbe;
	private double wollqualitaet;
	private double wollmenge;
	private int alter;
	private float gewicht;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWollfarbe() {
		return wollfarbe;
	}

	public void setWollfarbe(String wollfarbe) {
		this.wollfarbe = wollfarbe;
	}

	public double getWollqualitaet() {
		return wollqualitaet;
	}

	public void setWollqualitaet(double wollqualitaet) {
		this.wollqualitaet = wollqualitaet;
	}

	public double getWollmenge() {
		return wollmenge;
	}

	public void setWollmenge(double wollmenge) {
		this.wollmenge = wollmenge;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public float getGewicht() {
		return gewicht;
	}

	public void setGewicht(float gewicht) {
		this.gewicht = gewicht;
	}

	public Schaf() {
		this("Dolly", "Beige", 0.75, 0.6, 4, 123.5F);
	}

	public Schaf(String name, String wollfarbe, double wollqualitaet, double wollmenge, int alter, float gewicht) {
		super();
		this.name = name;
		this.wollfarbe = wollfarbe;
		this.wollqualitaet = wollqualitaet;
		this.wollmenge = wollmenge;
		this.alter = alter;
		this.gewicht = gewicht;
	}

	@Override
	public String toString() {
		return "Schaf [getName()=" + getName() + ", getWollfarbe()=" + getWollfarbe() + ", getWollqualitaet()="
				+ getWollqualitaet() + ", getWollmenge()=" + getWollmenge() + ", getAlter()=" + getAlter()
				+ ", getGewicht()=" + getGewicht() + "]";
	}

}
