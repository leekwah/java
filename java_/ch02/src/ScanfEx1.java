import java.util.Scanner; // 1. import�� �߰�

public class ScanfEx1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // ȭ�鿡�� �Է¹���

		int num1 = scanner.nextInt(); // �Է¹޾Ƽ� num�̶�� ����
		int num2 = scanner.nextInt(); // ���� 2���� ����ϱ� ���ؼ��� �̷��� �ϸ� �ȴ�.
		System.out.println(num1); // num1�� ���
		System.out.println(num2); // num2�� ���

		String input = scanner.nextLine(); // ���δ����� �Է¹޴´�. (���� ������, ����, ���ڿ��� �������� �� ����Ѵ�.)
		int num = Integer.parseInt(input);

		System.out.println(num); // �Է� �Ŀ� ����� �ȴ�.
	}
		// ����� ������ ���� �ݾ�����Ѵ�. ������, ȭ�� ������� JVM�� �˾Ƽ� ���ֱ⿡, �� �ʿ�� ����.
}
