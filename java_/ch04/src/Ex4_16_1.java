class Ex4_16_1 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		while(true) { // ���ѹݺ��� for(;;) {}
			if(sum > 100) // sum�� 100���� ũ�� break�� ����
				break; // �ڽ��� ���� �ϳ��� �ݺ����� �����.
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