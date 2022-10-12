package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1_2 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/test.txt");
        int readData;
        char[] cbuf = new char[2];
        String data = "";

        while (true) {
            readData = reader.read(cbuf); // 문자단위로 읽음
            if (readData == -1) {
                break;
            }
            data += new String(cbuf, 0, readData); // 0부터 읽어서 readData까지
        }
        System.out.print(data); // 끝나면 data 출력

        reader.close();
    }
}
