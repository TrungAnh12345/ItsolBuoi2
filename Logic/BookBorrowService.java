package Logic;

import RunSystem.*;

import javax.print.DocFlavor.READER;

import Information.Book;
import Information.BookBorrowDetail;
import Information.BookBorrowed;
import Information.Reader;
import Quanlymuonsach.Utils;

public class BookBorrowService {

	public static void sortBorrow() {
		System.out.println("Nhập vào các chức năng bên dưới");
		System.out.println("1: Sắp xếp theo tên bạn đọc");
		System.out.println("2: Sắp xếp thep số lượng cuốn sach được  mượn(giảm dần)");
		int pickNumber = 0;
		do 
		{
			pickNumber = Utils.Henta().nextInt();
			if(pickNumber == 1 || pickNumber == 2) {
				break;
			}
			System.out.println("Không hợp lệ");
					
		}while (true);
		if(pickNumber == 1) {
			for(int i = 0; i < Main.BORROWS.length - 1; i++ ) {
				if(Main.BORROWS[i] == null) {
					continue;
				}
				for(int j = 0; i < Main.BORROWS.length; j++ ) {
					if(Main.BORROWS[j] == null) {
						continue;
					}
					if(Main.BORROWS[i].getReader().getNameR().compareTo(Main.BORROWS[j].getReader().getNameR())> 0) {
						BookBorrowed temp = Main.BORROWS[i];
						Main.BORROWS[i] = Main.BORROWS[j];
						Main.BORROWS[j] = temp;
					}
					
				}
			}showInfoBookBorrow();
		}
		else if(pickNumber == 2) {
			
		}
		
		
	}
	public void sortByQuantity() {
		
	}
	
	public static void searchBorrowByNameReader() {
		System.out.println("Nhập tên bạn đọc");
		String find = Utils.Henta().nextLine();
		for(int i = 0; i < Main.BORROWS.length; i++) {
			if(Main.BORROWS[i] != null && Main.BORROWS[i].getReader().getNameR().toLowerCase().contains(find.toLowerCase())) {
				System.out.println(Main.BORROWS[i]);
			}
		}
	}
	
	public static void showInfoBookBorrow() {
		for(int i = 0 ; i < Main.BORROWS.length; i++) {
			if(Main.BORROWS[i] != null) {
				System.out.println(Main.BORROWS[i]);
			}
		}
	}
	
	public static void borrowBook() {
		if(BookService.isEmptyBook() || ReaderService.isEmptyReader()) {
			System.out.println("Cần nhập tên người đọc và sách trước khi mượn sách");
			return;
		}
		System.out.println("Nhập vào số lượng bạn đọc muốn mượn sách");
		int readerNumber = Utils.Henta().nextInt();
		for(int i= 0 ; i < readerNumber; i++) {
			Reader reader = inputReader(i);
			BookBorrowDetail[] bookBorrowDetails = inputBookBorrowDetail();
			BookBorrowed bookBorrow = new BookBorrowed(reader, bookBorrowDetails);
			addBookBorrow(bookBorrow);
			
		}
	}
	
	public static void addBookBorrow(BookBorrowed bookBorrow) {
		for(int i = 0 ; i < Main.BORROWS.length; i++) {
			if(Main.BORROWS[i] == null) {
				Main.BORROWS[i] = bookBorrow;
				break;
			}
		}
	}
	
	
	public static Reader inputReader(int i) {
		System.out.println("Nhập mã bạn đọc thứ: " + (i + 1) + " muốn mượn sách");
		Reader reader = null;
		int idReader = 0;
		boolean ktra2 = true;
		do {
			do {
				try {
					idReader = Utils.Henta().nextInt();
					ktra2  = false;		
				}catch (Exception e) {
					System.out.println("Mã bạn đọc nhập vào ko hợp lệ, yêu cầu nhập đúng");
					Utils.Henta().next();
				}
			}
			while(ktra2);
			
			idReader = Utils.Henta().nextInt();
			for(int j = 0; j < Main.READERS.length; j++) {
				if(Main.READERS[j] != null && Main.READERS[i].getId() == idReader) {
					reader = Main.READERS[j];
					break;
				}
				
			}
			if(reader != null) {
				break;
			}
			System.out.println("Không tìm thấy mã bạn đọc vừa nhập");
		}while(true);
		return reader;
	}
	
	
	public static BookBorrowDetail [] inputBookBorrowDetail() {
		System.out.println("Nhập số lượng đầu sách mà bạn đọc này muốn mượn");
		int numberBookBorrow = 0;
		boolean check = false;
		do {
			try {
				numberBookBorrow = Utils.Henta().nextInt();
				check = true;
				if(numberBookBorrow > 0 && numberBookBorrow <= 5) {
					break;
				}
				System.out.println("Chỉ được mượn tối đa 5 đầu sách");
				
			}catch(Exception e) {
				System.out.println("Bạn nhập sai dữ liệu đầu vào, yêu cầu nhập đúng");
				Utils.Henta().next();
			}
			
		}
		while(!check || numberBookBorrow < 0 || numberBookBorrow > 5);
		
		BookBorrowDetail[] bookBorrowDetails = new BookBorrowDetail[numberBookBorrow];
		for(int i = 0; i < numberBookBorrow; i++) {
			System.out.println("Nhập mã đầu sách thứ " + (i + 1) + " mà bạn đọc này muốn mượn");
			Book book = null;
			int idBook = 0;
			do {
				idBook = Utils.Henta().nextInt();
				
				for(int j = 0; j < Main.BOOKS.length; j++) {
					if(idBook == Main.BOOKS[j].getId() && Main.BOOKS[j] != null) {
						book = Main.BOOKS[j];
						break;
					}
				}
			
				
				if(book != null) {
					break;
				}
				System.out.println("KHông tìm thấy mã sách vừa nhập");
			}while(true);
			
			System.out.println("Nhập vào số lượng sách bạn đọc muốn mượn");
			int bookNumber = 0;
			do {
				bookNumber = Utils.Henta().nextInt();
				if(bookNumber > 0 && bookNumber <= 3) {
					break;
				}
				System.out.println("Bạn chỉ được mượn 3 cuốn cho 1 đầu sách");
				
			}
			while(true);
			
			BookBorrowDetail bookBorrowDetail = new BookBorrowDetail(book, bookNumber);
			for(int k = 0; k < bookBorrowDetails.length ;k++) {
				if(bookBorrowDetails[k] == null) {
					bookBorrowDetails[k] = bookBorrowDetail;
					break;
				}
			}
			
		}
		return bookBorrowDetails;
				
	}
	
}
