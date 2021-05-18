package throws01;

public class Demo04ArrayDelegateRuntimeExcetion {

	public static void main(String[] args) {
		methode01();
	}
	
	private static void methode01() {
		methode02();
	}

	private static void methode02() {
		methode03();
	}
	
	private static void methode03() {
		int[] zahlen = new int[] { 1, 2, 3 };
		int summe = 0;

		for (int i = 0; i <= zahlen.length; i++) {
			if (i == 3) {
				throw new RuntimeException("index ist zu gross");
			}
			summe += zahlen[i];
		}
	}
}
