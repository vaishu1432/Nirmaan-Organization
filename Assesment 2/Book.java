package day12;

public class Book {
	
	private String title;
	private String author;
	private double price;
	private int copies;
	public Book() {
		
	}

	 public Book(String title, String author, Double price,int copies) {
		 
		 this.title=title;
		 this.author=author;
		 this.price=price;
		 this.copies=copies;
	 }
	 public String getTitle() {
		 return title;
	 }
	 public String getAuthor() {
		 return author;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public int getEmpName() {
		 return copies;
	 }

	
	public void setCopies(int copies) {
		this.copies = copies;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public String toString() {
		return "Book [title=" + title + "\nauthor=" + author + "\nprice=" + price + "\ncopies=" + copies + "]";
	}
	
	
	
	

}

	
	 
	 
	 



