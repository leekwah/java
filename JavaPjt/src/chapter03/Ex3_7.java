package chapter03;

public class Ex3_7 {

	public static void main(String[] args) {
		int[] evens = {0,2,4,6,8,10,12,14,16,18};
		int[] primes = {2,3,5,7,11,13,17,19};
		
		int evenSum = sum(evens);
		int primesSum = sum(primes);
		
		System.out.println("¦�� �迭�� �� :"+evenSum);
		System.out.println("�Ҽ� �迭�� �� :"+primesSum);
	}
	// int�� ��ȯŸ���̴�. sum�� �޼����̴�. int[] arr�� �Ű������̴�.
	public static int sum(int[] arr) { // return�� ���ϸ�, int sum�� ������ �ٲ��.
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
