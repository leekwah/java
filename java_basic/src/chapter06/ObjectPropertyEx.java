package chapter06;

class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class ObjectPropertyEx {
    // static은 공유가 가능한 것
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName()); // 메소드 안의 메소드, // 클래스의 이름 출력
        System.out.println(obj.hashCode()); // 해쉬코드
        System.out.println(obj.toString()); // 객체 값을 문자열로 출력 + @ + 해쉬코드를 16진수로
        System.out.println(obj); // 객체 자체를 출력시에, toString()과 같은 걸로 취급
    }
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        print(p);
    }
}
