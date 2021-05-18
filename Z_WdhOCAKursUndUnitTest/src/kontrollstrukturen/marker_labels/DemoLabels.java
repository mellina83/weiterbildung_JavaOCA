package kontrollstrukturen.marker_labels;

public class DemoLabels {

	public static void main(String[] args) {

		aussen: for (int i = 1; i <= 10; i++) {

			hugo: for (int j = 1; j <= 10; j++) {
				if (i % 2 == 0) {
//					System.out.print("- ");
					continue aussen;
//					break;
				}
				System.out.print(i * j + " ");
			}

			System.out.println();
		}

	}

}
