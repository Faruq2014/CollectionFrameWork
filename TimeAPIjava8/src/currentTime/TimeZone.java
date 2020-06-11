package currentTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {

	public static void main(String[] args) {
		toFindCurrentZone();
		allZoneId();
		toFindSpecificTimeZone();
	}

	public static void toFindCurrentZone() {
		// to get the current zone
		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println("the current zone is " + currentZone.getZone());

	}

	public static void allZoneId() {
		int totalTimeZone = ZoneId.getAvailableZoneIds().size();
		System.out.println("total TimeZone" + totalTimeZone);
		System.out.println("zone id int the world:");
		for (String id : ZoneId.getAvailableZoneIds()) {
			if (id.equalsIgnoreCase("Africa/Cairo")) {
				break;
			}
			System.out.println(id);
		}
	}

	public static void toFindSpecificTimeZone() {
		ZonedDateTime currentZone = ZonedDateTime.now();
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");

		ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);

		System.out.println("tokyo time zone is " + tokyoZone);
	}
}
