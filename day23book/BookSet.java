package day23;

import java.util.Objects;

public class BookSet {
	private int Id;
	private String Name;
	private double price;
	
	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookSet other = (BookSet) obj;
		return Id == other.Id && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public BookSet() {
		super();
	}
	public BookSet(int id, String name, double price) {
		super();
		Id = id;
		Name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookSet [Id=" + Id + ", Name=" + Name + ", price=" + price + "]";
	}
	
	
}
