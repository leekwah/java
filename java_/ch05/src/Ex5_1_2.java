
class Ex5_1_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println("arr.length = "+arr.length);
		
		//모든 요소를 출력
		for(int i=0;i<arr.length;i++) { // index 범위를 벗어나서 에러가 자주 뜨기에. arr.length를 쓰는게 중요하다.
			System.out.println("arr["+i+"] = " + arr[i]);
		}
	}
}