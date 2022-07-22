package chapter04;

public class Book2 {
	String title;
	String author;
	void show() {System.out.println(title + " " + author);}
	
	public Book2() {
		this("","");
	}
	
	public Book2(String title) {
		this(title, "���ڹ̻�");
	}
	
	public Book2(String title, String author) {
		this.title = title; this.author = author;
	}
	public static void main(String[] args) {
		Book2 littlePrince2 = new Book2();
		Book2 littlePrince = new Book2("�����","�������丮");
		Book2 emptyBook = new Book2();
		Book2 loveStory = new Book2("������");
		littlePrince2.show();
		littlePrince.show();
		loveStory.show();
		emptyBook.show();
	}
}
