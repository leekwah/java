package chapter03;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		int money = scan.nextInt();
		int moneyminus = money-50000;
		int fiftythousand = money/50000;
		int tenhousand = (moneyminus*fiftythousand)/10000;
		int thousand = ((moneyminus*fiftythousand)-10000*tenhousand)/1000;
		int hundred = (((moneyminus*fiftythousand)-10000*tenhousand)-1000*thousand)/100;
		int fifty = ((((moneyminus*fiftythousand)-10000*tenhousand)-1000*thousand)-100*hundred)/50;
		int ten = (((((moneyminus*fiftythousand)-10000*tenhousand)-1000*thousand)-100*hundred)-50*fifty)/10;
		int one = (((((moneyminus*fiftythousand)-10000*tenhousand)-1000*thousand)-100*hundred)-50*fifty)%10;
		
		
		if (money>=50000) {
			System.out.println("�������� "+fiftythousand+"��"+" ���� �� "+tenhousand+"�� "+" õ���� "+thousand+"��"+" ��� "+hundred+"��"+" ���ʿ� "+fifty+"��"+" �ʿ� "+ten+"��"+" �Ͽ� "+one+"��");
		} else if (money >= 10000) {
			System.out.println("���� �� "+tenhousand+"�� "+" õ���� "+thousand+"��"+" ��� "+hundred+"��"+" ���ʿ� "+fifty+"��"+" �ʿ� "+ten+"��"+" �Ͽ� "+one+"��"
					);
		} else if (money < 10000) {System.out.println("õ���� "+thousand+"��"+" ��� "+hundred+"��"+" ���ʿ� "+fifty+"��"+" �ʿ� "+ten+"��"+" �Ͽ� "+one+"��");
		};
		scan.close();
	}

}
