package chapter03;

public class ContinueSamYkGu {
	public static void main(String[] args) {
	
		for (int i = 1; i <= 10; i++) {
			if (i%3 == 0) {
				System.out.print("�ڼ�¦");
				continue;
			} else {
			System.out.print(i);
			}
		}
	}
}