package chapter03;

public class NumberFormatException {
	public static void main(String[] args) {
		String[] stringNumber = {"23","12","3.141592","998"};
//		String[] stringNumber = {"23","12","3","998"};
		int i=0;
		for (i = 0; i < stringNumber.length; i++) {
			try {
				int j = Integer.parseInt(stringNumber[i]); // Integer.parseInt() 메서드를 사용
				System.out.println("숫자로 변환된 값은 "+j);
			} catch (Exception e) { // NumberFormatException을 제목으로 써서, 그냥 Exception만 적으면 된다.
				System.out.println(stringNumber[i]+"정수로 변환할 수 없습니다.");
			}
		}
	}
}
//		try {
//			for (i = 0; i <= stringNumber.length; i++) {
//				int j = Integer.parseInt(stringNumber[i]); // Integer.parseInt() 메서드를 사용
////			int j = Double.parseDouble(stringNumber[i]); // Double.parseDouble() 메서드를 사용해도 안됨 -> catch로 잡아야함
//				System.out.println("숫자로 변환된 값은 "+j);
//			}
//		} catch (Exception e) { // NumberFormatException을 제목으로 써서, 그냥 Exception만 적으면 된다.
//			 System.out.println(stringNumber[i]+"정수로 변환할 수 없습니다.");
//		}
//	}
//}