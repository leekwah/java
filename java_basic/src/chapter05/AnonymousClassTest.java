package chapter05;

interface RemoteControl {
    void turnOn(); // abstract method
    void turnOff(); // abstract method
}
public class AnonymousClassTest {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("TV turnOn");
            }
            @Override
            public void turnOff() {
                System.out.println("TV turnOff");
            }
        };
        rc.turnOn(); // TV turnOn 출력
        rc.turnOff(); // TV turnOff 출력
    }
}