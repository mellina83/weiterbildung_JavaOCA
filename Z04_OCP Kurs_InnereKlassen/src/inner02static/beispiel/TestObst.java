package inner02static.beispiel;

public class TestObst {
	public static void main(String[] args) {
		Obst obst1 = new Apfel(9);
		Obst.Obstmengenausgabe.print(obst1);
		Obst obst2 = new Birne(7);
		Obst.Obstmengenausgabe.print(obst2);	
		Obst obst3 = () -> 42;
		Obst.Obstmengenausgabe.print(obst3);
	}
}
