package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1_1 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/test.txt");
        int readData;
        // 반복문 사용
        while (true) {
            readData = reader.read(); // 문자단위로 읽음
            if (readData == -1) {
                break;
            }
            System.out.print((char)readData);
        }
        reader.close();
    }
}
