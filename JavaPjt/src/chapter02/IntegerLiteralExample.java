package chapter02;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		int var1 = 0b1011; // 0b는 2진수 이다.
		//2^3*1 + 2^1*1 + 2^0*1 = 8+2+1 = 11
		int var2 = 0207; // 0이 붙으면 8진수 이다.
		//8^2*2 + 8^1*0 + 8^0*7 = 135
		int var3 = 365; // 10진수는 그대로 적으면 된다.
		//10^2*3 + 10^1*6 + 10^0*5 = 365
		int var4 = 0xB3; // 16진수는 9 이상부터는 ABCDEF(abcdef)로 표시한다.
		//B= 11이다. 11^16*1+16^0*3 = 179
		
		System.out.println("var1 : " + var1); //var1 : 11
		System.out.println("var2 : " + var2); //var2 : 135
		System.out.println("var3 : " + var3); //var3 : 365
		System.out.println("var4 : " + var4); //var4 : 179
	}
}
