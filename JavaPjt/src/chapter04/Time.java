package chapter04;

import java.util.Calendar;

public class Time {
	public static void main(String[] args) {
		// 메소드를 호출해서 사용한다 -> 약간 Math.abs처럼 
		Calendar now = Calendar.getInstance();
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int minuteOfDay = now.get(Calendar.MINUTE);
		
		System.out.println(hourOfDay+"시");
		System.out.println(minuteOfDay+"분");
	}
}
