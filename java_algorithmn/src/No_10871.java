import java.util.Scanner;

public class No_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        int X = sc.nextInt();

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < A.length; i++) {
            if (X > A[i]) {
                System.out.print(A[i] + " ");
            }
        }

        sc.close();
    }
}