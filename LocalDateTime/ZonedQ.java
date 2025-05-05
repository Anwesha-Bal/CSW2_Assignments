package LocalDateTime;
import java.time.*;
import java.util.*;

public class ZonedQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId id = ZoneId.of("Asia/Seoul");
		System.out.println(id);
		Set <String> allIds= ZoneId.getAvailableZoneIds();
		System.out.println(allIds);
		ZonedDateTime specificZone = ZonedDateTime.of(LocalDateTime.now(),id);
		System.out.println(specificZone);
		LocalDateTime ltd = LocalDateTime.of(2018,Month.MARCH,10,07,20);
		ZoneOffset os = ZoneOffset.of("+04:00");
		OffsetDateTime osbyfour = OffsetDateTime.of(ltd, os);
		System.out.println(osbyfour);
	}

}
