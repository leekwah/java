class Data3 { int x; }

class Ex6_8_1 {
	public static void main(String[] args) { // 메인 메소드
		Data3 d = new Data3(); // 참조변수 d 생성, 객체 데이터 3, 클래스 멤버 x 하나
								// d의 주소 0x100
		d.x = 10; // d의  x값에 10을 저장

		Data3 d2 = copy(d); // Data3 d2; d2 = copy(d);이다.
							// 그렇기에 d2가 먼저 생성 후에, copy메소드가 호출된다.
							// copy 메소드 실행되면서, main메소드는 대기
							// copy 메소드로 d값을 복사해준다.
		System.out.println("d.x ="+d.x); // d.x =10
		System.out.println("d2.x="+d2.x); // d2.x=10
	}

	// 반환타입이 참조형이기 때문에, 객체의 주소를 반환한다. -> copy(d)로 반환되고, d2로 저장된다.
	static Data3 copy(Data3 d) { // 참조용 d가 만들어진다.
								// main메소드 지역변수 d의 값을 copy 메소드의 지역변수 d로 복사한다.
								// 이름만 같고, 다른 지역변수 이다.
								// 이 참조변수도 d.x를 가리키게 된다.
		Data3 tmp = new Data3(); // 새로운 객체 tmp를 생성한다.
								// tmp는 0x200으로 예를 든다. 
		tmp.x = d.x;  // d.x의 값을 tmp.x에 복사한다.
					// d.x의 값인 10이 tmp의 값이 10으로 복사된다.
		return tmp;   // 복사한 객체의 주소를 다시 반환한다.
					// 0x200(복사된 값인 10)을 다시 반환하게 된다.
	}
}