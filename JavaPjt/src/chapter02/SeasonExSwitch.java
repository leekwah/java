package chapter02;

import java.util.Scanner;

public class SeasonExSwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12) >> ");
		int month = scan.nextInt();
		String season = null;
		
		switch (month) {
			case 3: case 4: case 5:
				season = "��";
				break;
			case 6: case 7: case 8: 
				season = "����";
				break;
			case 9: case 10: case 11:   
				season = "����"; 
				break;
			case 1: case 2: case 12:   
				season = "�ܿ�"; 
				break;
			default: 
				season = "�߸��Է�";
				break;
		}
		System.out.println(season);
		scan.close();
	}
}