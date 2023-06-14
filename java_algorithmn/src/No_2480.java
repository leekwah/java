import java.util.Scanner;

public class No_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int money = 0;

        if (x == y && y == z && z == x) {
            money = 10000 + 1000 * x;
        } else if (x == y && z != x) {
            money = 1000 + 100 * x;
        } else if (x == z && x != y) {
            money = 1000 + 100 * z;
        } else if (y == z && x != y) {
            money = 1000 + 100 * y;
        } else if (x > y && x > z) {
            money = 100 * x;
        } else if (y > x && y > z) {
            money = 100 * y;
        } else if (z > y && z > x) {
            money = 100 * z;
        }

        System.out.print(money);

        sc.close();
    }
}