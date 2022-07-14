package chapter02;

public class Ramyun {
	public static void main(String[] args) {
		buy();
		boil();
		put();
		eat();
	}	
	// void는 반환타입, boil은 메소드, ()안에 들어가는 것은 입력 변수, 매개변수
	public static void boil() {
		System.out.println("물을 끓인다.");
	} 
	// void 반환타입 buy는 메소드 ()안에 들어오는 것은 입력변수, 매개변수
	public static void buy() {
		System.out.println("라면을 사온다.");
	}
	public static void eat() {
		System.out.println("맛있게 먹는다.");
	} 
	// 메소드 생성 순서는 상관이 없다.
	public static void put() {
		System.out.println("라면을 넣는다.");
	}
	// 절차지향언어면, 위에서부터 차례대로 해야되는 것이지만, 객체지향언어기 때문에
	// 마음대로 해도 된다.
}
