package garbagecollection;

import java.util.Date;

public class Demo01CheckGC {

	public static void main(String[] args) {
//		demo01();
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory : " + rt.totalMemory());

		System.out.println("Before memory\t : " + rt.freeMemory());
		
		Date d = null;
		for (int i = 0; i < 2_000_000L; i++) {
			d = new Date();
			
			//d = null;
		}
		
		System.out.println(d);
		System.out.println("After memory\t : " + rt.freeMemory());
		
//		System.gc();
		rt.gc();
		
		System.out.println("After GC memory\t : " + rt.freeMemory());
	}

	private static void demo01() {
				System.gc();
		Runtime.getRuntime().gc();
		Runtime rt = Runtime.getRuntime();
		rt.gc();
		
//		System.getRuntime.gc();
//		Runtime.gc();
		
	}

}
