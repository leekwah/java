package chapter09;

class TV {
    private int size;
    public TV(int size) {
        this.size = size;
    }
    protected int getSize() {
        return size;
    }
}

public class ColorTV extends TV {
    private final int resolution;

    public ColorTV(int size, int resolution) {
        super(size);
        this.resolution = resolution;
    }
    public void printProperty() {
        System.out.print(getSize()+"인치 "+resolution+"컬러");
    }

    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    }
}
