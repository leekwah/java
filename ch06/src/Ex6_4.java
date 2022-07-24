class Ex6_4 {
	public static void main(String args[]) {
		// 2. MyMath 객체생성
		MyMath mm = new MyMath();
		// 3. MyMath 객체사용 (객체의 메서드 호출)
		long result1 = mm.add(5L, 3L); // add 메서드 호출
								// 5와 3이 a와 b로 복사된다.
								// 메서드들은 실행 뒤에, 계산된 값들이 호출한 곳으로 돌아오게 된다.
		long result2 = mm.subtract(5L, 3L); // subtract 메서드 호출
		long result3 = mm.multiply(5L, 3L); // multiply 메서드 호출
		double result4 = mm.divide(5L, 3L); // divide 메서드 호출 
		// 기본적으로 같은 형으로 써야하나, 자동형변환은 가능하다.
		mm.printGugudan(3); // 구구단 3단을 출력
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
 }

// 1. MyMath클래스 생성
class MyMath { // 1. (메서드 작성)
	 void printGugudan(int dan) {
			for(int i=1;i<=9;i++) {
					System.out.printf("%d * %d = %d%n", dan, i, dan*i);
			}
 	}

	long add(long a, long b) { // 메서드는 클래스 영역에만 정의 가능하다.
		long result = a + b;
		return result; // 작업을 마치면 호출한 곳으로 돌아온다.
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
						// 더한 값을 바로 반환하는 것이다. (그래서, 이후에는 주석과 같이 처리해져있다.)
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
 }
