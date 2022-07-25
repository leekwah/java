package chapter04;

// ���� ��Ű������ �ߺ��� ������ �ȵȴ�.
// Ŭ���� �տ� �ƹ��͵� ���� �� default class��� �Ѵ�.

class Circle3 {
	int radius;
	// �⺻ ������ = Ŭ���� �̸��� ���� ��
	// public Circle3() {}
	
	// �Ű������� �־��ָ� �⺻ �����ڿ� �ٸ���. 
	public Circle3(int radius) {
		this.radius = radius;
	}

	// return�� ������, ������ ���.
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	// ���ķ����� 2�� �߿� �ϳ� �����ض�� �Ѵ�.
	// public static void main(String[] args) {
		// System.out.println("2");
	// }
}

public class CircleArray {
	public static void main(String[] args) {
		// System.out.println("1");
		
		// ��ü �迭 ����
		Circle3[] c;
		// �迭 ���� (���� �������� �ʾ���)
		c = new Circle3[5];
		
		for (int i = 0; i < c.length; i++) {
			// ��ü ���� (���� �ִ� ��)
			c[i] = new Circle3(i);
			// �̰��� 5�� �����Ѵٴ� ���̴�.
			// public Circle3(int radius) {
				// this.radius = radius;
			// }
		}
		
		// for�� �ι� �� ������ ����ϴ� ���� �����ֱ� ���ؼ� �� ���̴�.
		for (int i = 0; i < c.length; i++) {
			// �ٷ� ���
			// �ּҰ� ��µȴ�.
			// System.out.println(c[i]); 
			System.out.println(c[i].getArea()+" <- double Ÿ��");
			// ���̰� ��µȴ�.
			// ���̸� int Ÿ������ ����� ���̴�.
			System.out.println((int)c[i].getArea()+" <- int Ÿ��");
		}
	}
}
