package chapter03;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
//		trynumber: ��ȣ �Է� Ƚ��	
//		1.- ��ȣ�� 'myongji60'���� �ʱ�ȭ�Ѵ�.
//		trynumber = trynumber + 1
//		-  input�� password�� ���ٸ� "ȯ���մϴ�"�� ����ϰ� �����Ѵ�
//		- "��ȣ�� Ʋ���ϴ�"�� ����Ѵ�.
//		- trynumber�� 3�̶�� "������ �ź��մϴ�" �� ����ϰ� �����Ѵ�
		int trynumber = 0;
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("��ȣ�� �Է��ϼ���.");
//		
//		if (input.equals(password)) {
//			System.out.println("ȯ���մϴ�.");
//		} else if (trynumber<2) {
//			System.out.println("");
//			trynumber = trynumber + 1;
//			scan.close();
//			return;
//		} else {
//			System.out.println("");
//		}
		
			
		String password = "myungji60";
		String input = "";
		boolean success = false; // � ���¸� �ǹ��ϴ� ���� (flag)
	
		for (int i=0; i<3; i++) {
			System.out.print("��й�ȣ�� �Է��ϼ���>>>");
			input = scan.next();
			
			if (input.equals(password)) {
				success = true;
			else {
					System.out.println("��ȣ�� Ʋ���ϴ�.")
			}
			}
			}
		}
		
		if(success){
			System.out.println("����");	
		} else {
		System.out.println("������ �ź��մϴ�.");
	}
		scan.close();
	}
}
