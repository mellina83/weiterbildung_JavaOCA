package inner02static.beispiel;

public interface Obst {
	
	default String getObstname() {
		return this.getClass().getSimpleName();
	}
	
	public abstract int getAnzahl();
	
	static class Obstmengenausgabe{
		public static void print(Obst obst) {
			System.out.println(obst.getObstname());
			System.out.println(obst.getAnzahl());
		}
	}
}
