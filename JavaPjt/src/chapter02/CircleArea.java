package chapter02;

public class CircleArea {
	public static void main(String[] args) {
		//���� ���̸� ���� ���̴�. pi*r^2�̴�.
		//���� �ѷ��� 2*pi*r
		final double PI = 3.14; //final�� ����̴�.
		//����̸�, ������Ÿ���� �Ǽ�, double�̰�, �̸��� PI�̴�.
		double radius = 10.0; //������
		
		double circleArea = radius * radius * PI; // pi*r^2
		System.out.println("���� ���� : " + circleArea);
	}
}