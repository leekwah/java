package chapter04;

// 같은 패키지에서 중복이 있으면 안된다.
// 클래스 앞에 아무것도 없는 걸 default class라고 한다.

class Circle3 {
	int radius;
	// 기본 생성자 = 클래스 이름과 같은 것
	// public Circle3() {}
	
	// 매개변수를 넣어주면 기본 생성자와 다르다. 
	public Circle3(int radius) {
		this.radius = radius;
	}

	// return이 없으면, 밑줄이 뜬다.
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	// 에뮬레이터 2개 중에 하나 선택해라고 한다.
	// public static void main(String[] args) {
		// System.out.println("2");
	// }
}

public class CircleArray {
	public static void main(String[] args) {
		// System.out.println("1");
		
		// 객체 배열 선언
		Circle3[] c;
		// 배열 생성 (값을 선언하지 않았음)
		c = new Circle3[5];
		
		for (int i = 0; i < c.length; i++) {
			// 객체 생성 (값을 넣는 것)
			c[i] = new Circle3(i);
			// 이것을 5번 복사한다는 것이다.
			// public Circle3(int radius) {
				// this.radius = radius;
			// }
		}
		
		// for를 두번 쓴 이유는 출력하는 것을 보여주기 위해서 쓴 것이다.
		for (int i = 0; i < c.length; i++) {
			// 바로 출력
			// 주소가 출력된다.
			// System.out.println(c[i]); 
			System.out.println(c[i].getArea()+" <- double 타입");
			// 넓이가 출력된다.
			// 넓이를 int 타입으로 출력한 것이다.
			System.out.println((int)c[i].getArea()+" <- int 타입");
		}
	}
}
