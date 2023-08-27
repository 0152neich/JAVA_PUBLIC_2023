package Bai3;

import java.util.Scanner;

public class May {
	private String maMay;
	private String tenMay;
	private String tinhTrang;
	
	public May() {
		
	}

	public May(String maMay, String tenMay, String tinhTrang) {
		super();
		this.maMay = maMay;
		this.tenMay = tenMay;
		this.tinhTrang = tinhTrang;
	}

	public String getMaMay() {
		return maMay;
	}

	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}

	public String getTenMay() {
		return tenMay;
	}

	public void setTenMay(String tenMay) {
		this.tenMay = tenMay;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma may: ");
		maMay = sc.nextLine();
		System.out.print("Nhap ten may: ");
		tenMay = sc.nextLine();
		System.out.print("Nhap tinh trang may: ");
		tinhTrang = sc.nextLine();
	}
	public void Output() {
		System.out.println("Ma may la: " + this.maMay);
		System.out.println("Ten may la: " + this.tenMay);
		System.out.println("Tinh trang may la: " + this.tinhTrang);
	}
}
