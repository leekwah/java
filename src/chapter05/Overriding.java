package chapter05;

class Weapon {
    protected int fire() {
        return 1;
    }
}
class Cannon extends Weapon { // Weapon에서 상속 받음 -> fire를 쓰겠다는 얘기
    @Override
    protected int fire() { // fire는 Overriding 된 것이다.
        return 10;
    }
}
public class Overriding {
    public static void main(String[] args) {
        Weapon weapon; // 클래스와 참조변수
        weapon = new Weapon(); // 객체 생성
        System.out.println("기본 무기의 살상 능력은 "+weapon.fire());

        weapon = new Cannon(); // 객체 생성
        System.out.println("대포의 살상 능력은 "+weapon.fire());
    }
}
