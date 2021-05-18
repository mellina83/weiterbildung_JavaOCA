package throws01;

public class Demo05ArrayDelegateException {
	
	public static void main(String[] args) throws Exception {
		methode01();
	}

	private static void methode01() throws Exception {
		methode02();
	}

	private static void methode02() throws Exception {
		methode03();
	}

	private static void methode03() throws Exception {
		int[] zahlen = new int[] { 1, 2, 3 };
		int summe = 0;

		for (int i = 0; i <= zahlen.length; i++) {
			if (i == 3) {
				throw new Exception("index ist zu gross");
			}
			summe += zahlen[i];
		}
		
	}
}
