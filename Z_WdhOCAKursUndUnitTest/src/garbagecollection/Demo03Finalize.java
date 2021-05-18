package garbagecollection;

public class Demo03Finalize {

	public static int instanzAnzahl;

	public Demo03Finalize() {
		instanzAnzahl++;
	}

	/**
	 * Soll aufgerufen werden, bevor die Instanz nicht mehr benötigt wird
	 */
	public void deleteMe() {
		instanzAnzahl--;
	}

	@Override
	protected void finalize() throws Throwable {
		instanzAnzahl--;
	}

	public static void main(String[] args) throws Exception {
		new Demo03Finalize();
		new Demo03Finalize();
		new Demo03Finalize();
		new Demo03Finalize();
		new Demo03Finalize();
		System.gc();

		// Thread.sleep(1);

		System.out.println(Demo03Finalize.instanzAnzahl);
	}

}
