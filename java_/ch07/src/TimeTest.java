class Time {
	private int hour;
	private int minute;
	private int second;
	
	//public �޼��带 �����ؾ��Ѵ�.
	public void setHour(int hour) {
		if (isNotValidHour(hour)) return; // Alt+Shift+M ���� �޼��带 �� �� �ִ�.
		
		this.hour = hour;
	}
	// �Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼���
	// �� �ȿ����� ���� �޼����̱� ������, public�� �ƴ� private�� ���� �� ����.
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	public int getHour() {return hour;};
}

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(21); // hour�� ���� 21�� ����
		System.out.println(t.getHour());
		t.setHour(100); // 100������, return�� �ȴ�.
		System.out.println(t.getHour()); // �״�� 21
		
	}
}
