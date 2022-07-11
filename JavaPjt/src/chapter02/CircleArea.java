package chapter02;

public class CircleArea {
	public static void main(String[] args) {
		//원의 넓이를 구할 것이다. pi*r^2이다.
		//원의 둘레는 2*pi*r
		final double PI = 3.14; //final은 상수이다.
		//상수이며, 데이터타입은 실수, double이고, 이름은 PI이다.
		double radius = 10.0; //반지름
		double circleArea = radius * radius * PI; // pi*r^2
		System.out.println("원의 면적 : " + circleArea);
	}
}