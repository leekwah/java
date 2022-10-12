class Car {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Car() {
		// 디폴트 값을 지정해주지 않으면, black auto 6으로 해라는 것이다.
		this.color = "black"; 
		this.gearType = "auto"; 
		this.door = 6; 
		
	}  

	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

class Ex6_12 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color    = "yellow";
		c1.gearType = "auto";
		c1.door = 4;

		Car c2 = new Car("white", "auto", 4);
		// 생성과 동시에 값을 white, auto, 4로 지정하는 것이다. 
		
		Car c3 = new Car(); 

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
		System.out.println("c3의 color=" + c3.color + ", gearType=" + c3.gearType+ ", door="+c3.door);
	}
}