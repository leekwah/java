class Ex5_3_1 { 
	public static void main(String[] args) { 
		int[] score = { 79, 88, 91, 33, 100, 55, 95 }; 

		int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다. 
		int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다. 
		
		for(int i=1; i < score.length;i++) {
				
			// 1일 떄, 88이 들어오면, max 79
			// max값이 77에서 88로 바뀌게 된다.
			// 계속 바뀌게 되다가 91이고, 31이 비교될 때,
			// else if로 가게 된다. 33과 79를 비교하게 된다.
			// max에는 최대값이 남고, min에는 최소값이 남게 된다.
			
			if(score[i] > max) { 
				max = score[i]; 
			} else if(score[i] < min) { 
				min = score[i]; 
			} 
		} // end of for 

		System.out.println("최대값 :" + max);       
		System.out.println("최소값 :" + min);       
	} // end of main 
} // end of class