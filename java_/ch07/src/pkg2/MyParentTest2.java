package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent { // import하면 에러 사라짐
	// private 	int prv; // 같은 클래스가 아니기에 ERROR
				// int dft; // 같은 패키지 default 같은 패키지가 아니라 ERROR
	protected 	int prt; // 같은 패키지 + 자손(다른 패키지) - 자손이기에 OK 
	public 		int pub; // 접근제한없음 OK
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
		// System.out.println(p.prv); // ERROR 클래스 밖에서는 ERROR
		// System.out.println(p.dft); // ERROR
		// System.out.println(p.prt); // ERROR
		System.out.println(p.pub); // OK public외에는 다 ERROR
	}

}
