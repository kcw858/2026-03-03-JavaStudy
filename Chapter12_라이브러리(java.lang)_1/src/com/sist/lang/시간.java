package com.sist.lang;
/*
 *  LocalDateTime
 *  => 날짜와 시간
 *  => LocalDate -> 날짜 , LocalTime -> 시간
 *  
 */
import java.time.*;
import java.time.format.DateTimeFormatter;
public class 시간 {

	public static void main(String[] args) {
		//1.현재 시간과 날짜 
		LocalDateTime now = LocalDateTime.now();
		//final 클래스로 상속할 수 없다 => 오버리이딩 및 변경 불가능 Math, String, StringBuffer, System...
		
		System.out.println(now);
		//timezone이 없다
		
		
		//2.특정 날짜 시간 생성
		LocalDateTime dateTime = LocalDateTime.of(2026, 3, 30, 14, 30,30);
		System.out.println(dateTime);
		
		//3.날짜 / 시간 더하기 및 빼기
		//오라클 SYSDATE
		LocalDateTime f = now.plusDays(4).plusHours(3);
		System.out.println(f);
		
		LocalDateTime p = now.minusMonths(1);
		System.out.println(p);
		
		//값 추출
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		int hour = now.getHour();
		System.out.println(year+"-"+month+"-"+day+" "+ hour+"시");
		
		//문자열 => 날짜형으로 변환
		String str = "2026-03-31 15:47:40";
		DateTimeFormatter ff = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		//MM(월)과 mm(분) 구분   /  hh(12시) HH(24시)
		LocalDateTime t = LocalDateTime.parse(str,ff);
		
		String fff = dateTime.format(ff);
		
		System.out.println(fff);
		
		
	}

}
