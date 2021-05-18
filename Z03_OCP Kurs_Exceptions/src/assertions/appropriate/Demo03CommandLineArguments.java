package assertions.appropriate;
/**
 * Don't Use Assertions to Validate Command-Line Arguments
 * 
 * This is really just a special case of the "Do not use assertions to validate
 * arguments to a public method" rule.
 * 
 * If your program requires command-line arguments, you'll probably use the
 * exception mechanism to enforce them.
 *
 */
public class Demo03CommandLineArguments {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]); // Erstes Element
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Es wurde versucht auf Index " + e.getMessage() + " zuzugreifen");
		}

		int ganzeZahl = 0; //Erster Parameter
		boolean wahrheitwert = false; //Zweiter Parameter
		double fliesszahl = 0; //Dritter Parameter
		String operator = ""; //Vierter Parameter
		try {
			ganzeZahl = Integer.parseInt(args[0]);
			System.out.println("ganzeZahl: " + ganzeZahl);
			
			wahrheitwert = Boolean.parseBoolean(args[1]);
			System.out.println("wahrheitwert: " + wahrheitwert);
			
			fliesszahl = Double.parseDouble(args[2]);
			System.out.println("fliesszahl: " + fliesszahl);
			
			operator = args[3];
			System.out.println("operator: " + operator);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Es wurde versucht auf Index " + e.getMessage() + " zuzugreifen");
		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}
}
