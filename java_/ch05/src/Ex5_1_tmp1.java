import java.util.Arrays;

public class Ex5_1_tmp1 {
	public static void main(String[] args) {
		// index : 0~2
		String[] strArr = {"����","����","��"};
		// ���� : strArr[0], ���� : strArr[1], �� : strArr[2]
		System.out.println(Arrays.toString(strArr));
		// random �żҵ带 �Ἥ �ϳ��� ������ �Ϸ���?
		for(int i=0; i<10; i++) {
			int tmp = (int)(Math.random()*3); // 2�� ���´�.
			System.out.println(strArr[tmp]); // 0~2
		}
	}
}
