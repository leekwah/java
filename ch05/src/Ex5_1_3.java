import java.util.Arrays;  // Ctrl + Shift + O로 자동으로 import문 추가

class Ex5_1_3 {
	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60}; // 길이가 5인 int배열 
		for(int i=0; i<iArr.length;i++) {
			System.out.println(iArr[i]);
//		System.out.println(iArr); // [I@71dac704
		}
		
		System.out.println(Arrays.toString(iArr));
	}
}