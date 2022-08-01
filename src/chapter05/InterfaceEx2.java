package chapter05;

interface iPhoneInterface {
    final int TIMEOUT = 100;
    void sendCall();
    void receiveCall();
    default void printLogo() { // default를 사용해서 메소드 구현
        System.out.println("** Phone **");
    }
}
interface MobilePhoneInterface extends iPhoneInterface { // 인터페이스의 상속 (다중 상속 가능)
    void sendSMS(); // 추상메소드
    void receiveSMS(); // 추상메소드
}
interface MP3Interface {
    public void play(); // 추상메소드
    public void stop(); // 추상메소드
}
class PDA {
    public int calculate (int x, int y) {
        return x + y;
    }
}
class ApplePhone extends PDA implements MobilePhoneInterface, MP3Interface {

    @Override
    public void sendCall() {
        System.out.println("전화 발신 중");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화 수신 중");
    }
    public void flash() { // iPhone 만의 기능
        System.out.println("FLASH ON");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자 발신 중");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자 수신 중");
    }

    @Override
    public void play() {
        System.out.println("Music Start");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop");
    }

    public void schedule() {
        System.out.println("스케쥴 관리");
    }
}
public class InterfaceEx2 {
    public static void main(String[] args) {
        ApplePhone iPhone = new ApplePhone();
        iPhone.printLogo(); // ** Phone ** 출력
        iPhone.sendCall(); // 전화 발신 중 출력
        iPhone.receiveCall(); // 전화 수신 중 출력
        iPhone.flash(); // FLASH ON 출력
        iPhone.play(); // Music Start 출력
        iPhone.stop(); // Music Stop 출력
        iPhone.sendSMS(); // 문자 발신 중 출력
        iPhone.receiveSMS(); // 문자 수신 중 출력
        iPhone.schedule(); // 스케쥴 관리 출력
        System.out.println("3과 5를 더하면 "+iPhone.calculate(3,5)); // 3과 5를 더하면 8 출력
    }
}
