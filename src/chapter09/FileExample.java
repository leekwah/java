package chapter09;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {
        File dir = new File("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/dir/dir"); // 경로 지정
        File file1 = new File("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/dir/file1.txt");
        File file2 = new File("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/dir/file2.txt");
        File file3 = new File("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/dir/file3.txt");

        // dir.mkdir(); // 객체 생성 메소드 (지정된 경로가 존재하지 않으면, 생성이 되지 않는다.)
        dir.mkdirs(); // 객체 생성 메소드 (지정된 경로가 없으면, 지정된 경로까지 다 만들어주는 것이다.)
        file1.createNewFile(); // 파일 새로 생성하는 메소드 = createNewFile()
        file2.createNewFile();
        file3.createNewFile();

        File test = new File("/Users/kwah/Documents/GitHub/space_java/JavaPjt/io_test/dir");
        File[] contents = test.listFiles(); // 파일 여러개 목록을 배열로

        System.out.println("날짜          시간       형태   크기    이름");
        System.out.println("-------------------------------------------------------------------");

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd a hh:mm"); // DD로 쓰게 되면, 217이 나온다. (2022-08-05 기준)
        for (int i = 0; i < contents.length; i++) {
            System.out.print(sdf.format(new Date(contents[i].lastModified()))); // lastModified = 마지막으로 변경된 날짜 (ms 단위)
            // Date 클래스를 사용해서, ms를 바꾼다.
            if (contents[i].isDirectory()) {
                System.out.print("\t\t<DIR>\t\t\t" + contents[i].getName());

            } else {
                System.out.println("\t\t\t\t"+contents[i].length()+"\t"+contents[i].getName());
            }
        }
    }
}
