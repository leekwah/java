import java.util.Arrays;

public class Ex5_1_tmp1 {
	public static void main(String[] args) {
		// index : 0~2
		String[] strArr = {"가위","바위","보"};
		// 가위 : strArr[0], 바위 : strArr[1], 보 : strArr[2]
		System.out.println(Arrays.toString(strArr));
		// random 매소드를 써서 하나가 나오게 하려면?
		for(int i=0; i<10; i++) {
			int tmp = (int)(Math.random()*3); // 2가 나온다.
			System.out.println(strArr[tmp]); // 0~2
		}
	}
}
