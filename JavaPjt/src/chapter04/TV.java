package chapter04;

public class TV {
	public String company;
	public int year;
	public int size;
	
	public TV(String company,int year, int size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}

	public void show() {
		System.out.print(this.company+"���� ���� ");
		System.out.print(this.year+"���� ");
		System.out.print(this.size+"��ġ TV");
		}
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show(); 
	}
}