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
		System.out.print("추측한 숫자를 입력하세요.");
		guess = sc.nextInt();
		
		while(guess != numberToGuess) {
			System.out.println("추측한 숫자가 틀렸습니다.");
			System.out.print("추측한 숫자를 입력하세요 : ");
			guess = sc.nextInt();
			if(guess > numberToGuess) {
				System.out.println(guess + "보다 더 작은 숫자입니다.");
			} else if(guess < numberToGuess) {
				System.out.println(guess + "보다 더 큰 숫자입니다.");
			}
		}
		System.out.println("축하합니다! 정답입니다!");
		sc.close();
	}
}