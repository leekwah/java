import java.util.Scanner;

public class No_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int square;

        if (x > 0 && y > 0) {
            square = 1;
        } else if (x > 0 && y < 0) {
            square = 4;
        } else if (x < 0 && y < 0) {
            square = 3;
        } else if (x < 0 && y > 0){
            square = 2;
        } else {
            square = 0;
        }

        System.out.print(square);

        sc.close();
    }
}