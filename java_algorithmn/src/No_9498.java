import java.util.Scanner;

public class No_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade = sc.nextInt();
        char result;

        if (grade >= 90 && grade <= 100) {
            result = 'A';
        } else if (grade >= 80 && grade < 90) {
            result = 'B';
        } else if (grade >= 70 && grade < 80) {
            result = 'C';
        } else if (grade >= 60 && grade < 70){
            result = 'D';
        } else {
            result = 'F';
        }

        System.out.print(result);

        sc.close();
    }
}