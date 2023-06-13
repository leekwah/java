import java.util.Scanner;

public class No_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int result;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            result = 1;
        } else {
            result = 0;
        }

        System.out.print(result);

        sc.close();
    }
}