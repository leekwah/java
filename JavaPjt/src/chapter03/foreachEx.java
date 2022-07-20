package chapter03;

public class foreachEx {
	enum Week {월,화,수,목,금,토,일} // 클래스로 되어있어서 세미콜론 없어도 된다.

	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5};
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
		int sum = 0;
		
		// int k의 값에 n 원소 값들을 가져온다.
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은"+sum);

		// string s에 names 원소 값들을 가져온다.
		for (String s : names) {
			System.out.print(s + " ");
		}
		System.out.println();

		// week 열거형
		for (Week day : Week.values()) {
			System.out.print(day + "요일 ");
		}
		System.out.println();
	}

}
