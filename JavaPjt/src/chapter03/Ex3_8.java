package chapter03;

public class Ex3_8 {
	public static void main(String[] args) {
		String str = "Programming is fun! Right?";
		char[] charArr = str.toCharArray(); // ���ڿ��� char �迭 ���Ұ����� �ٲ��ִ� �޼���
		int count = 0;
		
		// �ҹ��� R�� �빮�� r�� ������ ���ϱ�
		
		for (int i = 0; i < charArr.length; i++) {
			if(charArr[i]== 'R' || charArr[i]== 'r') {
				count++;
			} 
		}
		System.out.println(str);
		System.out.println("=> R(r)�� ������ "+count+"��");
	}
}
