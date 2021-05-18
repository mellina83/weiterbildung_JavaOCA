package javaApi_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		LocalDateTime jetzt = LocalDateTime.now();
		System.out.println(jetzt);
		LocalDateTime mittagspause = LocalDateTime.of(2021,2,12,13,0);
		mittagspause = LocalDateTime.of(LocalDate.now(), LocalTime.of(13, 0));
		System.out.println(mittagspause);
		
		LocalDateTime jetztIn2040 = jetzt.withYear(2040);
		System.out.println(jetztIn2040.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM)));

	}

}
