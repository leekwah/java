package chapter11;

class PointThree {
    private int x, y;
    public PointThree(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }

    protected void move(int x, int y) { this.x = x; this.y = y; }
}

public class Point3D extends PointThree{
    private int z;
    public Point3D(int x, int y, int z) { super(x, y); this.z = z; }
    public int getZ() { return z; }
    public void moveUp() { z++; }
    public void moveDown() { z--; }
    public void move(int x, int y, int z) { move(x, y); this.z = z; }
    public String toString() { return "(" + getX() + "," + getY() + "," + getZ() +")의 점"; }

    public static void main(String[] args) {
        Point3D p = new Point3D(1,2, 3);
        System.out.println(p.toString());

        p.moveUp();
        System.out.println(p.toString());

        p.moveDown();
        p.move(10, 10);
        System.out.println(p.toString());

        p.move(100, 200, 300);
        System.out.println(p.toString());
    }
}