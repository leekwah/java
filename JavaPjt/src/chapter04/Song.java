package chapter04;

public class Song {
	public String title;
	public String artist;
	public int year;
	public String country;
	
	public Song(String title, String artist, int year, String country) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.print(this.year+"�� ");
		System.out.print(this.country+"������ ");
		System.out.print(this.artist+"�� �θ� ");
		System.out.print(this.title);
		}
	
	public static void main(String[] args) {
		Song myFavorite = new Song("Dancing Queen", "ABBA", 1978, "������");
		myFavorite.show(); 
	}
}