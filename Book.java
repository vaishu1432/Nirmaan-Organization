package day21;

public class Book {
	
	private String Name;
	private String Author;
	private double Price;
	private int Copies;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getCopies() {
		return Copies;
	}
	public void setCopies(int copies) {
		Copies = copies;	
	}
	public Book() {
		super();
	}
	public Book(String name, String author, double price, int copies) {
		super();
		Name = name;
		Author = author;
		Price = price;
		Copies = copies;
	}
	@Override
	public String toString() {
		return "Book [Name=" + Name + ", Author=" + Author + ", Price=" + Price + ", Copies=" + Copies + "]";
	}
	
}
