package chapter02;

import java.util.Scanner;

public class CoffeePrice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("무슨 커피를 드릴까요? (에스프레소, 아메리카노, 카페라떼, 카푸치노 중 선택하세요)");
		// 변수는 order
		String order = scan.next();
		int price = 0;
		
		switch (order) {
			case "에스프레소": case "아메리카노":
				price = 2000;
				break;
			case "카페라떼":
				price = 3000;
				break;
			case "카푸치노":
				price = 3500;
				break;
	
			default:
				System.out.println("메뉴에 없습니다.");
				break;
		}
		// 메뉴에 없는 것도 0원이라고 나오기 때문에, if로 !=0 일 때만, 가격이 나오게 한다.
		if (price !=0) {
		System.out.println(order+"는 "+price+"원 입니다.");
		}
		scan.close();
	}
}
