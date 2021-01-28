package arrays.hafen;

public class Schiff {

private String name;
	
	Schiff() {
		this("0");
	}
	
	Schiff (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Schiffname: " + name;
	}
	
}
