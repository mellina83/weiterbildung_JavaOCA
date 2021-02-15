package klassen.interfaces;

import java.util.Comparator;

public class MyComparatorFeuersteins implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}

	

}
