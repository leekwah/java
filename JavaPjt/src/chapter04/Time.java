package chapter04;

import java.util.Calendar;

public class Time {
	public static void main(String[] args) {
		// �޼ҵ带 ȣ���ؼ� ����Ѵ� -> �ణ Math.absó�� 
		Calendar now = Calendar.getInstance();
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int minuteOfDay = now.get(Calendar.MINUTE);
		
		System.out.println(hourOfDay+"��");
		System.out.println(minuteOfDay+"��");
	}
}
