import java.util.Arrays;  // Ctrl + Shift + O�� �ڵ����� import�� �߰�

class Ex5_1_3 {
	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60}; // ���̰� 5�� int�迭 
		for(int i=0; i<iArr.length;i++) {
			System.out.println(iArr[i]);
//		System.out.println(iArr); // [I@71dac704
		}
		
		System.out.println(Arrays.toString(iArr));
	}
}