package inner04anonymclass;

import java.awt.Point;
import java.lang.reflect.Method;

public class Exkurs {

	public static void main(String[] args) {

		Point mypoint = new Point(10, 20) {
			@Override
			public String toString() {
				return "[x=" + x + ",y=" + y + "]";
			}

			public double quote() {
				return (double) x / y;
			}
		};
		Class myPointClass = mypoint.getClass();

		Method[] mypointMethods = myPointClass.getDeclaredMethods();

		for (Method method : mypointMethods) {
			System.out.println(method.toString());
			if (method.toString().endsWith("quote()")) {
				try {
					System.out.println("Invoke the Method : " + method.getName()
							+ " = " + method.invoke(mypoint));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			System.out.println();
		}

//		Class clazz;
//		
//		try {
//			clazz = Class.forName("sun.misc.VM");
//			
//			Method[] m = clazz.getDeclaredMethods();
//			for(Method method : m) {
//				System.out.println(method.toString());
//			}
//			
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}

	}
}
