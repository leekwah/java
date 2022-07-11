class Ex5_2_1 {
	public static void main(String[] args) {
		int   sum = 0;      // 총점을 저장하기 위한 변수
		float average = 0f; // 평균을 저장하기 위한 변수

		int[] score = {100, 88, 100, 100, 90};
		
		// sum += score[0];
		// sum += score[1];
		// sum += score[2];
		// sum += score[3];
		// sum += score[4];
		
		for (int i=0; i < score.length ; i++ ) {
			sum += score[i];
		}
		average = sum / (float)score.length ; // 올바른 계산결과를 float로 얻기 위해서 형변환

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}
}