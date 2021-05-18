package inner02static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo01ArraysInnerArrayList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println(list);
		
		System.out.println(list.getClass());
		
		list.add(10);
		
		System.out.println(list);
	}
}
