
class Ex5_1_1 {
	public static void main(String[] args) {
//		int[] score; // 1. �迭 score�� ���� (��������)
//		score = new int[5]; // 2. �迭�� ����(int ������� x 5) -> ���������� ����
		int[] score = new int[5]; // �迭�� ������ ������ ���ÿ� �Ѵ�.
		score[3] = 100; // 4��° index�� 100 ����
		
		System.out.println("score[0] = "+score[0]);
		System.out.println("score[1] = "+score[1]);
		System.out.println("score[2] = "+score[2]);
		System.out.println("score[3] = "+score[3]); // 100�� ��µȴ�.
		System.out.println("score[4] = "+score[4]);
		
		int value = score[3];
		System.out.println("value = "+value);
	}
}