import java.util.Arrays;

class Ex5_5_1 { 
	public static void main(String[] args) { 
		// index : 0~45-1, 0~44
		int[] ball = new int[45];  // 45개의 정수값을 저장하기 위한 배열 생성.      

		// 배열의 각 요소에 1~45의 값을 저장한다. 
		for(int i=0; i < ball.length; i++)       
			ball[i] = i+1;    // ball[0]에 1이 저장된다.
		// i+1이기에 index가 0이 아닌 1부터 시작한다.
		// System.out.println(Arrays.toString(ball)); // 1~45까지 나온다.
		
		int tmp = 0;   // 두 값을 바꾸는데 사용할 임시변수 
		int j = 0;     // 임의의 값을 얻어서 저장할 변수 

		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다. 
		// 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
		for(int i=0; i < 6; i++) {       
			j = (int)(Math.random() * 45); // 0~44범위의 임의의 값을 얻는다. 
			// index 범위를 바꾸기 위해서 45를 곱한다.
			tmp     = ball[i]; 
			ball[i] = ball[j]; 
			ball[j] = tmp; 
		// System.out.println(Arrays.toString(ball)); // 1개씩 6번 바꾼다.
		}

		// 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
		for(int i=0; i < 6; i++) 
			System.out.printf("ball[%d]=%d%n", i, ball[i]); 
	} 
}