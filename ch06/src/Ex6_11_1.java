class Data_1 {
	int value;
	Data_1() {} // 생성자가 없기에 (주석처리 해도) 컴파일러가 원래 넣어주는 것 
}

class Data_2 {
	int value;
	Data_2(){} // 기본 생성자
	Data_2(int x) {   // 매개변수가 있는 생성자.
		value = x;
	}
}

class Ex6_11_1 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error 있던 거 제거
	}
}