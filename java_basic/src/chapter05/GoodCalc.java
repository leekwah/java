package chapter05;
abstract class Calculator{
    public abstract int add(int a, int b); // 두 정수의 합을 구하여 리턴
    public abstract int subtract(int a, int b); // 두 정수의 합을 구하여 리턴
    public abstract double average(int [] a); // 두 정수의 합을 구하여 리턴
}
public class GoodCalc extends Calculator {
    @Override // annotation 어노테이션 => 시스템 주석
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public double average(int [] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum/a.length;
    }
    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(2,3));
        System.out.println(c.subtract(2,3));
        System.out.println(c.average(new int[] {2,3,4})); // 배열은 특이하게 들어가게 된다.
    }
}
