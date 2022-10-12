package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;
// import java.io.FileNotFoundException;

public class ReadExample1 {
    // public static void main(String[] args) throws FileNotFoundException {
        // InputStream is = new FileInputStream("/User/kwah/Documents/aaa.rtf"); // 경로의 위치지정
    // }
    public static void main(String[] args) throws Exception {
        // 업캐스팅, InputStream은 추상클래스
        InputStream is = new FileInputStream("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/test.txt"); // 경로의 위치지정
        int readByte;

        // EOF (End of File : -1 값을 체크하게 된다. = 파일 끝까지 읽었다는 것을 의미한다.)
//        while (true) {
//            readByte = is.read(); // readByte가 int로 변환 필요
//
//            if (readByte == -1) { //97 = a, 13 = \n, 98 = b, 99 = c
//                break;
//            }
//            System.out.print((char)readByte); // 문자열로 출력
//            // System.out.print(readByte); // 숫자로 출력
//        }

        // 위의 코드를 줄이면 아래와 같이 된다.
        while ((readByte = is.read()) != -1) {
            System.out.print((char)readByte);
        }

        is.close();
    }
}
