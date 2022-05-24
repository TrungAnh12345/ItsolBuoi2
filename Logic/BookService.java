package Logic;

import Information.Book;
import RunSystem.*;
import Quanlymuonsach.Utils;

public class BookService {

	public static void inputNewBook() {
		System.out.println("Nhập số lượng sách muốn thêm");
		int bookNumber = 0;
		boolean check = true;
		do {
			try {
				bookNumber = Utils.Henta().nextInt();
				check = false;
			}catch(Exception e) {
				System.out.println("Dữ liệu nhập vào ko đúng, nhập lại");
				Utils.Henta().next();
			}
		}while(check);
		for(int i = 0; i < bookNumber; i++) {
			Book book = new Book();
			book.inputBook();
			saveBookInfo(book);
		}
	}
	public static void saveBookInfo(Book book) {
		for(int i = 0; i < Main.BOOKS.length; i++ ) {
			if(Main.BOOKS[i] == null) {
				Main.BOOKS[i] = book;
				return;
			}
		}
	}
	public static void showBook() {
		for(int i = 0; i < Main.BOOKS.length; i++) {
			if(Main.BOOKS[i] == null) {
				continue;
			}
			System.out.println(Main.BOOKS[i]);
		}
	}
	
	public static boolean isEmptyBook() {
		for(int i = 0 ; i < Main.BOOKS.length; i++) {
			if(Main.BOOKS[i] != null) {
				return false;
			}
			
		}
		return true;
	}
}
