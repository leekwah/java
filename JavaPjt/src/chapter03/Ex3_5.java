package chapter03;

public class Ex3_5 {
	public static void main(String[] args) {
		// int[] sales; // ����
		int[] sales = new int[5]; // 5���� ũ��� ������ ��, ���� ����
		
		sales[0]=52; // �ε������� ���� ���� ����
		sales[1]=50; // �ε������� ���� ���� ����
		sales[2]=55; // �ε������� ���� ���� ����
		sales[3]=42; // �ε������� ���� ���� ����
		sales[4]=38; // �ε������� ���� ���� ����
		
		int sum = sales[0] + sales[1] + sales[2] + sales[3] + sales[4];
		System.out.println("�� �Ǹŷ� : "+sum);
	}
}
