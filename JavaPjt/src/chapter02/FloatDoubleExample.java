package chapter02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//float var1 = 3.14는 기본값이 double이기에 ERROR가 뜬다.
		float var1 = 3.14f; //접미사로 f를 붙인다.
		//float var1 = (float) 3.14; //형변환을 한 것이다.
		double var2 = 3.14;
		
		float var3 = 0.123456789012345678901234211f;
		float var4 = 0.987654321987654321987654321f;
		
		double var5 = 0.123456789012345678901234;
		double var6 = 0.987654321987654321987654321;
		
		double var7 = 3e6;
		float var8 = 3e6f;
		
		double var9 = 3e-3;
		float var10 = 3e-3f;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3); //7번째부터 반올림
		System.out.println("var4 : " + var4); //7번째부터 반올림
		System.out.println("var5 : " + var5); 
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7); //3000000.0
		System.out.println("var8 : " + var8); //3000000.0 var7과 같은 결과가 나온다.
		System.out.println("var9 : " + var9); //0.003
		System.out.println("var10 : " + var10); //0.003
	}
}
