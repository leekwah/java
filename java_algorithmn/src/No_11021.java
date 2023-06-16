import java.util.Scanner;

public class No_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("Case #" + i + ": " + (x + y));
        }

        sc.close();
    }
}