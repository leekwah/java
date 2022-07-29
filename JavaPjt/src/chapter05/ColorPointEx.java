package chapter05;

class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표
	public void set(int x, int y) {
		this.x = x; this.y=y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point {
	private String color; // 2. 컬러로 넣어준다는 얘기다.
	public void setColor(String color) { // 1. 매개변수로 받은 색상을
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint(); // 상속 받았기 때문에 사용할 수 있다.
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); // 객체 p생성 (p는 참조변수) 
							   // 컴파일러가 자동으로 만들어준다.
		p.set(1, 2); // p에 x 값 1, y값 2가 들어가게 된다.
		p.showPoint(); // 객체를 보여준다.
		
		ColorPoint cp = new ColorPoint(); // 객체 cp 생성 (cp는 참조변수)
		cp.set(3, 4); // 상속 받았기 때문에, cp에도 존재한다.
		cp.setColor("red"); // cp colorPoint값에 red를 넣는다.
		cp.showColorPoint(); // 객체 cp의 colorPoint를 보여준다.
	}
}

