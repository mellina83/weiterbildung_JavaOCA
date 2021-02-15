package interfaces;

import java.util.function.Predicate;

public class Mypredicate implements Predicate<String> {

	@Override
	public boolean test(String s) {
		if (s.length() > 5) {
			return true;
		} else {
			return false;
		}
		
	}
	
	// kuerzer: return s. length() > 5;
	
	

}
