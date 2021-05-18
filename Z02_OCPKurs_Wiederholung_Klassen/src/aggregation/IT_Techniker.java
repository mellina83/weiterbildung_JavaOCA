package aggregation;

public class IT_Techniker {

	public static void main(String[] args) {
		
		// Erzeugen der PCs
		PC pc01 = new PC();
		PC pc02 = new PC();
		PC pc03 = new PC();

		// Erzeugen der Monitore
		Monitor m01 = new Monitor();
		Monitor m02 = new Monitor();
		Monitor m03 = new Monitor();

		Schulungsraum sr = new Schulungsraum();

		sr.addPC(pc01);
		sr.addPC(pc02);
		sr.addPC(pc03);

		sr.addMonitor(m01);
		sr.addMonitor(m02);
		sr.addMonitor(m03);

		System.out.println(sr.pcs[0]);
		System.out.println(sr.pcs[1] == pc02);
		System.out.println(sr.pcs[2] == pc03);

		System.out.println(sr.monitore[0]);
		System.out.println(sr.monitore[1] == m02);
		System.out.println(sr.monitore[2] == m03);
		
		sr = null;
		System.gc();//Garbage Collection räumt den Speicher auf.
		// Nur der Schulungsraum kann aufgräumt werden.
		System.out.println(pc01);
		System.out.println(m01);
		System.out.println(sr);
	}

}
