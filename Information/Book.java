package Information;

import FixedCases.BookClassification.BookCategory;

public class Book {

	private static int auto_id = 10000;
	
	private int idB;
	private String nameB ;
	private String author;
	private BookCategory bookCategory;
	private int yearPublish;
	public int getId() {
		return idB;
	}
	public void setId(int id) {
		this.idB = id;
	}
	public String getNameB() {
		return nameB;
	}
	public void setNameB(String nameB) {
		this.nameB = nameB;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BookCategory getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}
	public int getYearPublish() {
		return yearPublish;
	}
	public void setYearPublish(int yearPublish) {
		this.yearPublish = yearPublish;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + idB + ", nameB=" + nameB + ", author=" + author + ", bookCategory=" + bookCategory
				+ ", yearPublish=" + yearPublish + "]";
	}
	
	public void inputBook() {
		this.idB = auto_id++;
		System.out.println("Nhập tên sách");
		nameB = Utils.Henta().nextLine();
		System.out.println("Nhập tác giả");
		author = Utils.Henta().nextLine();
		System.out.println("Nhập chuyên ngành");
		System.out.println("1: Công nghệ thông tin");
		System.out.println("2: Điện tử viễn thông");
		System.out.println("3: Khoa học tự nhiên");
		System.out.println("4: Văn hoc nghệ thuật");
		
		int pick  = Utils.Henta().nextInt();
		do {
			if(pick < 1 || pick > 4) {
				System.out.println("Bạn nhập sai danh mục, yêu cầu nhập đúng");
			}
		}while(pick < 1 || pick > 4);
			switch (pick){
			case 1: 
			this.setBookCategory(BookCategory.CNTT);
			break;
			case 2:
			this.setBookCategory(BookCategory.DTVT);
			break;
			
			case 3:
			this.setBookCategory(BookCategory.KHTN);
			break;
			
			case 4:
			this.setBookCategory(bookCategory.VHNT);
			break;
			}
		System.out.println("Nhập năm xuất bản");
		yearPublish = Utils.Henta().nextInt();
	}
	
	public void showBook() {
		System.out.println("thông tin sách:");
		System.out.println(this.toString());
		
	}
	
	
	
	
}
