import java.util.Arrays;

public class Ex5_1_tmp3 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4}; // 1차원 배열 arr
		int[][] arr2D = {{11,12}, {21,22}}; // 2차원 배열 arr2D
		
		System.out.println(Arrays.toString(arr)); // 1차원 배열 출력시에
		System.out.println(Arrays.deepToString(arr2D)); // 2차원 배열 이상 출력시에 사용
		
		String[][] str2D1 = new String[][]{{"aaa", "bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][]{{"aaa", "bbb"},{"AAA","BBB"}};

		//System.out.println(str2D1==str2D2); // 참조변수 값 비교
		System.out.println(Arrays.deepEquals(str2D1, str2D2)); //2차원 이상은 deepEquals

		
		int[] arr1 = {0, 1, 2, 3, 4};
		int[] arr2 = Arrays.copyOf(arr1, arr1.length); // arr2=[0, 1, 2, 3, 4]
		int[] arr3 = Arrays.copyOf(arr1, 3); // arr3=[0, 1, 2]
		int[] arr4 = Arrays.copyOf(arr1, 7); // arr4=[0, 1, 2, 0, 0, 0, 0]
		int[] arr5 = Arrays.copyOfRange(arr1, 2, 4); // arr5 = [2, 3]
		int[] arr6 = Arrays.copyOfRange(arr1, 0, 7); // arr6 = [0, 1, 2, 3, 4, 0, 0]
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
		int[] arr7 = {3, 2, 0, 1, 4};
		System.out.println(Arrays.toString(arr7)); // [0, 1, 2, 3, 4]
		Arrays.sort(arr7); // 배열 arr을 정렬한다.
		System.out.println(Arrays.toString(arr7)); // [0, 1, 2, 3, 4]
		
		}
	}