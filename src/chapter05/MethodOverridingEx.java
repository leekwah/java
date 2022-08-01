package chapter05;

class Shape{
    public void draw() { // 만약 이게 없다면, 제일 아래 거는 Line이 아닌 Shape가 출력이 된다.
        System.out.println("Shape"); // Overriding이 되지 않기 때문이다.
    }
}

class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}
public class MethodOverridingEx {
    static void paint(Shape p) { // 완전히 Shape p = new Shape()라고 할 수 있진 않지만, 이렇게 이해하면 편하다.
        p.draw();
    }
    public static void main(String[] args) {
        // Shape shape = new Shape();
        // Line line = new Line();

        // paint(shape);
        // paint(new Shape()); // 위에것과 같은 것이다.

        Shape shape = new Line(); // 업캐스팅
        paint(shape); // Line이 출력된다.

        paint(new Rect()); // Rect가 출력된다.
        paint(new Circle()); // Circle이 출력된다.
    }
}