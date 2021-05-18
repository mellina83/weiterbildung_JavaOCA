package inner04anonymclass.w_class;

import java.awt.Point;

public class DemoAnonym {

	/**
	 * Member Implementierung
	 */
	Point myPoint = new Point(10,20) {
		@Override
		public String toString() {
			return "[y=" + y + ",x=" + x + "]";
		}
		
		@Override
		public double getX() {
			return x*2;
		};
		
	};
	
	public void doStuff(){
		System.out.println(myPoint.toString());
		System.out.println("x : " + myPoint.x);
		System.out.println("getX() : " + myPoint.getX());
	}
	
	public static void main(String[] args) {
		new DemoAnonym().doStuff();
	}
}
