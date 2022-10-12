package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1_1 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/output1_1.txt"); // 문자단위로 파일 작성
        // FileWriter 상위계층에 Writer가 있음 (option + H로 상속 확인 가능)
        // 업캐스팅 한 것이다.
        char[] data = "홍길동".toCharArray(); // 한 글자씩 배열원소가 된다.

        for (int i = 0; i < data.length; i++) {
            writer.write(data[i]); // data 배열원소를 반복해서 쓴다.
        }

        writer.close();
    }
}