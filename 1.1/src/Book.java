
public class Book {
	private String name;
	private double price;
	private Author author;
	private int qty;
	public Book (String name, double price, Author author, int qty) {
		this.name = name;
		this.price = price;
		this.author = author;
		this.qty = qty;
	}
	public String getName(){
	        return name;
		}
	public double getPrice(){
        return price;
		}
	public Author getAuthor(){
        return author;
		}
	public int getQty(){
        return qty;
		}
	public void setPrice(double price) {
		this.price = price;
		}
	public void setQty(int qty) {
		this.qty = qty;
		}
	public String toString() {
		return "'"+name+" by "+author+"'";
		}
	}
