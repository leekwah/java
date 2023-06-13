import java.util.Scanner;

public class No_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        int HH = 0;
        int MM = 0;

        if (M < 60 && M >= 45) {
            HH = H;
            MM = M - 45;
        } else if (M < 45) {
            if (H == 0) {
                HH = 23;
            } else {
                HH = H - 1;
            }
            MM = 60 - 45 + M;
        }

        System.out.print(HH + " " + MM);

        sc.close();
    }
}