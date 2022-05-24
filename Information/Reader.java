package Information;

import FixedCases.ReaderType;

public class Reader extends Member {

	private static int AUTO_ID = 10000;
	private ReaderType readerType;
	
	
	public ReaderType getReaderType() {
		return readerType;
	}


	public void setReaderType(ReaderType readerType) {
		this.readerType = readerType;
	}


	@Override
	public void inputInfo() {
		super.inputInfo();
		this.id = AUTO_ID++;
		System.out.println("Nhập loại bạn đọc dưới đây");
		System.out.println("1: Sinh viên");
		System.out.println("2: Học viên cao học");
		System.out.println("3: Giáo viên");
		int readerType = 0;
		do {
			readerType = Utils.Henta().nextInt();
			if(readerType >= 1&& readerType <= 3) {
				break;
			}
			System.out.println("Khoong hợp lệ");
		}while(true);
		switch(readerType)
		{
		case 1:
			this.setReaderType(ReaderType.SV);
			break;
		case 2:
			this.setReaderType(ReaderType.HVCH);
			break;
		case 3:
			this.setReaderType(ReaderType.GV);
			break;
		
		}
		
	}
	
	@Override
	public String toString() {
		return "Reader [readerType=" + readerType + ", id=" + id + ", nameR=" + nameR + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}


	public int compareTo(Reader reader) {
		if(this.id > reader.getId()) {
			return 1;
		}
		else if(this.id < reader.getId()) {
			return -1;
		}
		return 0;
	} 

	

	

	
	

	
}
