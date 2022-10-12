package chapter07;

public class BoxExample2 {
    public static void main(String[] args) {
        Box2<String> box1 = new Box2<String>();
        box1.set("Hello"); // t에 Hello가 입력된다.
        String greet = box1.get();
        System.out.println(greet);

        Box2<Integer> box2 = new Box2<>();
        box2.set(6);
        int value = box2.get();
        System.out.println();
    }
}
