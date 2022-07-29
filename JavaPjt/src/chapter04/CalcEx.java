package chapter04;

class Calc{
	public static int abs(int a) {
		return (a > 0) ? a : -a; // a가 0보다 크면 a를 0보다 작으면 -a로 출력 (절대값)
	}
	public static int max(int a, int b) {
		return (a > b) ? a : b ; // a가 b보다 크면 a를 b보다 작으면 b를 출력 (최대값)
	}
	public static int min(int a, int b) {
		return (a < b) ? a : b ; // a가 b보다 크면 a를 b보다 작으면 b를 출력 (최대값)
	}
}

public class CalcEx {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}

}
