package chapter04;

public class ArrayParameterEx {
	static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++) {
			// 매개변수로 받은 배열 바로 출력
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	static void replaceCharArray(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i]=',';
			}
		}
	}
	
	public static void main(String[] args) {
		// c라는 문자열 배열 생성
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		// 위에있는 메서드 호출 (출력 메서드)
		printCharArray(c); // This is a pencil.
		
		// if문으로 스페이스를 ,로 바꾸는 replaceCharArray 메서드 호출
		replaceCharArray(c);
		// 다시 출력 메서드 호출
		printCharArray(c); // This,is,a,pencil.
	}
}