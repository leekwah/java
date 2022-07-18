package chapter03;
// 학년별 1,2학기 성적 저장 i는 학년
// 4년간 전체 평점 평균 출력 j는 성적
public class Ex3_10 {
	public static void main(String[] args) {
		// score는 double타입에 4X2이다.
		double score[][] = {{3.3, 3.4},
							{3.5, 3.6},
							{3.7, 4.0},
							{4.1, 4.2}};
		
		// 2차원 배열을 length 사용해서,
		double sum = 0;
		for (int i = 0; i < score.length; i++) { // 행의 크기 = 4
			for (int j = 0; j < score[i].length; j++) { // 열의 크기 = 2
				sum += score[i][j];
			}
		}
		
		int n = score.length;
		int m = score[0].length;
		System.out.println("4학년 전체 평점 평균은"+sum/(n*m));
	}
}
