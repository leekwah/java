class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;

		// ��ȣ{} ���� ������ 10�� �ݺ��Ѵ�.
		// Quiz1. 1~10������ ������ 10�� ����Ͻÿ�.
		// Quiz2. -5~5������ ������ 10�� ����Ͻÿ�.
		// -5,-4,-3,-2,-2,-1,0,1,2,3,4,5 = 11��
		for (int i = 1; i <= 10; i++) {
			System.out.println(Math.random()); // 0.0 <= x <1.0
			System.out.println(Math.random()*10); // 0.0 <= x <10.0
			System.out.println((int)(Math.random()*10)); // ����ȯ���� 0 <= x <10
			System.out.println((int)(Math.random()*10)+1); // ����ȯ���� 1 <= x+1 <11
			
			System.out.println((int)(Math.random()*11)); // ����ȯ���� 0 <= x <11
			System.out.println((int)(Math.random()*11) - 5); // ����ȯ���� 0 - 5 <= x - 5 <11 - 5
		}
	}
}