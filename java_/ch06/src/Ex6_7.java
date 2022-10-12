class Data2 { int x; }

class Ex6_7 {
	public static void main(String[] args) { // 메인메소드 호출
		Data2 d = new Data2(); // d를 만들고, 객체 Data2를 생성한다.
		d.x = 10; // d가 가리키는 데이터 x값에 10을 대입한다.
		System.out.println("main() : x = " + d.x); // main() : x = 10 -> 1번째 출력

		change(d); // change 메소드 호출 -> main 메소드 대기상태 변경
				// d가 참조형 변수기에 값 복사
		System.out.println("After change(d)"); // After change(d) 출력 -> println 종료
		System.out.println("main() : x = " + d.x); // main() : x = 1000 -> println 종료
	} // main 메소드 종료 후 스택 비워지고 프로그램 종료

	// 참조변수를 통해서 객체 d의 값을 변경할 수 있었다.
	// 객체를 다룰 수 있는 주소를 준것이다. -> change메소드에서 객체를 다룰 수 있게 된다.
	static void change(Data2 d) { // 참조형 매개변수로 메인메소드의 지역변수인 d의 값을 변경할 수 있었다.
		d.x = 1000;	// d = 지역변수
		System.out.println("change() : x = " + d.x); // change위에 println 올라간다.
		// -> change() : x = 1000 출력 -> println 종료 -> change 메소드 돌아감
	}
}