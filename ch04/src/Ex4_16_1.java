class Ex4_16_1 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		while(true) { // 무한반복문 for(;;) {}
			if(sum > 100) // sum이 100보다 크면 break문 실행
				break; // 자신이 속한 하나의 반복문을 벗어난다.
			++i;
			sum += i;
		} // end of while
		
		for(;;) {
			if(sum > 100)
				break;
			++i;
			sum += i;
			}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}