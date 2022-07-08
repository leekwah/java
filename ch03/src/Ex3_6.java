class Ex3_6 {
	public static void main(String args[]) { 
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d%n",  a, b, a + b);
		System.out.printf("%d - %d = %d%n",  a, b, a - b);
		System.out.printf("%d * %d = %d%n",  a, b, a * b);
		System.out.printf("%d / %d = %d%n",  a, b, a / b);
		System.out.printf("%d / %d = %d%n",  a, b, a / b);
		// 10 / 4 = 2.5가 아닌 2가 나오게 된다. (소수점 이하가 버려지게 된다.)
		System.out.printf("%f / %d = %f%n",  (float)a, b, (float)a / b);
		// 내가 추가해 본 것, 아래와 결과 값이 똑같이 나온다. a의 값을 float로 바꾸었다.
		// 인수만큼 앞에 %f / %d = %f%n도 중요하다.
		System.out.printf("%d / %f = %f%n",  a, (float)b, a / (float)b);
		// 나누는 값을 float로 바꿨음 -> 그렇게 해야지 결과값도 float로 받을 수 있다.
		// 한쪽만 바꿔도 float값을 받을 수 있다.
	}
}