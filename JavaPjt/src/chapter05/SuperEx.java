package chapter05;

class Point2 {
	private int x,y;
	public Point2() {
		this.x = this.y = 0; // ��ü�� �����԰� ���ÿ� 0���� ���� �д�.
	}
	public Point2(int x, int y) {
		this.x = x; 		this.y = y;
	}
	public void showPoint() { // 4. ����� �̵��Ѵ�.
		System.out.println("("+x+","+y+")"); 
	}
}

class ColorPoint2 extends Point2 {
	private String color;
	public ColorPoint2(int x, int y, String color) { // 2.���⿡�� ������ �����߱� ������
		super(x, y); // this x, this.y�� super�� ������Ѵ�. 
		this.color= color;

	}
	public void showColorPoint() { 
		System.out.print(color);
		showPoint(); // 3. �̰͵� �����Ѵ�.
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint2 cp2 = new ColorPoint2(5,6,"blue"); // 1. ��ü�� �������ڸ��� ���� �ִ� ���̴�.
		cp2.showColorPoint(); // blue(5,6) ���
	}
}
