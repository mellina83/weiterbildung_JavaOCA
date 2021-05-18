package trycatch02;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo02TryCatchMultiple {

	public static void main(String[] args) {
		
		// Java 6 like Try Multiple Catch
		try {
			erzeugeMultipleExceptions();
		} catch (FileNotFoundException fnfe) {

		} catch (ReflectiveOperationException roe) {

		} catch (IndexOutOfBoundsException ioobe) {

		} catch (NullPointerException npe) {

		}

		// Java 7 and above like Try Multiple Catch
		/*
		 * Exceptions in einem Multiple-Catch dürfen in keiner
		 * Vererbungshierarchie stehen.
		 * 
		 * Es darf nur eine Referenz angegeben werden.
		 */
		try {
			erzeugeMultipleExceptions();
		} catch (NullPointerException | ReflectiveOperationException
				| FileNotFoundException | IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (IOException e) {

		} catch (Exception e) {

		}
	}

	private static void erzeugeMultipleExceptions()
			throws FileNotFoundException, ReflectiveOperationException,
			IndexOutOfBoundsException, NullPointerException {

		for (int i = 0; i < 10; i++) {
			switch (i) {
				case 1: {
					throw new IndexOutOfBoundsException();
				}
				case 2: {
					throw new NullPointerException();
				}
				case 3: {
					throw new FileNotFoundException();
				}
				default: {
					throw new ReflectiveOperationException();
				}

			}
		}

	}
}
