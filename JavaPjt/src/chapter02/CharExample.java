package chapter02;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1); //A 출력
		System.out.println(c2); //65 = UNICODE로 A
		System.out.println(c3); //'역슬래쉬u'는 16진수 0041 = 65
		System.out.println(c4); //가 출력
		System.out.println(c5); //UNICODE 44032 = 가 
		System.out.println(c6); //'역슬래쉬u' 16진수 ac00을 10진수로 바꾸면 44032가 된다.
	}
}
