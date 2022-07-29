package chapter05;

class Point2 {
	private int x,y;
	public Point2() {
		this.x = this.y = 0; // 객체를 생성함과 동시에 0으로 값을 둔다.
	}
	public Point2(int x, int y) {
		this.x = x; 		this.y = y;
	}
	public void showPoint() { // 4. 여기로 이동한다.
		System.out.println("("+x+","+y+")"); 
	}
}

class ColorPoint2 extends Point2 {
	private String color;
	public ColorPoint2(int x, int y, String color) { // 2.여기에서 형식을 지정했기 때문에
		super(x, y); // this x, this.y는 super로 적어야한다. 
		this.color= color;

	}
	public void showColorPoint() { 
		System.out.print(color);
		showPoint(); // 3. 이것도 가야한다.
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint2 cp2 = new ColorPoint2(5,6,"blue"); // 1. 객체를 생성하자마자 값을 넣는 것이다.
		cp2.showColorPoint(); // blue(5,6) 출력
	}
}
