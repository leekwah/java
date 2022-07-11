class Ex4_17_1 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%2==0) // 2의 배수로 바꿨을 경우에 1,3,5, 7, 9만 출력된다.
				continue;
			System.out.println(i);
		}
	}
}