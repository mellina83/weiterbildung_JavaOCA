package javaApi_time;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalTimeTest {

	public static void main(String[] args) {
		LocalTime jetzt = LocalTime.now();
		System.out.println(jetzt);
		
		LocalTime ankunft = LocalTime.of(8, 34);
		LocalTime abreise = LocalTime.parse("12:36");
		
		System.out.println("Ankunft: " + ankunft);
		System.out.println("Abreise: " + abreise);
		
		Duration dauer = Duration.between(ankunft, abreise);
		System.out.println(dauer);
		System.out.println(dauer.getSeconds());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:m");
		formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		System.out.println(jetzt.format(formatter));
		formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		System.out.println(ZonedDateTime.now().format(formatter));

//		Ist schon Mittagspause?
		System.out.println(LocalTime.now().isAfter(LocalTime.of(13,0)));
	}

}
