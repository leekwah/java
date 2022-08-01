package chapter05;

// abstract class인 이유는 조류 밑에 있는 애들이 객체 생성을 하면 된다.
abstract class Bird extends Animal {
    public int wings = 2;
    public void walk() {
        System.out.println("bird walk");
    }
    public void eat() {
        System.out.println("bird eat");
    }
}
