package chapter04;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // �迭 ����
    int intArray[] = new int[10];
    // �ּҰ� �ִ밪�� ���ϴ� �� Integer�� �ִ�, �ּҰ� �Ӽ��� �ִ�.
    // Integer.MAX_VALUE = �ִ밪, Integer.MIN_VALUE = �ּҰ�
    int min = Integer.MAX_VALUE;
	int max = 0;
    

    System.out.println("����� 10���� �Է��ϼ���");
    for(int i = 0; i < intArray.length;i++) {
    	intArray[i] = sc.nextInt();
    	if(intArray[i] < min) { 
    		min = intArray[i]; 
    	} else if(intArray[i] > max) { 
    		max = intArray[i]; 
    	} 
    } 

    System.out.println("�ִ밪 :" + max);       
    System.out.println("�ּҰ� :" + min);
    System.out.println("�ּҰ� + �ִ밪�� "+(min+max)+" �Դϴ�.");

    sc.close();
    }
}