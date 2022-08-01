package chapter05;

class OuterClass {
    private String secret = "Time is money";
    public OuterClass() {
        InnerClass obj = new InnerClass();
        obj.method();
    }
    private class InnerClass { // 내부클래스
        public InnerClass() {
            System.out.println("내부 클래스의 생성자입니다.");
        }
        public void method() {
            System.out.println(secret);
        }
    }
}

public class OuterClassTest {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
    }
}
