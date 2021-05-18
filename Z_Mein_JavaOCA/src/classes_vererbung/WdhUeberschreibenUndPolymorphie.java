package classes_vererbung;

import java.util.Random;

class Sportart {
	static int maxCount = 100;
	
	public static int getMaxCount() {
		return maxCount;
	}
	
	int count = 17;
	
	public int getCount() {
		return count; // Sportart.this.count;
	}
}


class Laufen extends Sportart {
	static int maxCount = 555;
	
	public static int getMaxCount() {
		return maxCount;
	}
	
	int count = 333;
	
	public int getCount() {
		return count; // Laufen.this.count;
	}
}

public class WdhUeberschreibenUndPolymorphie {

	public static void main(String[] args) {
		System.out.println( Sportart.maxCount ); // 100
		System.out.println( Sportart.getMaxCount() ); // 100
		
		System.out.println( Laufen.maxCount ); // 555
		System.out.println( Laufen.getMaxCount() ); // 555
		
		Sportart var = new Sportart();
		
		if(new Random().nextBoolean()) {
			var = new Laufen();
		}
		
		System.out.println( var.count ); // 17
	
		System.out.println( var.getCount() ); // entweder 17 oder 333 (polymorphischer Aufruf)
	}

}
