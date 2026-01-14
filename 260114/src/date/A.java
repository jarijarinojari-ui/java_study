package date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class A {
	void a() {
		ZoneId seoulZone = ZoneId.of("Asia/Seoul");
		System.out.println(seoulZone);
		LocalDate d = LocalDate.now();
		System.out.println(d);
	}
	void a2() {
		// 1. 모든 ZoneID 가져오기 (리턴 타입이 Set<String>입니다)
        Set<String> allZones = ZoneId.getAvailableZoneIds();

        // 2. 정렬을 위해 List로 변환
        // (Set은 순서가 뒤죽박죽이라 정렬을 못해서, List에 담습니다)
        List<String> zoneList = new ArrayList<>(allZones);
        
        // 오름차순 정렬 (ABC순)
        Collections.sort(zoneList);
        //출력
        for (String zone : zoneList) {
            System.out.println(zone);
        }
	}
	void a3() {
		ZoneId seoulZone = ZoneId.of("America/New_York"); 
		LocalTime now = LocalTime.now(seoulZone);
		System.out.println(now);
	}
	void a4() {
		LocalDate d = LocalDate.of(2026, 1, 17);
		d = d.plusDays(1);
		System.out.println(d);
	}
	void a5() {
		LocalTime t = LocalTime.of(0, 30, 33);
		System.out.println(t.plusNanos(1234545667));
		
	}
	void a6() {
		LocalDateTime dt = LocalDateTime.now();
		LocalDateTime dt2 = LocalDateTime.of(2026, 1,15,14,30,10);
		
		dt2 = dt2.plusNanos(1234567889);
		dt2 = dt2.plusWeeks(1);
		System.out.println(dt2);
	}
	void a7() {
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		ZoneOffset zo = zdt.getOffset();
		System.out.println(zo);
	}
	void a8 () {
		ZonedDateTime szdt = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		ZonedDateTime nzdt =
				szdt.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println(szdt);
		System.out.println(nzdt);
	}
	void a9 () {// 평일 계산
		LocalDate start = LocalDate.of(2025, 11, 27);
		LocalDate end = LocalDate.of(2026, 1, 14);
		
		long businesDays = start.datesUntil(end)
				.filter(date -> {
					DayOfWeek day = date.getDayOfWeek();
					return day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;
				})
				.count();
		businesDays = (int)businesDays;
		businesDays -= 3;
		System.out.println("평일 수: "+businesDays);
		
	}
	void a10() {//날짜 포맷
		LocalDateTime dateTime = LocalDateTime.of(2016,1,14,13,10,20);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd a hh:mm:ss");
		String formatted = dateTime.format(formatter);
		System.err.println(formatted);
	}
	
}
