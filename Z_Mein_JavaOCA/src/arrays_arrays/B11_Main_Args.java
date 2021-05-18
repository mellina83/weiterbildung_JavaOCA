package arrays_arrays;

import java.util.Arrays;

public class B11_Main_Args {

	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
		for (String string : args) {
			System.out.println(string);
		}

	}

}
