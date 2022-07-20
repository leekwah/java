package chapter03;

public class ReturnArray { // 배열을 리턴하는 것이다.
	static int[] makeArray() {
		int temp[] = new int[4];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]=i;
		}
		return temp; // 변수처럼 적어도, 배열은 리턴이 된다.
	}
	
	public static void main (String[] args) {
		int intArray[];
		intArray = makeArray();
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
	}
}