package RunSystem;

import Logic.BookBorrowService;
import Logic.BookService;
import Logic.ReaderService;
import Quanlymuonsach.Utils;

public class Menu {

	public static void menuTable() {
	
	
		boolean isContinue = true;
		boolean check1 = true;
		int pick = 0;
		do {
			System.out.println("Mời bạn nhập các chức năng dưới đây");
			System.out.println("1: Nhập đầu sách mới");
			System.out.println("2: In ra đầu sách trong thư viện");
			System.out.println("3: Nhập bạn đọc mới");
			System.out.println("4: In ra bạ đọc trong thư viện");
			System.out.println("5: Cho mượn sách");
			System.out.println("6: Sắp xếp danh sách mượn sách theo tên");
			System.out.println("7: Sắp xếp theo sách mượn");
			System.out.println("8: mTimf kiếm trong danh sách mượn sách theo tên bạn đọc");
			System.out.println("9: Thoát chương trình");
			pick = Utils.Henta().nextInt();
			switch(pick){
			case 1: BookService.inputNewBook();
			break;
			case 2: BookService.showBook();
			break;
			case 3: ReaderService.inputInfo();
			break;
			case 4: ReaderService.showReaderInfo();
			break;
			case 5: BookBorrowService.borrowBook();
			break;
			case 6: BookBorrowService.sortBorrow();
			break;
			case 7: BookBorrowService.sortBorrow();
			break;
			case 8: BookBorrowService.searchBorrowByNameReader();
			break;
			case 9: System.out.println("Exit ");
			isContinue = false;
			break;
			}
		}while(isContinue);
		
	}
}

	

