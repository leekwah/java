package chapter04;

public class Circle {
	int radius; 
	String name;
	
	// Ŭ���� �̸��� ���� �޼���� �������̴�.
	public Circle() {} 
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza; // pizza�� ��������
		pizza = new Circle(); // ��ü ����
		
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
		Circle donut = new Circle(); // ��ü �������ڸ��� ����
		
		donut.radius = 2;
		donut.name = "���˸� ��Ų�峪��";
		// double�� ������, ������ ��ġ�� ������,�׳� area�� ����. 
		area = donut.getArea();
		System.out.println(donut.name+"�� ������ "+area);
	}
}