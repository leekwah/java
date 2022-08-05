package chapter10;

class PointTwo {
    private int x, y;
    public PointTwo(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x = x; this.y = y; }
}

public class ColorPointTwo extends PointTwo {
    
    private String color = "null";
    public ColorPointTwo() { this(0,0); }
    public ColorPointTwo(int x, int y) { super(0,0); color = "BLACK"; }
    public void setXY(int x, int y) { move(x, y); }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() { return color +"색의 ("+ getX()+", "+getY()+")의 점"; }

    public static void main(String[] args) {
        ColorPointTwo zeroPoint = new ColorPointTwo();
        System.out.println(zeroPoint.toString()+"입니다."); // 기본 zeroPoint 출력 (0,0) BLACK (기존 메소드 오버로딩)

        ColorPointTwo cp = new ColorPointTwo(10,10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        String str = cp.toString(); // Override 하지 않으면, 객체의 주소가 출력된다.
        System.out.println(str+"입니다.");
    }
}