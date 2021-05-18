package factory;

public class Motorcycle implements Vehicle{

	private int wheel;
	private int horsePower;
	private int ccm;

	Motorcycle(int wheel, int horsePower, int ccm) {
		this.wheel = wheel;
		this.horsePower = horsePower;
		this.ccm = ccm;
	}
	
	public int getWheel() {
		return wheel;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public int getCcm() {
		return ccm;
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Motorcycle [wheel=" + wheel + ", horsePower=" + horsePower + ", ccm=" + ccm + "]";
	}
}
