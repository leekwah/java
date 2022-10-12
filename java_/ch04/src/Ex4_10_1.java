class Ex4_10_1 {
	public static void main(String[] args) { 
		int sum = 0;	// 합계를 저장하기 위한 변수.
		
//		sum =+ 1;
//		sum =+ 2;
//		sum =+ 3;
//		sum =+ 4;
//		sum =+ 5; 을 for문으로 바꾼 것이다.
		
		for(int i=1; i <= 5; i++) {
			sum += i ;	// sum = sum + i;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
		}
	} // main의 끝
}