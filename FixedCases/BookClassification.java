package FixedCases;

public class BookClassification {

	public enum BookCategory{
		KHTN("khoa hoc tu nhien"),
		CNTT("cong nghe thong tin"),
		DTVT("dien tu vien thong"),
		VHNT("van hoc nghe thuan");
		
		String value;

		BookCategory(String value) {
			this.value = value;
		}
		
		
	}
	
	
}
