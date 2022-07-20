class MyPoint {
	int x;
	int y;
}

class myCircle extends MyPoint { // 상속을 이용해서 만듬
	int r; // 이러면, int x; int y; int r;이 있는 것이다.
}

class myCircle2 { // 포함
	MyPoint p = new MyPoint(); // 참조변수의 생성과 초기화
							 // 초기화를 하지않으면 생성자에서 해야한다.
	int r;
}

public class InheritanceTest {

	public static void main(String[] args) {
		System.out.println("상속을 이용해서 만든 것");
		myCircle b = new myCircle();
		myCircle2 c = new myCircle2();
		b.x =1;
		b.y =2;
		b.r =3;
		System.out.println("b.x : "+b.x);
		System.out.println("b.y : "+b.y);
		System.out.println("b.r : "+b.r);
		
		System.out.println("포함을 이용해서 만든 것");
		
		c.p.x =1;
		c.p.y =2;
		c.r =3;
		System.out.println("c.p.x : "+c.p.x);
		System.out.println("c.p.y : "+c.p.y);
		System.out.println("c.r : "+c.r);
	}

}
