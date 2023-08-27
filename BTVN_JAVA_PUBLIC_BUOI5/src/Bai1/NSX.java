package Bai1;

import java.util.Scanner;

public class NSX {
	private String MaNSX;
	private String TenNSX;
	private String DcNSX;
	public NSX(String maNSX, String tenNSX, String dcNSX) {
		super();
		MaNSX = maNSX;
		TenNSX = tenNSX;
		DcNSX = dcNSX;
	}
	
	public NSX() {
		
	}

	public String getMaNSX() {
		return MaNSX;
	}

	public void setMaNSX(String maNSX) {
		MaNSX = maNSX;
	}

	public String getTenNSX() {
		return TenNSX;
	}

	public void setTenNSX(String tenNSX) {
		TenNSX = tenNSX;
	}

	public String getDcNSX() {
		return DcNSX;
	}

	public void setDcNSX(String dcNSX) {
		DcNSX = dcNSX;
	}
	
	public NSX Nhap() {
		Scanner sc = new Scanner(System.in);
		String MaNsx = sc.nextLine();
		String TenNsx = sc.nextLine();
		String DcNsx = sc.nextLine();
		return new NSX(MaNsx, TenNsx, DcNsx);
	}
	
	public void Xuat() {
		System.out.println("Ma NSX la: " + this.MaNSX);
		System.out.println("Ten NSX la: " + this.TenNSX);
		System.out.println("Dia chi NSX la: " + this.DcNSX);
	}
}
