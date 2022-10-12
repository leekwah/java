package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1_3 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/output1_3.txt"); // 문자단위로 파일 작성
        char[] data = "홍길동".toCharArray(); // 한 글자씩 배열원소가 된다.

        writer.write(data, 1, 2); // 길동만 나오게 된다.

        writer.close();
    }
}