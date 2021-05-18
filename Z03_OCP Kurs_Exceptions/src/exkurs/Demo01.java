package exkurs;

import java.util.List;
import java.util.Objects;

/*
 * 
 * 
 */
public class Demo01 {

	public static void main(String[] args) {
		doStuff(null);
	}

	public static void doStuff(List<String> list) {
//		if(list==null) {
//			throw new IllegalArgumentException("not null");
//		}
		Objects.requireNonNull(list, "not null");

		if (list == null) {

		}
		Objects.isNull(list);

		if (list != null) {

		}
		Objects.nonNull(list);
	}
}
