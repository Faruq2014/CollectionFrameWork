package currentTime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TimeFormating {

	public static void main(String[] args) {
		monthDayTimeSeconds();
		formating();
		formatingdd_mm_yyyy();

	}

	public static void monthDayTimeSeconds() {
		// printing months days and seconds
		LocalDateTime current = LocalDateTime.now();
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		DayOfWeek week = current.getDayOfWeek();
		int hour = current.getHour();
		int seconds = current.getSecond();
		System.out.println("Month : " + month + " day : " + day + "hour: " + hour + "seconds : " + seconds);

	}

	public static void formating() {
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTime = current.format(format);
		System.out.println("in foramatted manner " + formatedDateTime);
	}

	public static void formatingdd_mm_yyyy() {
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy ");
		String formatedDateTime = current.format(format);
		System.out.println("in foramatted manner " + formatedDateTime);
	}
}
