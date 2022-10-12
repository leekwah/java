import java.util.Arrays;

class Ex5_4_1 {
	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));

		// for (int i=0; i < numArr. length; i++) { // 변수 길이만큼만 바꿨을 때
			// int n = (int)(Math.random() * 10);
			// int tmp = numArr[0];
			// numArr[0] = numArr[n];
			// numArr[n] = tmp;
		// }
		
		for (int i=0; i < 100; i++ ) {
			// 100번 반복하게 된다.
			int n = (int)(Math.random() * 10);  // 0~9 중의 한 값을 임의로 얻는다.
			// index값과 맞추기 위해서, *10을 한다.
			int tmp = numArr[0];
			// 배열에 잡힌 것과, 임의의 tmp의 값과 바꾼다.
			// 2장에서 두 변수 값을 바꾼 것과 같다.
			numArr[0] = numArr[n];
			// 섞었는데 중복된 값이 없는 이유 = 처음부터 중복된 값이 없기 때문에
			numArr[n] = tmp;
			
			// tmp = numArr[0]; // numArr[0]의 값을 변수 tmp에 저장한다.
			// numArr[0] = numArr[3]; // numArr[3]의 값을 numArr[0]에 저장한다.
			// numArr[3] = tmp; // tmp의 값을 numArr[3]에 저장한다.
		}
		System.out.println(Arrays.toString(numArr));
	} // main의 끝
}