// 문장에서 특정 문자의 갯수를 출력
package chapter03;

public class ContinueTest {
	public static void main(String[] args) {
		String s ="no news is good news"; 
		int n = 0;
		
		// s.length()는 s라는 문장의 길이를 의미한다.
		// 문자열에 .을 찍으면, 쓸 수 있는 메소드들이 나온다.
		// s.charAt(index) = index에 해당되는 문자를 출력한다.
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'n') { // n이 아닌 경우, n을 증가시키지 않는다.
				continue; 
			}
			n++;
//			if (s.charAt(i) == 'n') { // n을 찾는 것이다. 
//				n++; // n은 문자열의 갯수
//			}
		}
		System.out.println("문자열에서 발견된 n의 갯수는 "+n);
	}
}
