package chapter06;

class Point2 {
    int x, y;
    public Point2 (int x, int y) {
        this.x = x; this.y = y;
    }
    public String toString() {
        return "Point("+x+", "+y+")";
    }
}
public class ToStringEx {
    public static void main(String[] args) {
        Point2 p = new Point2(2, 3);
        System.out.println(p.toString());
        System.out.println(p); // 위에 것과 같다. 메소드를 같은 것으로 정의했기 때문이다. (주석처리시 해쉬코드 16진수 값)
        System.out.println(p+" 입니다.");

    }
}
