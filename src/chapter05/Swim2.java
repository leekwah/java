package chapter05;

// Swim에서 안되는 것을 인터페이스로 가능하게 한다.
public interface Swim2 {
    abstract void swim();
    int a1 = 7; // 일반 필드 (public static final) 생략
    public static final int a2 = 7;
    final int a3 = 7;


    // 전부 외울 필요는 없다.
    // 되고 안되는 것이 있다는 것이 있다는 걸 알아둬야 한다.

    // void swim();
    // void swim() {
    //      System.out.println("test");
    // }
    // static void swim() {} // abstract가 생략되었음
    // static java9버전이 필요하다.
    // default void swim() {
    //      System.out.println("test");
    // } // 가능
    // default void swim();은 추상메소드라서 불가능하다.
    // void swim(); 가능 // abstract 생략
    // void swim() {} 불가능
}
