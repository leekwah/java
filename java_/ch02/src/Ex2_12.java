class Ex2_12 {
	public static void main(String args[]) {
		String str = "3";

		System.out.println(str.charAt(0) - '0'); // 문자 3이 숫자 3이 된다.
		System.out.println(str.charAt(0) - '1'); // 문자 2
		System.out.println('3' - '0' + 1); // 숫자 4 +1 때문에 알 수 있다.
		System.out.println(Integer.parseInt("3") + 1); // 숫자 4
		System.out.println("3" + 1); //문자 3 + 문자 1로 바뀐다. 31로 된다.
		System.out.println((char)(3 + '0'));   // 문자 3 '0'은 숫자로 48, 
	}
}