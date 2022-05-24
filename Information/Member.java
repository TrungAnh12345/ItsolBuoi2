package Information;

import FixedCases.ReaderType;

public class Member {

	protected int id ;
	protected String nameR;
	protected String address;
	protected int phoneNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameR() {
		return nameR;
	}
	public void setNameR(String nameR) {
		this.nameR = nameR;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void inputInfo() {
		System.out.println("Nhập tên thành viên ");
		nameR = Utils.Henta().nextLine();
		System.out.println("Nhập địa chỉ ");
		address = Utils.Henta().nextLine();
		System.out.println("Nhập số điện thoại");
		
		boolean check = true;
		
		do{
			try {
				phoneNumber = Utils.Henta().nextInt();
				check = false;
			}catch(Exception e) {
				System.out.println("Bạn nhận sđt không hợp lệ, vui lòng nhập đúng");
				Utils.Henta().nextLine();
			}
		}while(check) ;
	
		
	}
	public void showMember() {
		System.out.println( "thông tin người đọc");
		this.toString();
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", nameR=" + nameR + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
}
