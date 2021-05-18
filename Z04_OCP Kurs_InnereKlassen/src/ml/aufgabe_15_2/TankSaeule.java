package ml.aufgabe_15_2;

public class TankSaeule {
	private Tank tank;
	private boolean stopFuellen;

	public TankSaeule() {
	}

	public void tankstutzenEntnehmen(Tank tank) {
		this.setTank(tank);
	}

	public void startTanken() {
		stopFuellen = false;
		this.tank.anmeldenFuellstandSensor(new FuellstandSensor() {
			@Override
			public void meldeFuellstand(int fuellstand, int maxVolumen) {
				System.out.println(
						"Aktueller Füllstand: " + fuellstand + " Liter.");
				if (fuellstand >= maxVolumen) {
					stopFuellen = true;
					System.out.println("Tank ist voll... ");
				}
			}
		});

		while (!stopFuellen) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tank.fuellen();
		}

	}

	public Tank getTank() {
		return tank;
	}

	public void setTank(Tank tank) {
		this.tank = tank;
	}

	public boolean isStopFuellen() {
		return stopFuellen;
	}

	public void setStopFuellen(boolean stopFuellen) {
		this.stopFuellen = stopFuellen;
	}

}
