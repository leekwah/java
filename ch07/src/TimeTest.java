class Time {
	private int hour;
	private int minute;
	private int second;
	
	//public 메서드를 제공해야한다.
	public void setHour(int hour) {
		if (isNotValidHour(hour)) return; // Alt+Shift+M 으로 메서드를 뺄 수 있다.
		
		this.hour = hour;
	}
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	// 이 안에서만 쓰는 메서드이기 때문에, public이 아닌 private로 쓰는 게 낫다.
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	public int getHour() {return hour;};
}

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(21); // hour의 값을 21로 변경
		System.out.println(t.getHour());
		t.setHour(100); // 100들어오면, return이 된다.
		System.out.println(t.getHour()); // 그대로 21
		
	}
}
