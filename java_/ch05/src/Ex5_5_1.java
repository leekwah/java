import java.util.Arrays;

class Ex5_5_1 { 
	public static void main(String[] args) { 
		// index : 0~45-1, 0~44
		int[] ball = new int[45];  // 45���� �������� �����ϱ� ���� �迭 ����.      

		// �迭�� �� ��ҿ� 1~45�� ���� �����Ѵ�. 
		for(int i=0; i < ball.length; i++)       
			ball[i] = i+1;    // ball[0]�� 1�� ����ȴ�.
		// i+1�̱⿡ index�� 0�� �ƴ� 1���� �����Ѵ�.
		// System.out.println(Arrays.toString(ball)); // 1~45���� ���´�.
		
		int tmp = 0;   // �� ���� �ٲٴµ� ����� �ӽú��� 
		int j = 0;     // ������ ���� �� ������ ���� 

		// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�. 
		// 0��° ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		for(int i=0; i < 6; i++) {       
			j = (int)(Math.random() * 45); // 0~44������ ������ ���� ��´�. 
			// index ������ �ٲٱ� ���ؼ� 45�� ���Ѵ�.
			tmp     = ball[i]; 
			ball[i] = ball[j]; 
			ball[j] = tmp; 
		// System.out.println(Arrays.toString(ball)); // 1���� 6�� �ٲ۴�.
		}

		// �迭 ball�� �տ��� ���� 6���� ��Ҹ� ����Ѵ�.
		for(int i=0; i < 6; i++) 
			System.out.printf("ball[%d]=%d%n", i, ball[i]); 
	} 
}