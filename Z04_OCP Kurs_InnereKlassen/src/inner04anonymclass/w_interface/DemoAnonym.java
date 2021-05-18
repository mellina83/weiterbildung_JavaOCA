package inner04anonymclass.w_interface;

import java.util.Properties;

public class DemoAnonym {

	/**
	 * Member Implementierung einer Inneren Anonyme Klasse mit einem Interface
	 */
	private IPrintable iPrinter = new IPrintable() {
		
		@Override
		public void printText(String text) {
			System.out.println("****************************");
			System.out.println(text);
			System.out.println("****************************");
		}
	};
	
	/**
	 * Member Implementierung einer Inneren Anonyme Klasse mit einem Interface
	 */
	private static IPrintable iPrinterStatic = new IPrintable() {
		
		@Override
		public void printText(String text) {
			System.out.println("****************************");
			System.out.println(text);
			System.out.println("****************************");
		}
	};
	
	public static void main(String[] args) {
		DemoAnonym ref = new DemoAnonym();	
		ref.iPrinter.printText("Anonyme Innere Klasse");
		DemoAnonym.iPrinterStatic.printText("Statische Anonyme Innere Klasse");
		
		IPrintable specPrinter = new IPrintable() {	
			@Override
			public void printText(String text) {
				Properties props = System.getProperties();
				props.list(System.out);
			}
			
			public String doStuff() {
				return "Hallo Welt";
			}
		};

		specPrinter.printText("");
	}

	public void doStuff() {
		this.iPrinter.printText("Anonyme Innere Klasse");
		DemoAnonym.iPrinterStatic.printText("Statische Anonyme Innere Klasse");
	}
}
