package chapter05;

class Point {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	public void set(int x, int y) {
		this.x = x; this.y=y;
	}
	public void showPoint() { // ���� ��ǥ ���
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point {
	private String color; // 2. �÷��� �־��شٴ� ����.
	public void setColor(String color) { // 1. �Ű������� ���� ������
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint(); // ��� �޾ұ� ������ ����� �� �ִ�.
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); // ��ü p���� (p�� ��������) 
							   // �����Ϸ��� �ڵ����� ������ش�.
		p.set(1, 2); // p�� x �� 1, y�� 2�� ���� �ȴ�.
		p.showPoint(); // ��ü�� �����ش�.
		
		ColorPoint cp = new ColorPoint(); // ��ü cp ���� (cp�� ��������)
		cp.set(3, 4); // ��� �޾ұ� ������, cp���� �����Ѵ�.
		cp.setColor("red"); // cp colorPoint���� red�� �ִ´�.
		cp.showColorPoint(); // ��ü cp�� colorPoint�� �����ش�.
	}
}

