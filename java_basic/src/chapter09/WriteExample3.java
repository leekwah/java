package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("/Users/kwah/Documents/GitHub/space_java/JavaPjt/output.txt"); // 생성될 경로의 위치지정
        byte [] data = "DEF".getBytes();

        os.write(data,1, 2); // index 1번부터 시작해서 2번까지 쓰기 때문에, E와 F만 저장된다.
        os.close();
    }
}