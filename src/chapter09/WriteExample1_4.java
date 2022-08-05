package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1_4 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/output1_4.txt"); // 문자단위로 파일 작성
        String data = "안녕 자바 프로그램";

        writer.write(data, 3, 2); // "자바" 를 입력하게 된다.

        writer.close();
    }
}