package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent { // import�ϸ� ���� �����
	// private 	int prv; // ���� Ŭ������ �ƴϱ⿡ ERROR
				// int dft; // ���� ��Ű�� default ���� ��Ű���� �ƴ϶� ERROR
	protected 	int prt; // ���� ��Ű�� + �ڼ�(�ٸ� ��Ű��) - �ڼ��̱⿡ OK 
	public 		int pub; // �������Ѿ��� OK
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
		// System.out.println(p.prv); // ERROR Ŭ���� �ۿ����� ERROR
		// System.out.println(p.dft); // ERROR
		// System.out.println(p.prt); // ERROR
		System.out.println(p.pub); // OK public�ܿ��� �� ERROR
	}

}
