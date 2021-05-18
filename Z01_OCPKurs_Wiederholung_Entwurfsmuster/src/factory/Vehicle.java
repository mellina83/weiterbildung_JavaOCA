package factory;

public interface Vehicle {

	public abstract int getWheel();
	public abstract int getHorsePower();
	public abstract int getCcm();
	
	public abstract void start();
	public abstract void stop();
	
}
