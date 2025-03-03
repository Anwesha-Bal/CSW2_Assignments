package Assignment2;
class Book{
	private int bookId;
	private String bookName;
	private double price;
	public Book(int bookId, String bookName, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true ;
		}
		if(obj == null || getClass()!= obj.getClass()) {
			return false;
		}
		Book book = (Book) obj;
		return Double.compare(book.price, price) == 0;
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(101 , "Book1", 25.00);
		Book b2 = new Book(102, "Book2", 19.99);
		System.out.println("Book 1 details: "+b1);
		System.out.println("Book 2 details: "+b2);
		if(b1.equals(b2)) {
			System.out.println("Both books have the same price");
		}
		else {
			System.out.println("Books have different prices.");
		}
		
	}

}
