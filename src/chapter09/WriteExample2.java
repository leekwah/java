package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/output.txt"); // 생성될 경로의 위치지정
        byte [] data = "DEF".getBytes();

        os.write(data); // 한번에 배열에 데이터 값을 보내는 것
        os.close();
    }
}

