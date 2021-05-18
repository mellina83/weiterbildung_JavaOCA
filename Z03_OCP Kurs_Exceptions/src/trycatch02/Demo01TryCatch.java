package trycatch02;

public class Demo01TryCatch {

	public static void main(String[] args) {
		try {
			erzeugeCheckedException();
		} catch (Exception e) {
			System.out.println("e.getMessage() " + e.getMessage());
			System.out.println("e.getCause() " + e.getCause());

		}
	}
	public static void erzeugeCheckedException() throws Exception {
		for (int i = 0; i < 10; i++) {
			if (i == 6) {
				try {
					throw new Exception("i war 6");
				} catch (Exception e) {
					System.out.println("Wir reparieren " + e.getMessage());
					/*
					 * Dies ist eine neue Exception, welche innerhalb des
					 * catch-block erzeugt wurde. Mit einer neuen Nachricht.
					 */
//					throw new Exception("Durch die Fehlerbehandlung ist ein neuer Fehler aufgetreten");
					/*
					 * Rethrow einer Exception
					 */
//					throw e;
					/*
					 * Verpacken einer geworfenen Exception in eine neue
					 * Exception
					 */
					throw new RuntimeException(e);

				}

			}
		}
		System.out.println("Methode beendet");
	}
	
	public static void erzeugeUncheckedException() {
		for (int i = 0; i < 10; i++) {
			if (i == 6) {
				throw new RuntimeException("i war 6");
			}
		}
		System.out.println("Methode beendet");
	}


}
