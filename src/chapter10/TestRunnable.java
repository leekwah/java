package chapter10;

public class TestRunnable {
    public static void main(String[] args) {
        Thread th = new Thread(new TimerRunnable());
        th.start();
    }
}