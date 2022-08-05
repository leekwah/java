package chapter10;

public class TimerThread extends Thread {
    int n = 0;

    public void run() {
        while (true) {
            System.out.println(n);
            n++;

            // 메인메소드는 다른 파일로 생성 후 호출한다.

            try {
                sleep(1000); // 1000ms는 1초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
