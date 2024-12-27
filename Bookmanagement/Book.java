package day21;

public class Book {
	private int Id;
	private String Name;
	private String Author;
	private double Price;
	private int Copies;
	public String getName() {
		return Name;
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = Id;
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
	
	

	public Book(int id, String name, String author, double price, int copies) {
		
		Id = id;
		Name = name;
		Author = author;
		Price = price;
		Copies = copies;
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", Name=" + Name + ", Author=" + Author + ", Price=" + Price + ", Copies=" + Copies
				+ "]";
	}

	
}
