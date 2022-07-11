package chapter02;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업"); // \t는 tab을 의미한다.
		System.out.print("행 단위 출력\n"); // \n으로 줄바꿈을 할 수 있다.
		System.out.println("우리는 \"개발자\" 입니다."); // \로 특수문자 앞에 쓴다.
		System.out.println("봄\\여름\\가을\\겨울"); // \\를 하면, 각각 역슬래쉬가 생긴다. 
	}
}
