class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;

		// 괄호{} 안의 내용을 10번 반복한다.
		// Quiz1. 1~10사이의 난수를 10개 출력하시오.
		// Quiz2. -5~5사이의 난수를 10개 출력하시오.
		// -5,-4,-3,-2,-2,-1,0,1,2,3,4,5 = 11개
		for (int i = 1; i <= 10; i++) {
			System.out.println(Math.random()); // 0.0 <= x <1.0
			System.out.println(Math.random()*10); // 0.0 <= x <10.0
			System.out.println((int)(Math.random()*10)); // 형변환으로 0 <= x <10
			System.out.println((int)(Math.random()*10)+1); // 형변환으로 1 <= x+1 <11
			
			System.out.println((int)(Math.random()*11)); // 형변환으로 0 <= x <11
			System.out.println((int)(Math.random()*11) - 5); // 형변환으로 0 - 5 <= x - 5 <11 - 5
		}
	}
}