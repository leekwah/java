import java.util.Scanner;

public class No_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i;

        for (i=1; i<=9; i++) {
            System.out.println(num + " * " + i + " = " + (num*i) );
        }

        sc.close();
    }
}