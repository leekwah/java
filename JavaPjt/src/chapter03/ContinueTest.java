// ���忡�� Ư�� ������ ������ ���
package chapter03;

public class ContinueTest {
	public static void main(String[] args) {
		String s ="no news is good news"; 
		int n = 0;
		
		// s.length()�� s��� ������ ���̸� �ǹ��Ѵ�.
		// ���ڿ��� .�� ������, �� �� �ִ� �޼ҵ���� ���´�.
		// s.charAt(index) = index�� �ش�Ǵ� ���ڸ� ����Ѵ�.
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'n') { // n�� �ƴ� ���, n�� ������Ű�� �ʴ´�.
				continue; 
			}
			n++;
//			if (s.charAt(i) == 'n') { // n�� ã�� ���̴�. 
//				n++; // n�� ���ڿ��� ����
//			}
		}
		System.out.println("���ڿ����� �߰ߵ� n�� ������ "+n);
	}
}
