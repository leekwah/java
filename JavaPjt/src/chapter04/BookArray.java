package chapter04;

import java.util.Scanner;

class Book3{
	// 속성
	String title, author;
	// 기본 생성자

	public Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		// 공간 2개짜리의 참조변수
		Book3[] book = new Book3[2];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < book.length; i++) {
			// Book3[2]기에 2번반복하면서, 출력하게 하는 것이다.
			System.out.print("제목 >> ");
			// 문자를 sc로 받아서 title로 지정한다.
			String title = sc.nextLine();
			System.out.print("저자 >> ");
			// 문자를 sc로 받아서 author로 지정한다.
			String author = sc.nextLine();
			
			// 객체 생성하면서, 매개변수를 가지고, 객체 필드 값을 저장한다.  
			book[i] = new Book3(title, author);
		}
		
		// 출력
		for (int i = 0; i < book.length; i++) {
			// book[i]은 객체배열이다.
			System.out.print("("+book[i].title+","+book[i].author+")");
		}
		sc.close();
	}
}
