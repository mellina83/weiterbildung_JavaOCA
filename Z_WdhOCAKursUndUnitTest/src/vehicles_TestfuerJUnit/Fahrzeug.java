package vehicles_TestfuerJUnit;

public class Fahrzeug {

	private static final int MAXSPEED = 123;
	
	private double position;
	/**
	 * Km/h
	 */
	private double geschwindigkeit;

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(double geschwindigkeit) {
		if(geschwindigkeit<MAXSPEED && geschwindigkeit>0) {
			this.geschwindigkeit = geschwindigkeit;
		} else {
			this.geschwindigkeit = MAXSPEED;
		}	
	}

	public Fahrzeug() {

	}

	public Fahrzeug(double position, double geschwindigkeit) {
		super();
//		this.position = position;
//		this.geschwindigkeit = geschwindigkeit;
		this.setPosition(position);
		this.setGeschwindigkeit(geschwindigkeit);
	}

	@Override
	public String toString() {
		return "Fahrzeug [getPosition()=" + getPosition()
				+ ", getGeschwindigkeit()=" + getGeschwindigkeit() + "]";
	}

	/**
	 * Die Position des Fahrzeug soll abh�ngig von der Geschwindigkeit und der
	 * Zeit ver�ndert werden.
	 * 
	 */
	public void bewege(double minuten) {
		double tmp = this.getPosition();
		tmp = tmp + this.getGeschwindigkeit() * (minToDez(minuten) / 100);
		
		this.setPosition(tmp);
	}
	
	/**
	 * Umrechnen von Minuten in Dezimalwert. Faktor 1,66666666666Periode wurde mit
	 * 1.666667 festgesetzt
	 * 
	 * @param min
	 * @return
	 */
	private double minToDez(double min) {
		return min * 1.6666667;
	}
}
