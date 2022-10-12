import java.util.*;

class Ex4_11 {
	public static void main(String[] args) { 

		for (int i=1; i<=5; i++) {
			// System.out.println("**********");과 같은 문장
			for (int j=1; j<=10;j++) {
				System.out.print("*");
			}
			// 줄바꿈이 없기에 추가해야한다.
			System.out.println();
		}
		for (int i=1; i<=10; i++) {
			// System.out.println("**********");과 같은 문장
			for (int j=1; j<=i;j++) {
				System.out.print("*");
			}
			// 줄바꿈이 없기에 추가해야한다.
			System.out.println();
		}
		
//		i = 1,2,3,4,5 5번 {}안의 내용을 반복
//		for (int i=1; i<=5; i++) {
//		System.out.println("**********");
//	}
		
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();

	} // main의 끝
}