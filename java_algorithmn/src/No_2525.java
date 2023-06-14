import java.util.Scanner;

public class No_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HH = sc.nextInt();
        int MM = sc.nextInt();
        int cookingTime = sc.nextInt();

        int afterHour = 0;
        int afterMinute = 0;
        int plusHour;

        if (MM + cookingTime < 60) {
            afterHour = HH;
            afterMinute = MM + cookingTime;
        } else if (MM + cookingTime == 60) { // 더했을 때 60일 때는 1시간만 더함
            afterHour = HH + 1;
            afterMinute = 0;
            if (afterHour >= 24) {
                afterHour = afterHour - 24;
            }
        } else if (MM + cookingTime > 60) {
            plusHour = (MM + cookingTime) / 60; // 더한 값에서 60을 나눈 몫 = 더해야하는 시간
            afterMinute = (MM + cookingTime) % 60; // 더한 값에서 60을 나눈 몫 = 더해야하는 시간
            afterHour = HH + plusHour;

            if (afterHour >= 24) {
                afterHour = afterHour - 24;
            }
        }

        System.out.print(afterHour + " " + afterMinute);

        sc.close();
    }
}