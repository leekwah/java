import java.util.Scanner;

class Ex5_10_1{
	public static void main(String[] args) {
		String[][] words = {
			{"chair","의자"},      	// words[0][0], words[0][1]
			{"computer","컴퓨터"}, 	// words[1][0], words[1][1]
			{"integer","정수"}     	// words[2][0], words[2][1]
		};

		//스캐너를 통해서 입력
		Scanner scanner = new Scanner(System.in);

		for(int i=0;i<words.length;i++) {
			// 문제를 보여준다.
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			//%d는 숫자, 정수 출력 지시자
			//%s는 문자열 출력 지시자
			//words[i][0]으로 문제를 낸다.
			String tmp = scanner.nextLine();
			//tmp에 값을 저장한다.
			if(tmp.equals(words[i][1])) {
			//if문으로 맞으면, 맞다는 걸 출력 
				System.out.printf("정답입니다.%n%n");
				//줄바꿈문자로 %n을 썼다. \n을 써도 상관은 없다.
			} else {
				//틀리면 else문으로 틀렸다고 출력, 이후에 배열이 끝날 때 까지 for문
			   System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
			}
		} // for
	} // main의 끝
}