package chapter05;

public class Main {
    public static void main(String[] args) {
        Animal a; // Animal 클래스의 참조변수 a
        // a = new Animal(); // 추상메소드는 객체 생성을 못해서 바로 에러가 뜨게 된다.
        Bird b;
        // b = new Bird(); // Bird 또한 추상메소드이기 때문에, 객체 생성이 불가능하다.

        // Penguin p;
        // p = new Penguin(); // 객체 생성이 가능하다. (public class이기 때문이다.)
        Penguin p = new Penguin(); // 선언과 동시에 객체 생성 (위에 두 줄을 한 번에)
        p.swim(); // penguin swims 출력된다.

        Bird p2 = new Penguin(); // 업캐스팅을 한 것이다. (Bird로 객체 생성은 안되었지만, 그 타입으로 받는 것은 된다.)
        p2.walk(); // bird walk가 출력된다.
        System.out.println(p2.wings); // 2가 출력된다.
        // p2.swim은 존재하지 않는다. -> 업캐스팅을 했기 때문에 슈퍼클래스 멤버만 접근하기 때문이다.

        // Penguin p3 = p2; 다운캐스팅이 필요하기 때문에 오류가 난다.
        Penguin p3 = (Penguin) p2; // 다운캐스팅 적용
        p3.swim(); // penguin swims 출력된다. 다운 캐스팅을 적용했기 때문이다.

        // Duck d = new Duck();
        Bird d = new Duck(); // 업캐스팅
        // d.fly 불가능하다. => 업캐스팅을 했기 때문에 슈퍼클래스 멤버만 접근 가능하다.
        d.eat(); // bird eat 출력된다.

        // Duck d2 = d; 다운캐스팅이 필요하기 때문에 오류가 난다.
        Duck d2 = (Duck) d;
        d2.fly(); // duck flies 출력된다.
        d2.swim(); // duck swims 출력된다.

        Animal d3 = new Duck(); // 업캐스팅
        int x = d3.life; // x값에 d3.life의 값인 1을 대입한다.
        System.out.println("x===>"+x); // x===>1이 출력된다.

        // Swim2 s = new Swim(); 인터페이스도 객체를 만들 수 없다.
        Swim2 s = new Penguin(); // 인터페이스도 추상클래스처럼 타입을 지정할 수 있다.
        s.swim(); //penguin swims 출력된다.

        // Bird p99 = new Penguin();
        Bird[] p99 = new Penguin[2];
        p99[0] = new Penguin();
        p99[0].walk(); // walk 출력된다. (메소드 호출)

        Swim2[] s2 = new Swim2[2]; // 각각의 점에 대해서, 객체를 만든 것이다. (배열을 만든 것)
        s2[0] = new Penguin();
        s2[1] = new Duck();
        // s2[2] = new Duck(); index 초과해서 생성은 됨 -> 하지만 실행하게 되면 ArrayIndexOutOfBoundsException이 나오게 된다.

    }
}
