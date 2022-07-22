package chapter04;

public class Circle {
	int radius; 
	String name;
	
	// 클래스 이름과 같은 메서드는 생성자이다.
	public Circle() {} 
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza; // pizza는 참조변수
		pizza = new Circle(); // 객체 생성
		
		pizza.radius = 10;
		pizza.name = "자바피자";
		
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut = new Circle(); // 객체 생성하자마자 변수
		
		donut.radius = 2;
		donut.name = "강알리 등킨드나쓰";
		// double로 적으면, 변수가 겹치기 때문에,그냥 area로 쓴다. 
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}
}