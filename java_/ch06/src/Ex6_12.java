class Car {
	String color;		// ����
	String gearType;	// ���ӱ� ���� - auto(�ڵ�), manual(����)
	int door;			// ���� ����

	Car() {
		// ����Ʈ ���� ���������� ������, black auto 6���� �ض�� ���̴�.
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
		// ������ ���ÿ� ���� white, auto, 4�� �����ϴ� ���̴�. 
		
		Car c3 = new Car(); 

		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
		System.out.println("c3�� color=" + c3.color + ", gearType=" + c3.gearType+ ", door="+c3.door);
	}
}