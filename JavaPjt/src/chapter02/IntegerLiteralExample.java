package chapter02;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		int var1 = 0b1011; // 0b�� 2���� �̴�.
		// 2^3*1 + 2^1*1 + 2^0*1 = 8+2+1 = 11
		int var2 = 0207; // 0�� ������ 8���� �̴�.
		// 8^2*2 + 8^1*0 + 8^0*7 = 135
		int var3 = 365; // 10������ �״�� ������ �ȴ�.
		// 10^2*3 + 10^1*6 + 10^0*5 = 365
		int var4 = 0xB3; // 16������ 9 �̻���ʹ� ABCDEF(abcdef)�� ǥ���Ѵ�.
		// B= 11�̴�. 11^16*1+16^0*3 = 179
		
		System.out.println("var1 : " + var1); // var1 : 11
		System.out.println("var2 : " + var2); // var2 : 135
		System.out.println("var3 : " + var3); // var3 : 365
		System.out.println("var4 : " + var4); // var4 : 179
	}

}