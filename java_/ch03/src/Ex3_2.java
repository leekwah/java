class Ex3_2 {
	public static void main(String args[]) {
		int i=5, j=0;

		// j = i++; // ������
		j = i;
		i++;
		System.out.println("j=i++; ���� ��, i=" + i +", j="+ j);

		i=5;        // ����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����
		j=0;

		// j = ++i; // ������
		i++;
		j = i;
		System.out.println("j=++i; ���� ��, i=" + i +", j="+ j);
	}
}