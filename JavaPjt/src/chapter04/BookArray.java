package chapter04;

import java.util.Scanner;

class Book3{
	// �Ӽ�
	String title, author;
	// �⺻ ������

	public Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		// ���� 2��¥���� ��������
		Book3[] book = new Book3[2];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < book.length; i++) {
			// Book3[2]�⿡ 2���ݺ��ϸ鼭, ����ϰ� �ϴ� ���̴�.
			System.out.print("���� >> ");
			// ���ڸ� sc�� �޾Ƽ� title�� �����Ѵ�.
			String title = sc.nextLine();
			System.out.print("���� >> ");
			// ���ڸ� sc�� �޾Ƽ� author�� �����Ѵ�.
			String author = sc.nextLine();
			
			// ��ü �����ϸ鼭, �Ű������� ������, ��ü �ʵ� ���� �����Ѵ�.  
			book[i] = new Book3(title, author);
		}
		
		// ���
		for (int i = 0; i < book.length; i++) {
			// book[i]�� ��ü�迭�̴�.
			System.out.print("("+book[i].title+","+book[i].author+")");
		}
		sc.close();
	}
}
