package chapter04;

import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		char c;

		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
			s = sc.next();
			c = s.charAt(0);
			
			for(int i = 0; i<=c-'a'; i++) {
				for(char j = 'a'; j<= c-i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			sc.close();
		}
	}