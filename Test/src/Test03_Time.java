import java.util.Calendar;

public class Test03_Time {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int minuteOfDay = now.get(Calendar.MINUTE);
		String sc = "현재 시간은 "+hourOfDay+"시"+minuteOfDay+"분 입니다.\n";
		
		String gm = "Good Morning", 
			   ga = "Good Afternoon",
			   ge = "Good evening",
			   gn = "Good Night"; 

		if (4 <= hourOfDay && hourOfDay < 12) {
			System.out.println(sc+gm);
		} else if (12 <= hourOfDay && hourOfDay < 18) {
			System.out.println(sc+ga);
		}else if (18 <= hourOfDay && hourOfDay < 22) {
			System.out.println(sc+ge);
		} else {
			System.out.println(sc+gn);
		}
	}
}