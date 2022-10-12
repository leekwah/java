package chapter08;

public class MyPoint {
    private int x, y;
    public MyPoint(int x, int y) {
        this.x = x; this.y = y;
    }
    public String toString() { // 오버라이징 메서드
        return "Point(" + x + ", " + y + ")";
    }
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(4, 50);

        System.out.println("p의 점 "+p);
        if(p.equals(q)) { // 다른 점이라고 나오는 이유는 객체 주소가 다르기 때문이다.
            System.out.println("같은 점\n");
        } else {
            System.out.println("다른 점\n");
        }
        p = q; // 다음과 같이 객체 주소를 대입연산자를 통해서 같게 만들어준다면, 객체주소가 같아진다.
        System.out.println("p의 점 "+p);
        System.out.println("q의 점 "+q);

        if(p.equals(q)) { // 그래서 같은 점으로 출력된다.
            System.out.println("같은 점");
        } else {
            System.out.println("다른 점");
        }
    }
}
