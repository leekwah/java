import java.util.Arrays;

class Ex5_4_1 {
	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));

		// for (int i=0; i < numArr. length; i++) { // ���� ���̸�ŭ�� �ٲ��� ��
			// int n = (int)(Math.random() * 10);
			// int tmp = numArr[0];
			// numArr[0] = numArr[n];
			// numArr[n] = tmp;
		// }
		
		for (int i=0; i < 100; i++ ) {
			// 100�� �ݺ��ϰ� �ȴ�.
			int n = (int)(Math.random() * 10);  // 0~9 ���� �� ���� ���Ƿ� ��´�.
			// index���� ���߱� ���ؼ�, *10�� �Ѵ�.
			int tmp = numArr[0];
			// �迭�� ���� �Ͱ�, ������ tmp�� ���� �ٲ۴�.
			// 2�忡�� �� ���� ���� �ٲ� �Ͱ� ����.
			numArr[0] = numArr[n];
			// �����µ� �ߺ��� ���� ���� ���� = ó������ �ߺ��� ���� ���� ������
			numArr[n] = tmp;
			
			// tmp = numArr[0]; // numArr[0]�� ���� ���� tmp�� �����Ѵ�.
			// numArr[0] = numArr[3]; // numArr[3]�� ���� numArr[0]�� �����Ѵ�.
			// numArr[3] = tmp; // tmp�� ���� numArr[3]�� �����Ѵ�.
		}
		System.out.println(Arrays.toString(numArr));
	} // main�� ��
}