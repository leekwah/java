package chapter02;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127; 
		int i = 100;
		System.out.println(b+i); //227 // type = int 
		System.out.println(10/4); //int로 계산했기 때문에 int인 2가 나온다. 
		System.out.println(10.0/4); //실수인 10.0으로 계산하면, 2.5가 출력된다. 
		System.out.println(10/4.0); //실수인 10.0으로 계산하면, 2.5가 출력된다. 
		System.out.println(2.9 + 1.8); //4.7 
		System.out.println((int)2.9 + 1.8); //앞에 2.9를 int로 2로 바꿨기 때문에 2 + 1.8 이 된 것이다.
		System.out.println((int)(2.9 + 1.8)); //4.7을 int로 바꿨기 때문에 4가 된다.
		System.out.println((int)2.9 + (int)1.8); //2 + 1이 되기에 3이 된다.
	}
}