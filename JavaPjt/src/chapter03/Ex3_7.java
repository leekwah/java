package chapter03;

public class Ex3_7 {

	public static void main(String[] args) {
		int[] evens = {0,2,4,6,8,10,12,14,16,18};
		int[] primes = {2,3,5,7,11,13,17,19};
		
		int evenSum = sum(evens);
		int primesSum = sum(primes);
		
		System.out.println("짝수 배열의 합 :"+evenSum);
		System.out.println("소수 배열의 합 :"+primesSum);
	}
	// int는 반환타입이다. sum은 메서드이다. int[] arr은 매개변수이다.
	public static int sum(int[] arr) { // return을 안하면, int sum이 빨갛게 바뀐다.
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
