package chapter02;

public class Ramyun {
	public static void main(String[] args) {
		buy();
		boil();
		put();
		eat();
	}	
	// void�� ��ȯŸ��, boil�� �޼ҵ�, ()�ȿ� ���� ���� �Է� ����, �Ű�����
	public static void boil() {
		System.out.println("���� ���δ�.");
	} 
	// void ��ȯŸ�� buy�� �޼ҵ� ()�ȿ� ������ ���� �Էº���, �Ű�����
	public static void buy() {
		System.out.println("����� ��´�.");
	}
	public static void eat() {
		System.out.println("���ְ� �Դ´�.");
	} 
	// �޼ҵ� ���� ������ ����� ����.
	public static void put() {
		System.out.println("����� �ִ´�.");
	}
	// �����������, ���������� ���ʴ�� �ؾߵǴ� ��������, ��ü������� ������
	// ������� �ص� �ȴ�.
}