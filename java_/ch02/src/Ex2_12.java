class Ex2_12 {
	public static void main(String args[]) {
		String str = "3";

		System.out.println(str.charAt(0) - '0'); // ���� 3�� ���� 3�� �ȴ�.
		System.out.println(str.charAt(0) - '1'); // ���� 2
		System.out.println('3' - '0' + 1); // ���� 4 +1 ������ �� �� �ִ�.
		System.out.println(Integer.parseInt("3") + 1); // ���� 4
		System.out.println("3" + 1); //���� 3 + ���� 1�� �ٲ��. 31�� �ȴ�.
		System.out.println((char)(3 + '0'));   // ���� 3 '0'�� ���ڷ� 48, 
	}
}