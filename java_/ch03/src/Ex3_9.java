class Ex3_9 {
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   1백만 = 10^6 
		int b = 2_000_000;    // 2,000,000   2백만 = 10^6
		// a * b = 10^12 이미 int의 범위인 10^9을 넘어버렸기에, 그 전에 형변환을 해야한다.
		long c = (long)a * b;       // a * b = 2,000,000,000,000 ? 

		System.out.println(c); // 음수가 나옴 -1454759936 오버플로우가 발생했다는 걸 알아야한다.
		
	}
}