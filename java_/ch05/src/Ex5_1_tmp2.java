import java.util.Arrays;

public class Ex5_1_tmp2 {
	public static void main(String[] args) {
		//			01234
		String str = "ABCDE";
		char ch0 = str.charAt(2); //index 3��°�� �ִ� ����
		System.out.println(ch0); //C ���
		char ch1 = str.charAt(0); //index 1��°�� �ִ� ����
		System.out.println(ch1); //A ���
		
		String str2 = str.substring(1,4); //�ε��� 1���� 4������� (2���� 4����) (to�� ����)
		String str3 = str.substring(1); //�ε��� 1���� ��������� (2���� 4����) (to�� ����)
		String str4 = str.substring(1, str.length()); //�޼���� ��ȣ �ʿ��ϴ�.
		//substring(1, 5)�� ���� ���̴�.
		System.out.println(str2); // BCD��� 
		System.out.println(str3); // BCDE��� 
		System.out.println(str4); // BCDE��� 
		}
	}