package chapter03;

public class foreachEx {
	enum Week {��,ȭ,��,��,��,��,��} // Ŭ������ �Ǿ��־ �����ݷ� ��� �ȴ�.

	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5};
		String names[] = {"���","��","�ٳ���","ü��","����","����"};
		int sum = 0;
		
		// int k�� ���� n ���� ������ �����´�.
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("����"+sum);

		// string s�� names ���� ������ �����´�.
		for (String s : names) {
			System.out.print(s + " ");
		}
		System.out.println();

		// week ������
		for (Week day : Week.values()) {
			System.out.print(day + "���� ");
		}
		System.out.println();
	}

}