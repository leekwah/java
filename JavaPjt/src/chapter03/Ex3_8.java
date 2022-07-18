package chapter03;

public class Ex3_8 {
	public static void main(String[] args) {
		String str = "Programming is fun! Right?";
		char[] charArr = str.toCharArray(); // 문자열을 char 배열 원소값으로 바꿔주는 메서드
		int count = 0;
		
		// 소문자 R과 대문자 r의 개수를 구하기
		
		for (int i = 0; i < charArr.length; i++) {
			if(charArr[i]== 'R' || charArr[i]== 'r') {
				count++;
			} 
		}
		System.out.println(str);
		System.out.println("=> R(r)의 갯수는 "+count+"개");
	}
}
