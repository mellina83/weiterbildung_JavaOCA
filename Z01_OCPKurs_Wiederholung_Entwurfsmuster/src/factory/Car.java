package factory;

public class Car implements Vehicle {

	private int wheel;
	private int horsePower;
	private int ccm;

	public int getWheel() {
		return wheel;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public int getCcm() {
		return ccm;
	}

	Car(int wheel, int horsePower, int ccm) {
		this.wheel = wheel;
		this.horsePower = horsePower;
		this.ccm = ccm;
	}

	@Override
	public String toString() {
		return "Car [wheel=" + wheel + ", horsePower=" + horsePower + ", ccm=" + ccm + "]";
	}

	@Override
	public void start() {

	}

	@Override
	public void stop() {

	}

}
