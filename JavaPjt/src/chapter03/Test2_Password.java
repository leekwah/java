package chapter03;

import java.util.Scanner;

public class Test2_Password {
	public static void main(String[] args) {
//		trynumber: ��ȣ �Է� Ƚ��	
//		1.- ��ȣ�� 'myongji60'���� �ʱ�ȭ�Ѵ�.
//		trynumber = trynumber + 1
//		-  input�� password�� ���ٸ� "ȯ���մϴ�"�� ����ϰ� �����Ѵ�
//		- "��ȣ�� Ʋ���ϴ�"�� ����Ѵ�.
//		- trynumber�� 3�̶�� "������ �ź��մϴ�" �� ����ϰ� �����Ѵ�

      String password="myongji60";
      String input;
      int tryNumber=0;
      Scanner scan=new Scanner(System.in);
      
      while (true) {
         System.out.print("��ȣ�� �Է��ϼ���: ");
         input = scan.next();
         tryNumber++;
         
         if (input.equals(password)) {
            System.out.println("ȯ���մϴ�.");
            break;
         }
         System.out.println("��ȣ�� Ʋ���ϴ�.");
         
         if (tryNumber ==3) {
            System.out.println("������ �ź��մϴ�.");
            break;
         }
      }
      scan.close();
   }
}
