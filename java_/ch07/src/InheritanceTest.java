class MyPoint { //extends Object�� �����Ϸ��� ���ؼ� ���ԵǴ� ���̴�.
	int x;
	int y;
}

class myCircle extends MyPoint { // ����� �̿��ؼ� ����
	int r; // �̷���, int x; int y; int r;�� �ִ� ���̴�.
}

class myCircle2 { //extends Object�� ���ԵǴ� ���̴�.  // ����
	MyPoint p = new MyPoint(); // ���������� ������ �ʱ�ȭ
							 // �ʱ�ȭ�� ���������� �����ڿ��� �ؾ��Ѵ�.
	int r;
}

public class InheritanceTest {
	public static void main(String[] args) {
		myCircle2 c = new myCircle2();
		System.out.println(c.toString()); // Object �ȿ� ���ִ� ���̱⿡ �����ϴ�.
		// ������ "myCircle2@15db9742" ���ڿ� ��ȯ�� ���̴�.
		// toString �޼���� Ŭ���� �̸��� @ ��ü�� �ּҰ�(��Ȯ���� �ƴ�����)�� �������ش�.
		System.out.println(c); // toString()�� ���� ����� ����.
		// println�� ����̴�. -> ���������� ������, toString�� ȣ���Ѵ�.
		
		System.out.println("����� �̿��ؼ� ���� ��");
		myCircle b = new myCircle();
//		myCircle2 d = new myCircle2();
		b.x =1;
		b.y =2;
		b.r =3;
		System.out.println("b.x : "+b.x);
		System.out.println("b.y : "+b.y);
		System.out.println("b.r : "+b.r);
		
		System.out.println("������ �̿��ؼ� ���� ��");
		
		c.p.x =1;
		c.p.y =2;
		c.r =3;
		System.out.println("c.p.x : "+c.p.x);
		System.out.println("c.p.y : "+c.p.y);
		System.out.println("c.r : "+c.r);
	}

}
