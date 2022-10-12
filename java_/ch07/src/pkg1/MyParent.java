package pkg1;

public class MyParent { // 접근제어자가 default이면 상속해줄 수 없음
//public으로 변경
	private 	int prv; // 같은 클래스
				int dft; // 같은 패키지 default
	protected 	int prt; // 같은 패키지 + 자손(다른 패키지)
	public 		int pub; // 접근제한없음
	
	public void printMembers() {
		System.out.println(prv); // OK 같은 클래스 내에서는 OK
		System.out.println(dft); // OK
		System.out.println(prt); // OK
		System.out.println(pub); // OK
	}
}

class MyParentTest {
	public static void main(String[] args) {
		MyParent p = new MyParent();
		// System.out.println(p.prv); // ERROR 클래스 밖에서는 ERROR
		System.out.println(p.dft); // OK
		System.out.println(p.prt); // OK 
		System.out.println(p.pub); // OK
	}
}
