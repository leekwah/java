package chapter02;

public class Copy {
	public static void main(String[] args) {
		String origin="가나다라";
		String copy = origin;
		
		System.out.println(origin); //"가나다라"
		System.out.println(copy); //origin이 나옴 => "가나다라"
		
		copy = copy+"마바사";
		System.out.println(copy); //"가나다라마바사"
	}
}
