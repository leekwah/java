class Data { int x; } // 객체 Data의 타입은 int x이다.

class Ex6_6_1 {
	public static void main(String[] args) { // (1번 실행)
		Data d = new Data(); // 참조변수 d가 만들어진다. 그리고, new Data객체를 생성한다.
		d.x = 10; // d.x의 값을 10으로 바꾼다.
		System.out.println("main() : x = " + d.x); // main() : x = 10으로 출력된다. -> 1번째로 추출 

		change(d.x); // change메소드 호출 -> d.x값을 밑에 change(int x)로 복사된다.
		System.out.println("After change(d.x)"); // 3번째로 추출
		System.out.println("main() : x = " + d.x); // 4번째로 추출
	} // 메인메소드 스택에서 제거 후 프로그램 종료

	static void change(int x) {  // 기본형 매개변수 int (읽기만 가능하다)
								// 만약 바꾸고 싶었다면, 기본형 매개변수 int를 참조형으로 바꾸면 된다.
		x = 1000; // 1000이 x에 들어가게 된다. 하지만, 여기의 x는 이름만 같은 지역변수이다.
		System.out.println("change() : x = " + x); // change() : x = 1000으로 출력 -> 2번째로 추출
	}
}