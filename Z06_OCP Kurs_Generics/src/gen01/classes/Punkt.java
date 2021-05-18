package gen01.classes;

public class Punkt {
	private Number x;
	private Number y;
	
	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Punkt(double x, double y) {
		this.x = (Number)x;
		this.y = (Number)y;
	}
	
	public Punkt(Number x, Number y) {
		this.x = (Number)x;
		this.y = (Number)y;
	}

	public Number getX() {
		return x;
	}

	public void setX(Number x) {
		this.x = x;
	}

	public Number getY() {
		return y;
	}

	public void setY(Number y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punkt [x=" + x + ", y=" + y + "]";
	}
}
