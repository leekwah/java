package chapter02;

public class Square {
	public static void main(String[] args) {
		int n = 4;
		//2. 메인 메소드에서 밑의 메소드를 호출한다.
		int s = square(n);
		System.out.println(s); // 16이 출력된다.
	}
	//1.여기서 static int는 반환타입이 int라는 뜻이다.
	//(int length는 매개변수이다.)
	public static int square(int length) {
		return length * length;  
	}
}
