package chapter03;

public class Print2DArray {

	public static void main(String[] args) {
		int n[][] = { {1},
					  {1,2,3},
					  {1},
					  {1,2,3,4},
					  {1,2}
					};
		// ����� �ϱ� ���ؼ�, ����  for���� ����Ѵ�.
		for (int i = 0; i < n.length; i++) { // n.length�� ���⼭ ���̴�.
			for (int j = 0; j < n[i].length; j++) { //n[i]�� �࿡ �ִ� �ε����� ������ ���� ���
				System.out.print(n[i][j]);
			}
			System.out.println();
		}
	}
}