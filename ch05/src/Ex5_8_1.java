class Ex5_8_1 {
	public static void main(String[] args) {
		// 아래의 score문은 int[4][3]인 것다.
		int[][] score = {
				  { 100, 100, 100 }
				, { 20, 20, 20 }
				, { 30, 30, 30 }
				, { 40, 40, 40 }
		};
		int sum = 0;

		
		// 이중 for 문으로 써야한다. -> 외울 정도로 써야한다.
		for (int i = 0; i < score.length; i++) {
		// score.lenght는 4이다.
			for (int j = 0; j < score[i].length; j++) {
			// score[i].length는 두번째 배열의 길이다.
			// 정사각형이 아닌 경우 때문에, score[i]에 있는 것은 [0]보다는 [i]를 쓰는게 옳다.
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

				sum += score[i][j];
			}
		}
		// 배열의 값들을 모두 다 더해서, sum으로 출력하는 것
		System.out.println("sum=" + sum);
	}
}