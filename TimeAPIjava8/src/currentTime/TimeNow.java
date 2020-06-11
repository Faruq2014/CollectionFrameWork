package currentTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class TimeNow {

	public static void main(String[] args) {
		TimeNow t = new TimeNow();
		t.LocalTime();
		timeAndDate();
		t.LocalDateTime();
		LocalMonth();
	}

	public void LocalTime() {
		java.time.LocalTime time = java.time.LocalTime.now();
		System.out.println("the current time is " + time);
	}

	public static void timeAndDate() {
		// Get the current date and time
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current Date and Time: " + currentTime);
	}

	public void LocalDateTime() {

		LocalDate date1 = LocalDate.now();
		System.out.println("local date: " + date1);
	}

	public static void LocalMonth() {
		LocalDateTime current = LocalDateTime.now();
		// printing months days and seconds
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		System.out.println("Month : " + month + " day : " + day + " seconds : " + seconds);
	}
}
