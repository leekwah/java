class MyPoint3 extends Object 	{
	int x;
	int y;
	
//	MyPoint3(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
	
	
	String getLocation() {
		return "x:"+x+", y:"+y;
	}
	
	// ObjectŬ������ toString()�� �������̵�
	// ����ΰ� ���ƾ��ϱ� ������, public�� �ٿ������Ѵ�.
	public String toString() {
		return "x:"+x+", y:"+y;
	}
}

class MyPoint3D extends MyPoint3 {
	int z;
	// ������  getLocation()�� �������̵�
	String getLocation() {
		return "x:"+x+", y:"+y+", z:"+z;
	}
}

public class OverridTest {

	public static void main(String[] args) {
		MyPoint3D p = new MyPoint3D();
		p.x = 3;
		p.y = 5;
		p.z = 7;
		System.out.println(p.getLocation());
		
		// �������̵� ����ϱ� �� ���
		// ���� �ؾߵǴ� ��
		 MyPoint3 r = new MyPoint3();
		 r.x = 3;
		 r.y = 5;
		 System.out.println("r.x ="+r.x);
		 System.out.println("r.y ="+r.y);
		
		// �������̵� ����� �� ���
//		MyPoint3 r = new MyPoint3(3,5);
//		System.out.println(r); // �������̵� ����� �� ��� (�Ʒ����� �� ������)
//		System.out.println(r.toString()); 
		
	}
}