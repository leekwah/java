package chapter06;
class Point3 {
    int x, y;
    public Point3(int x, int y) {
        this.x = x; this.y = y;
    }

    @Override
    public boolean equals(Object obj) { // 오버라이징
        Point3 p = (Point3)obj; // 다운캐스팅
        if (x == p.x && y == p.y) {
            return true;
        } else {
            return false;
        }
    }
}
public class EqualsEx {
    public static void main(String[] args) {
        Point3 a = new Point3(2, 3);
        Point3 b = new Point3(2, 3);
        Point3 c = new Point3(3, 4);

        if (a == b) // false
            System.out.println("a==b");

        if (a.equals(b))  // true
            System.out.println("a is equals to b");

        if (a.equals(c))  // false
            System.out.println("a is equal to b");
    }
}
