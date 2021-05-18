package functional;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

interface I02Functional01 {
	public abstract int berechne(int i);
}

interface I02Functional02 {
		public abstract int berechne(int i, int j);
}

public class Demo02Lambda {

	public static void main(String[] args) {
		demoAnonyme();
		System.out.println("-----------");
		demoLambda();
	}

	private static void demoLambda() {
		System.out.println("Lambda Beispiele");
		
		I02Functional01 calc01;
		I02Functional02 calc02;
		
		/*
		 * public abstract int berechne(int i);
		 * -> Lambda benötigt nur Rückgabewert und Parameterliste
		 * 
		 * int (int i) : (int i) -> {return i;};
		 */
		calc01 = (int i) -> {return i+i;};
		
		calc02 = (int i, int j) -> {return i +j;};
		
		System.out.println(calc01.berechne(6));
		System.out.println(calc01.berechne(7));
		System.out.println(calc01.berechne(8));
		System.out.println(calc02.berechne(5, 6));
		System.out.println(calc02.berechne(6, 7));
		System.out.println(calc02.berechne(7, 8));
	}

	/**
	 * Nur zu Wiederholung
	 */
	private static void demoAnonyme() {
		System.out.println("Anonyme Beispiele");
		
		I02Functional01 calc01;
		I02Functional02 calc02;
		
		calc01 = new I02Functional01() {
			@Override
			public int berechne(int i) {
				return i+i;
			}
		} ;
		
		calc02 = new I02Functional02() {
			@Override
			public int berechne(int i, int j) {
				return i+j;
			}
		};
		
		MouseListener ml = new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {}
		};
		
		
		System.out.println(calc01.berechne(6));
		System.out.println(calc01.berechne(7));
		System.out.println(calc01.berechne(8));
		System.out.println(calc02.berechne(5, 6));
		System.out.println(calc02.berechne(6, 7));
		System.out.println(calc02.berechne(7, 8));
	}

}
