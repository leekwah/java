package chapter03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		int res, num, cnt = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99������ ������ �Է��Ͻÿ�>>");
		num = scan.nextInt();
		if (1<=num && num<=99) {
			res = num/10;
			if(res == 3 || res==6 || res==9) cnt++;
			res = num%10;
			if(res == 3 || res==6 || res==9) cnt++;
			if(cnt==1) System.out.println("�ڼ�¦");
			else if (cnt == 2) System.out.println("�ڼ�¦¦");
			else System.out.println("3,6,9����");
		}
		else {
			System.out.println("���ڰ� ���� ���");
		}
		scan.close();
	}
}