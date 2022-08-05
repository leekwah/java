package chapter10;

public class ThreadEx {
    public static void main(String[] args) {
        ThreadEx1 th1 = new ThreadEx1(); // thread1 생성

        Runnable r = new ThreadEx2();
        Thread th2 = new Thread(r); // thread2 생성

        th1.start();
        th2.start();
        // 원래는 th1이 다 끝나고, th2가 실행되어야 하지만, 멀티스레드는 동시에 실행이 된다.
    }
}

class ThreadEx1 extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("i : "+i);
        }
    }
}
class ThreadEx2 implements Runnable {
    public void run(){
        for (int j = 10; j < 15; j++) {
            System.out.println("j : "+j);
        }
    }
}
