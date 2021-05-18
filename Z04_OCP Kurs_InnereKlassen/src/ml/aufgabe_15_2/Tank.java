package ml.aufgabe_15_2;

public class Tank {
	private int maxVolumen;
	private int tankinhalt = 3;
	private FuellstandSensor fuellstandSensor;

	public Tank() {
	};

	public Tank(int volumen) {
		this.setMaxVolumen(volumen);
	}

	// Methoden
	public void anmeldenFuellstandSensor(FuellstandSensor fuellstandSensor) {
		this.setFuellstandSensor(fuellstandSensor);
	}

	public void fuellen() {
		fuellstandSensor.meldeFuellstand(tankinhalt, maxVolumen);
		if (this.tankinhalt < this.maxVolumen) {
			this.tankinhalt += 1;
		}
	}

	public int getMaxVolumen() {
		return maxVolumen;
	}

	public void setMaxVolumen(int maxVolumen) {
		this.maxVolumen = maxVolumen;
	}

	public int getTankinhalt() {
		return tankinhalt;
	}

	public void setTankinhalt(int tankinhalt) {
		this.tankinhalt = tankinhalt;
	}

	public FuellstandSensor getFuellstandSensor() {
		return fuellstandSensor;
	}

	public void setFuellstandSensor(FuellstandSensor fuellstandSensor) {
		this.fuellstandSensor = fuellstandSensor;
	}
}
