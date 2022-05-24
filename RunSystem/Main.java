package RunSystem;

import Information.Book;
import Information.BookBorrowed;
import Information.Reader;

public class Main {

	public static Book [] BOOKS = new Book[200];
	public static Reader [] READERS = new Reader[200];
	public static BookBorrowed[] BORROWS = new BookBorrowed[200];
			
	public static void main(String[] args) {
		Menu.menuTable();
	}
}

