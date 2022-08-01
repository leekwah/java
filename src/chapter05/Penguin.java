package chapter05;
// 인터페이스는 implements를 사용한다.
public class Penguin extends Bird implements Swim2 {
    // penguin의 상속받은 멤버는 현재 4개
    // Animal의 life 1개와 Bird의 wings, walk, eat 3개
    // swim이 오버라이즈 된 것이다.
    public void swim() {
        System.out.println("penguin swims");
    }
}
