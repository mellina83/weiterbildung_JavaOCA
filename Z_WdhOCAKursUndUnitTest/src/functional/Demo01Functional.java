package functional;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface IFressbar {
	public abstract void wirdgefressen();
}

interface ILambda02 {
	public abstract Integer toInt(String toFormat);
}

public class Demo01Functional {

	public static void main(String[] args) {
		/*
		 * Java 6
		 */
		List<Integer> list01 = new ArrayList<Integer>();

		/*
		 * Java 7 Diamond Operator <>
		 * 
		 * Type Inference
		 */
		List<Integer> list02 = new ArrayList<>();

		/*
		 * Lambda nutzt
		 * 
		 * Method Inference
		 * 
		 * public abstract void wirdgefressen();
		 */
		IFressbar lambda = () -> {
			System.out.println("Hallo welt, hier spricht Lambda");
		};

		lambda.wirdgefressen();

		/*
		 * public abstract Integer toInt(String toFormat);
		 */
		ILambda02 ref02 = (String toFormat) -> {
			return toFormat.length();
		};
		ILambda02 ref03 = String::length;
		
		System.out.println(ref02.toInt("Hallo Welt"));
		System.out.println(ref02.toInt("Hallo welt, hier spricht Lambda"));
	}

}
