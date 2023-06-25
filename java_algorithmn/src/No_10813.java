import java.io.IOException;
import java.util.Scanner;

public class No_10813 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        int M = sc.nextInt();
        int temp;

        for(int a = 0; a < arr.length; a++) {
            arr[a] = a + 1;
        }

        for(int b = 0; b < M; b++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }

        for(int c = 0; c <arr.length; c++) {
            System.out.print(arr[c] + " ");
        }

        sc.close();
    }
}