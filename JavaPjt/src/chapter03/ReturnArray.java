package chapter03;

public class ReturnArray { // �迭�� �����ϴ� ���̴�.
	static int[] makeArray() {
		int temp[] = new int[4];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]=i;
		}
		return temp; // ����ó�� ���, �迭�� ������ �ȴ�.
	}
	
	public static void main (String[] args) {
		int intArray[];
		intArray = makeArray();
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
	}
}