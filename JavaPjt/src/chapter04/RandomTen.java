package chapter04;

public class RandomTen {
	public static void main(String[] args) {
		int[] n = new int[10];
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			int r = ((int)(Math.random()*10)+1);
			n[i] = r;
		}
		
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println("\nÆò±ÕÀº "+(double)sum/n.length);
	}
}
