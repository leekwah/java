package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/test.txt"); // 경로의 위치지정
        int readByteNo;
        byte[] readBytes = new byte[3]; // 배열단위 3바이트씩 받음

        // 짧게만들면 다음과 같다.
        String data = "";
        while ((readByteNo = is.read(readBytes)) != -1 ) { // -1이 아닐때 까지 동안 반복
            data += new String(readBytes, 0, readByteNo); // 0부터 읽어서, 데이터를 누적시킨다..
        }
        System.out.println(data);

//        String data = "";
//        while (true) {
//            readByteNo = is.read(readBytes);
//
//            if (readByteNo == -1) {
//                break;
//            }
//
//            // System.out.println(readByteNo); // 3만 출력된다. (if문 쓰기 전 기준)
//            // 쓰고 난 이후에는 3,3,2,-1만 나온다. (3바이트씩 읽기 때문에, 3,3,2,-1이 나온다.)
//
//            // System.out.println((char) readByteNo); // 깨진 폰트가 나오게 된다. 그래서 아래와 같은 걸 실행한다.
//            data += new String(readBytes, 0, readByteNo); // 0부터 읽어서, 데이터를 누적시킨다..
//        }
//        System.out.println(data);

        is.close();
    }
}
