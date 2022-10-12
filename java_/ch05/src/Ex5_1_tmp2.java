import java.util.Arrays;

public class Ex5_1_tmp2 {
	public static void main(String[] args) {
		//			01234
		String str = "ABCDE";
		char ch0 = str.charAt(2); //index 3번째에 있는 문자
		System.out.println(ch0); //C 출력
		char ch1 = str.charAt(0); //index 1번째에 있는 문자
		System.out.println(ch1); //A 출력
		
		String str2 = str.substring(1,4); //인덱스 1부터 4까지출력 (2에서 4까지) (to는 생략)
		String str3 = str.substring(1); //인덱스 1부터 끝까지출력 (2에서 4까지) (to는 생략)
		String str4 = str.substring(1, str.length()); //메서드라서 괄호 필요하다.
		//substring(1, 5)와 같은 것이다.
		System.out.println(str2); // BCD출력 
		System.out.println(str3); // BCDE출력 
		System.out.println(str4); // BCDE출력 
		}
	}