package chapter04;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		int numberToGuess;
		int guess;
		
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();
		numberToGuess = generator.nextInt(10)+1;
		System.out.print("������ ���ڸ� �Է��ϼ���.");
		guess = sc.nextInt();
		
		while(guess != numberToGuess) {
			System.out.println("������ ���ڰ� Ʋ�Ƚ��ϴ�.");
			System.out.print("������ ���ڸ� �Է��ϼ��� : ");
			guess = sc.nextInt();
			if(guess > numberToGuess) {
				System.out.println(guess + "���� �� ���� �����Դϴ�.");
			} else if(guess < numberToGuess) {
				System.out.println(guess + "���� �� ū �����Դϴ�.");
			}
		}
		System.out.println("�����մϴ�! �����Դϴ�!");
		sc.close();
	}
}