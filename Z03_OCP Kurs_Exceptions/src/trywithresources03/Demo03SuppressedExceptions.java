package trywithresources03;

public class Demo03SuppressedExceptions {
	
	class Lamm implements AutoCloseable{
		
		int gewicht;
		
		@Override
		public void close() throws Exception {
			System.out.println("Lamm wird geschlachtet");
			/*
			 * Weil nach 18 Uhr 
			 */
			int time = 18;
			if(time >=18) {
				throw new RuntimeException("Fleischer hat feierabend : " + this);
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Demo03SuppressedExceptions().demo01();
	}
	
	public void demo01() {
		try(Lamm l = new Lamm();Lamm l1 = new Lamm();Lamm l2 = new Lamm();){
			System.out.println(l.toString());
			System.out.println(l1.toString());
			System.out.println(l2.toString());
			
			if(l.gewicht <25) {
				throw new Exception("Lamm ist zu leicht");
			}
			
		}catch (Exception e) {
			System.out.println("Catch");
			System.out.println("Hauptexceptions : " + e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println("Suppressed : " + t.getMessage());
			}
		}
		
	}
}
