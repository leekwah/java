package chapter05;

public class Duck extends Bird implements Swim2, Fly2 {
    public void swim() {
        System.out.println("duck swims");
    }
    public void fly() {
        System.out.println("duck flies");
    }
}
