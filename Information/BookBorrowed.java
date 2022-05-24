package Information;

import java.util.Arrays;

import Information.*;
public class BookBorrowed {


	private Reader reader;
	
	private BookBorrowDetail [] bookBorrowDetails;
	
	
	public BookBorrowed(Reader reader, BookBorrowDetail[] bookBorrowDetails) {
		super();
		this.reader = reader;
		this.bookBorrowDetails = bookBorrowDetails;
	}

	public BookBorrowDetail[] getBookBorrowDetails() {
		return bookBorrowDetails;
	}

	public void setBookBorrowDetails(BookBorrowDetail[] bookBorrowDetails) {
		this.bookBorrowDetails = bookBorrowDetails;
	}

	public BookBorrowed() {
	
	}
	
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}

	@Override
	public String toString() {
		return "BookBorrowed [bookBorrowDetails=" + Arrays.toString(bookBorrowDetails)+ ", reader=" + reader + "]";
	}
	
	
	
	
	
	
}
