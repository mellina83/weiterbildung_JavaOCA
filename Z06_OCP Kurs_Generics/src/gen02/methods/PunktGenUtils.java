package gen02.methods;

public class PunktGenUtils {

//	public PunktGen<T> erzeugePunkt(){
//		return new PunktGen<>();
//	}
	
	public static <T> PunktGen<T> createPunktGen(T x,T y) {
		return new PunktGen<>(x,y);
	}
	
	/**
	 * Tausche 2 Identisch Generische PunktGen miteinander
	 * 
	 * Inhalt von Punkt1 nach Punkt2 und von Punkt2 nach Punkt1
	 */
	public static <T> void switchPoints(PunktGen<T> x,PunktGen<T> y) {
		T tmpX = x.getX();
		T tmpY = x.getY();
		
		x.setX(y.getX());
		x.setY(y.getY());
		
		y.setX(tmpX);
		y.setY(tmpY);
	}
	
	public static <T,S> void ausgeben(PunktGen<T> p1, PunktGen<S> p2) {

		System.out.println(p1.getX()+ " " + p1.getY() + " : " +p1.getClass().getSimpleName());
		System.out.println(p2.getX()+ " " + p2.getY() + " : " +p2.getClass().getSimpleName());
	}
	
	/*
	 * Wildcard <?>
	 * 
	 * Wir können für Var_Args nicht mehrere Unterschiedliche Generische Typen angeben.
	 */
	public static  void alleAusgeben(PunktGen<?>... punkte) {
		for (PunktGen<?> punktGen : punkte) {
			System.out.println(punktGen.getX().getClass());
		}
	}
	
}
