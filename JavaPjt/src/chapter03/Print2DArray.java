package chapter03;

public class Print2DArray {

	public static void main(String[] args) {
		int n[][] = { {1},
					  {1,2,3},
					  {1},
					  {1,2,3,4},
					  {1,2}
					};
		// 출력을 하기 위해서, 이중  for문을 사용한다.
		for (int i = 0; i < n.length; i++) { // n.length는 여기서 행이다.
			for (int j = 0; j < n[i].length; j++) { //n[i]는 행에 있는 인덱스의 개수에 따라서 출력
				System.out.print(n[i][j]);
			}
			System.out.println();
		}
	}
}