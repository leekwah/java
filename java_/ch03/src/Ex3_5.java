class Ex3_5 {
	public static void main(String[] args) {
		double d = 85.4; // double은 8 byte이다.
		int score = (int) d; // 형변환을 하려면, (원하는 타입)피연산자 를 해야한다.
		// 형 변환을 해도, 변수 d의 값은 그대로다. 읽어온 값만 85.4만 형변환 한 것이다.
		System.out.println("score=" + score);
		System.out.println("d=" + d);
	}
}