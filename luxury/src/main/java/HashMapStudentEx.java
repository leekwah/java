import java.util.HashMap;
import java.util.Scanner;

class Student {
    private int id;
    private String tel;
    public Student(int id, String tel) {
        this.id = id;
        this.tel = tel;
    }
    public int getId() { return id; }
    public String getTel() { return tel; }
}

public class HashMapStudentEx {
    public static void main(String[] args) {
        var map = new HashMap<String, Student>();
        map.put("황기태", new Student(1, "010-1234-5678"));
        map.put("이재문", new Student(2, "010-8765-4321"));
        map.put("김남윤", new Student(3, "010-1111-1111"));

    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.print("검색할 이름 >> ");
        String name = scanner.nextLine();

        if (name.equals("exit")) { break; }

        Student student = map.get(name);

        if (student == null) {
            System.out.println(name + "은(는) 없는 사람 입니다.");
        } else {
            System.out.println("id : "+student.getId()+ ", 전화번호 : "+student.getTel());
        }
    }
    scanner.close();
    }
}
