package enums;

import java.time.LocalDate;
import java.time.Month;

public class Demo01 {
	public static void main(String[] args) {
		Month feb = Month.FEBRUARY;
		
		LocalDate ld = LocalDate.of(1999, feb, 15);
	}
}
