package chapter04;

class Calc{
	public static int abs(int a) {
		return (a > 0) ? a : -a; // a�� 0���� ũ�� a�� 0���� ������ -a�� ��� (���밪)
	}
	public static int max(int a, int b) {
		return (a > b) ? a : b ; // a�� b���� ũ�� a�� b���� ������ b�� ��� (�ִ밪)
	}
	public static int min(int a, int b) {
		return (a < b) ? a : b ; // a�� b���� ũ�� a�� b���� ������ b�� ��� (�ִ밪)
	}
}

public class CalcEx {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}

}
