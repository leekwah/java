
public class PrintfEx1 {

	public static void main(String[] args) {
		// System.out.println(10.0/3);
		
		System.out.printf("%d%n", 15); //10
		System.out.printf("%#o%n", 15); //16 // 017
		System.out.printf("%#x%n", 15); //8 // 0xf
		System.out.printf("%s%n", Integer.toBinaryString(15)); // 1111
		
		float f = 123.456789f;
		double g = 123.456789f;
		System.out.printf("%f%n", f); //double 로 하게 되면 정확하게 나온다. 
		System.out.printf("%f%n", g); //double 로 하게 되면 정확하게 나온다. 
		System.out.printf("%e%n", f); 
		System.out.printf("%g%n", f); // 소수점 포함해서 7자리로 된다.
		
		System.out.printf("[%5d]%n",10); // 오른쪽으로 정렬이 된다.
		System.out.printf("[%-5d]%n",10); // 왼쪽정렬이 된다.
		System.out.printf("[%05d]%n",10); // 공백대신 0이 입력된다.
		
		System.out.printf("[%5d]%n",1234567); // 만약 지정된 자리수보다 더 많은 숫자면 그냥 1234567이 다 출력된다. 
		
		double d = 1.23456789;
		System.out.printf("%f%n",d); // 원래 마지막이 7인데 반올림해서 8이 되었다.
		System.out.printf("%14.10f%n",d); // 14자리에서 소수점 10자리가 되었다. 정수자리 앞 2개 00과 소수 뒷자리 두자리가 00이 되었다.
		System.out.printf("%14.6f%n",d); // 14자리에서 소수점 6자리가 되었다.
		System.out.printf("%.6f%n",d); // 소수점만 6자리가 되었다.

		System.out.printf("[%s]%n", "kwah.dothome.co.kr"); // 기본적으로 오른쪽 정렬, %d와 같다.
		System.out.printf("[%20s]%n", "kwah.dothome.co.kr"); // 20자리
		System.out.printf("[%-20s]%n", "kwah.dothome.co.kr"); // 왼쪽으로 정렬
		System.out.printf("[%.4s]%n", "kwah.dothome.co.kr"); // 4자리만 출력
	}

}
