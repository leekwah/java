package chapter02;

public class Cylinder {
	public static void main(String[] args) {
		double r = 7;
		double h = 5;
		// double인 이유 = r과 h도 double이고, 아래 return값도 double이기에 전부 double로 통일했다.
		double v = volume(r, h); // 메소드(매개변수)
		System.out.println("반지름이 "+r+"이고 높이가 "+h+"인 원기둥의 부피는 "+v+"입니다.");
		// 반지름이 7.0이고 높이가 5.0인 원기둥의 부피는 769.6902001294993입니다.
	}
	// double은 반환타입이다.
	// volume은 메소드 이름이다. volume(안에는 매개변수 2개가 들어간다.)
	public static double volume(double radius, double height) {
		// 반환값이 없을 때는 메소드에 빨간 줄이 뜬다.
		return Math.PI * radius * radius * height; // 원기둥의 부피
			}
}
