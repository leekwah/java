package chapter03;

public class Ex3_5 {
	public static void main(String[] args) {
		// int[] sales; // 선언
		int[] sales = new int[5]; // 5개의 크기로 생성한 것, 값은 없음
		
		sales[0]=52; // 인덱스마다 값을 각각 넣음
		sales[1]=50; // 인덱스마다 값을 각각 넣음
		sales[2]=55; // 인덱스마다 값을 각각 넣음
		sales[3]=42; // 인덱스마다 값을 각각 넣음
		sales[4]=38; // 인덱스마다 값을 각각 넣음
		
		int sum = sales[0] + sales[1] + sales[2] + sales[3] + sales[4];
		System.out.println("총 판매량 : "+sum);
	}
}
