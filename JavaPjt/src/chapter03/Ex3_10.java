package chapter03;
// �г⺰ 1,2�б� ���� ���� i�� �г�
// 4�Ⱓ ��ü ���� ��� ��� j�� ����
public class Ex3_10 {
	public static void main(String[] args) {
		// score�� doubleŸ�Կ� 4X2�̴�.
		double score[][] = {{3.3, 3.4},
							{3.5, 3.6},
							{3.7, 4.0},
							{4.1, 4.2}};
		
		// 2���� �迭�� length ����ؼ�,
		double sum = 0;
		for (int i = 0; i < score.length; i++) { // ���� ũ�� = 4
			for (int j = 0; j < score[i].length; j++) { // ���� ũ�� = 2
				sum += score[i][j];
			}
		}
		
		int n = score.length;
		int m = score[0].length;
		System.out.println("4�г� ��ü ���� �����"+sum/(n*m));
	}
}
