class Ex5_8_1 {
	public static void main(String[] args) {
		// �Ʒ��� score���� int[4][3]�� �ʹ�.
		int[][] score = {
				  { 100, 100, 100 }
				, { 20, 20, 20 }
				, { 30, 30, 30 }
				, { 40, 40, 40 }
		};
		int sum = 0;

		
		// ���� for ������ ����Ѵ�. -> �ܿ� ������ ����Ѵ�.
		for (int i = 0; i < score.length; i++) {
		// score.lenght�� 4�̴�.
			for (int j = 0; j < score[i].length; j++) {
			// score[i].length�� �ι�° �迭�� ���̴�.
			// ���簢���� �ƴ� ��� ������, score[i]�� �ִ� ���� [0]���ٴ� [i]�� ���°� �Ǵ�.
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

				sum += score[i][j];
			}
		}
		// �迭�� ������ ��� �� ���ؼ�, sum���� ����ϴ� ��
		System.out.println("sum=" + sum);
	}
}