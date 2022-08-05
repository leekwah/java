package chapter11;

interface Shape {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void reDraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}
class Oval implements Shape {
    private int height, width;
    public Oval(int height, int width) { this.height = height; this.width = width; }
    @Override
    public void draw() { System.out.println(height + "X" + width +"에 내접하는 타원입니다."); }
    @Override
    public double getArea() {
        double calOval = PI * height/2 * width/2 ;
        return calOval;
    }
}
class Rect implements Shape {
    private int height, width;
    public Rect(int height, int width){ this.height = height; this.width = width; }
    @Override
    public void draw() {System.out.println(height+ "X" + width + "크기의 사각형 입니다.");}
    @Override
    public double getArea() {
        double calRect = height * width;
        return calRect;
    }
}

class Circle implements Shape {
    private int radius;
    public Circle(int radius) { this.radius = radius; }
    @Override
    public void draw() {
        System.out.println("반지름이 "+ radius +"인 원입니다.");
    }
    @Override
    public double getArea() { return radius * radius * PI; }
}

public class Shapes {
    public static void main(String[] args) {
        Shape donut = new Circle(10);
        donut.reDraw();
        System.out.println("면적은 "+donut.getArea());

        Shape [] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);

        for (int i = 0; i < list.length; i++) {
            list[i].reDraw();
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println("면적은 " + list[i].getArea());
        }
    }
}
