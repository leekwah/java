package chapter02;

public class RandomNumber {
	public static void main(String[] args) {
		int n = rollDie();
		System.out.println("주사위의 눈 : "+n); // 1~6까지의 수
	}
	// 반환타입은 double이다.
	// 메소드명은 rollDie이다.
	public static int rollDie() {
		// random은 double타입이다. (그렇기 때문에 0과 1 사이의 실수를 반환한다.)
		// 변수 x의 값으로 넣는다.
		double x = 6 * Math.random(); // 0~5까지의 숫자
		// int temp를 x에다가 넣는다.
		int tmp = (int)x;
		// 타입이 맞지 않기 때문에, return이 바로 안된다.
		return tmp + 1;
	}
}
