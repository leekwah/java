package chapter05;

// 추상 클래스는 추상메소드가 있어야한다.
// 상속받는 것이 해야하는 것이기에 {} 를 쓰지 않고, 그냥 세미콜론으로 끝낸다.
// 다중상속이 되지 않기 때문에, 인터페이스를 만든 것이다.
abstract class Swim {
    abstract void swim();
}
