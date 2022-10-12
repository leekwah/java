import java.util.Scanner; // 1. import문 추가

public class ScanfEx1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 화면에서 입력받음

		int num1 = scanner.nextInt(); // 입력받아서 num이라고 저장
		int num2 = scanner.nextInt(); // 변수 2개를 출력하기 위해서는 이렇게 하면 된다.
		System.out.println(num1); // num1을 출력
		System.out.println(num2); // num2을 출력

		String input = scanner.nextLine(); // 라인단위로 입력받는다. (값을 여러개, 숫자, 문자열이 섞여있을 때 사용한다.)
		int num = Integer.parseInt(input);

		System.out.println(num); // 입력 후에 출력이 된다.
	}
		// 입출력 관련은 원래 닫아줘야한다. 하지만, 화면 입출력은 JVM이 알아서 해주기에, 할 필요는 없다.
}
