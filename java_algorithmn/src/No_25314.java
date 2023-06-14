import java.util.Scanner;

public class No_25314 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x = N / 4;

        for (int i = 0; i < x; i++) {
            System.out.print("long ");
        }

        System.out.print("int");

        sc.close();
    }
}