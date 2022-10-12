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
	
	// Object클래스의 toString()을 오버라이딩
	// 선언부가 같아야하기 때문에, public은 붙여놔야한다.
	public String toString() {
		return "x:"+x+", y:"+y;
	}
}

class MyPoint3D extends MyPoint3 {
	int z;
	// 조상의  getLocation()을 오버라이딩
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
		
		// 오버라이딩 사용하기 전 방식
		// 원래 해야되는 것
		 MyPoint3 r = new MyPoint3();
		 r.x = 3;
		 r.y = 5;
		 System.out.println("r.x ="+r.x);
		 System.out.println("r.y ="+r.y);
		
		// 오버라이딩 사용한 뒤 방식
//		MyPoint3 r = new MyPoint3(3,5);
//		System.out.println(r); // 오버라이딩 사용한 뒤 방식 (아래것을 더 간단히)
//		System.out.println(r.toString()); 
		
	}
}