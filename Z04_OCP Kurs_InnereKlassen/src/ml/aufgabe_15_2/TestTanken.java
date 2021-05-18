package ml.aufgabe_15_2;

public class TestTanken {

	public static void main (String[] args) {

		TankSaeule tankSaeule = new TankSaeule();
		Tank tank = new Tank (16);
		
		tankSaeule.tankstutzenEntnehmen (tank);
		tankSaeule.startTanken();
		
	}
}
