package chapter05;

interface PhoneInterface{
    final int TIMEOUT = 100;
    void sendCall();
    void receiveCall();
    default void printLogo() { // default를 사용해서 메소드 구현
        System.out.println("** Phone **");
    }
}
class SamsungPhone implements PhoneInterface{

    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }
    public void flash() { //SamsungPhone 만의 기능
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone galaxy = new SamsungPhone();
        galaxy.printLogo(); // ** Phone ** 출력
        galaxy.sendCall(); // 띠리리리링 출력
        galaxy.receiveCall(); // 전화가 왔습니다. 출력
        galaxy.flash(); // 전화기에 불이 켜졌습니다. 출력
    }
}
