class Ex6_3 {
	public static void main(String args[]) { // cv는 객체 생성 없이 사용 가능 (자동으로 생성)
		System.out.println("Card.width = " + Card.width); // cv값
		System.out.println("Card.height = " + Card.height); // cv값

		Card c1 = new Card(); // 객체를 생성함 c1 = kind(heart)와 number(7) 
		c1.kind = "Heart"; // iv값
		c1.number = 7; // iv값

		Card c2 = new Card(); // iv c2 = kind(spade)와 number(4)
		c2.kind = "Spade"; // iv값
		c2.number = 4; // iv값

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;
		c1.height = 80; // iv같아보이지만, c1꺼만 바꿨지만, c2꺼도 바뀌어진다.
		// card.height = 80;
		// card.width = 50; // 이런식으로, 오해하지 않게 적어야한다.

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
	}
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}