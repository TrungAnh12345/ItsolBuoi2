package Logic;

import javax.print.DocFlavor.READER;

import Information.Reader;
import Quanlymuonsach.Utils;
import RunSystem.Main;

public class ReaderService {

	public static void inputInfo() {
	
		System.out.println("Nhập số lượng bạn đọc mới muốn thêm");
		int readerNumber = Utils.Henta().nextInt();
		for(int  i = 0; i < readerNumber; i++) {
			Reader reader = new Reader();
			reader.inputInfo();
			addReaderInfo(reader);
			
		}
	}
	public static void addReaderInfo(Reader reader) {
		for(int i = 0; i < Main.READERS.length; i++) {
			if(Main.READERS[i] == null) {
				Main.READERS[i] = reader;
				return;
			}
		}
	}
	
	public static void showReaderInfo() {
		for(int i = 0 ; i < Main.READERS.length; i++) {
			if(Main.READERS[i] == null) {
				continue;
			}
			System.out.println(Main.READERS[i]);
		}
	}
	public static boolean isEmptyReader() {
		for(int i = 0; i < Main.READERS.length; i++) {
			if(Main.READERS[i] != null) {
				return false;
			}
		}
		return true;
	}
}
