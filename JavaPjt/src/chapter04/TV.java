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
		System.out.print(this.company+"에서 만든 ");
		System.out.print(this.year+"년형 ");
		System.out.print(this.size+"인치 TV");
		}
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show(); 
	}
}