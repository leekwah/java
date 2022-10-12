package chapter06;

public class AutoBoxingUnboxingEx {
    public static void main(String[] args) {
        int n = 10;
        Integer intObject = n; // auto boxing // Integer intObject = Integer.valueOf(n);
        System.out.println("intObject = "+intObject); // System.out.println("intObject = "+intObject.intValue()); 와 같은 것이다.

        int m= intObject + 10; // auto unboxing // m= intObject .intValue() + 10;
        System.out.println("m = " + m);
    }
}
