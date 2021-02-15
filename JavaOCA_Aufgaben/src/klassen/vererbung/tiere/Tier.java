package klassen.vererbung.tiere;

public abstract class Tier {
	private String name;
	private int alter;
	private boolean gesund;
	
	public Tier(String name, int alter, boolean gesund) {
		super();
		this.name = name;
		this.alter = alter;
		this.gesund = gesund;
	}
	
	public String toString() {
		String type = getClass().getSimpleName();
		return type + ". Name: " + name;

	}

	public String getName() {
		return name;
	}
	
	public int getAlter() {
		return alter;
	}
	
	public boolean getGesund() {
		return gesund;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public void setGesund(boolean gesund) {
		this.gesund = gesund;
	}
	
	public abstract void laufen();

}
