class Ex4_17_1 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%2==0) // 2�� ����� �ٲ��� ��쿡 1,3,5, 7, 9�� ��µȴ�.
				continue;
			System.out.println(i);
		}
	}
}