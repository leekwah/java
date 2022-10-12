package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/output.txt"); // 생성될 경로의 위치지정
        byte [] data = "ABC".getBytes();

        for (int i = 0; i < data.length; i++) {
            os.write(data[i]);
        }
        os.flush(); // 버퍼링이 있을 때, 강제로 보내는 것
        os.close();
    }
}
