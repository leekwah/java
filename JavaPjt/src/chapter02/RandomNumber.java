package chapter02;

public class RandomNumber {
	public static void main(String[] args) {
		int n = rollDie();
		System.out.println("�ֻ����� �� : "+n); // 1~6������ ��
	}
	// ��ȯŸ���� double�̴�.
	// �޼ҵ���� rollDie�̴�.
	public static int rollDie() {
		// random�� doubleŸ���̴�. (�׷��� ������ 0�� 1 ������ �Ǽ��� ��ȯ�Ѵ�.)
		// ���� x�� ������ �ִ´�.
		double x = 6 * Math.random(); // 0~5������ ����
		// int temp�� x���ٰ� �ִ´�.
		int tmp = (int)x;
		// Ÿ���� ���� �ʱ� ������, return�� �ٷ� �ȵȴ�.
		return tmp + 1;
	}
}
