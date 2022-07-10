class Ex4_8_1 {
	public static void main(String args[]) {
		for (int i = 1; i <= 10; i=i+2) {// 1부터 10까지 2씩 증가
			// 굳이 1부터 할 필요는 없지만, 숫자를 세기 편하게 하기 위해서 
			System.out.println("Hello");
		}
		for (int i = 1; i <= 10; i=i*2) {// 1부터 10까지 2배씩 증가
			// for의 뜻 : ~하는 동안 (조건이 참인 동안)
			System.out.println("Yeah");
		}
		for (int i = 10; i >= 1; i--) {// 시작부터 False면, 실행이 되지 않는다.
			// for의 뜻 : ~하는 동안 (조건이 참인 동안)
			System.out.println("no");
		}
		for (int i = 1, j = 10; i <= 10; i++, j--) {// 변수 2개도 사용 가능하다.
			// 하지만, 같은 type이여야한다.
			// for문 안에 선언되어 있기에, for문 안에서만 사용 가능하다.
			
			System.out.println("i="+i);
		}
		int i;
		for (i = 1; i <= 10; i++) {// 변수 i를 밖에 선언할 수도 있다.
			//변수 범위(scope)가 좁을 수록 좋다. -> 잘못되었을 경우에 확인해야할 게 적기 때문이다.
			System.out.println("sure");
		}
		// 무한 반복문
		// for (;;) {
			//System.out.println("hello");
		//}
		// 이것도 무한 반복문이다.
		// for (;true;) {
		//System.out.println("hello");
		//}
	}
}