import java.util.Calendar;

public class Test3_Time {

	class nowTime {
		int hourOfDay;
		int minuteOfDay;
		void show() {System.out.println("���� �ð��� "+hourOfDay+"��"+ minuteOfDay+"�� �Դϴ�.";}

	public Book3() {
		this("","");
	}
		
	public static void main(String[] args) {
		Book3 littlePrince2 = new Book3();
		Book3 littlePrince = new Book3("�����","�������丮");
		Book3 emptyBook = new Book3();
		Book3 loveStory = new Book3("������");
		littlePrince2.show();
		littlePrince.show();
		loveStory.show();
		emptyBook.show();
	}
	
	public static void main(String[] args) {
		Book2 littlePrince2 = new Book2();	
		Calendar now = Calendar.getInstance();
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int minuteOfDay = now.get(Calendar.MINUTE);
		
		System.out.println(hourOfDay+"��");
		System.out.println(minuteOfDay+"��");
	}
}
