package chapter03;

public class NumberFormatException {
	public static void main(String[] args) {
		String[] stringNumber = {"23","12","3.141592","998"};
//		String[] stringNumber = {"23","12","3","998"};
		int i=0;
		try {
			for (i = 0; i < stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]); // Integer.parseInt() �޼��带 ���
//			int j = Double.parseDouble(stringNumber[i]); // Double.parseDouble() �޼��带 ����ص� �ȵ� -> catch�� ��ƾ���
				System.out.println("���ڷ� ��ȯ�� ���� "+j);
			}
		} catch (Exception e) { // NumberFormatException�� �������� �Ἥ, �׳� Exception�� ������ �ȴ�.
			 System.out.println(stringNumber[i]+"������ ��ȯ�� �� �����ϴ�.");
		}
	}
}