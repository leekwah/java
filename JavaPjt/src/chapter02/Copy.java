package chapter02;

public class Copy {

	public static void main(String[] args) {
		String origin="�����ٶ�";
		String copy = origin;
		
		System.out.println(origin); // "�����ٶ�"
		System.out.println(copy); // origin�� ���� => "�����ٶ�"
		
		copy = copy+"���ٻ�";
		System.out.println(copy); // "�����ٶ󸶹ٻ�"
	}

}