package Bai1;

import java.util.Scanner;

public class Hang {
	private  static String MaHang;
	private  static String TenHang;
	private static NSX x = new NSX();
	
	public Hang() {
		
	}

	public Hang(String maHang, String tenHang, NSX x) {
		super();
		MaHang = maHang;
		TenHang = tenHang;
		this.x = x;
	}

	public String getMaHang() {
		return MaHang;
	}

	public void setMaHang(String maHang) {
		MaHang = maHang;
	}

	public String getTenHang() {
		return TenHang;
	}

	public void setTenHang(String tenHang) {
		TenHang = tenHang;
	}

	public NSX getX() {
		return x;
	}

	public void setX(NSX x) {
		this.x = x;
	}
	
	public static void in() {
		System.out.println("Ma hang la: " + MaHang);
		System.out.println("Ten hang la: " + TenHang);
		System.out.println("Thong tin NSX: \n");
		x.Xuat();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String MaHang = sc.nextLine();
		String TenHang = sc.nextLine();
		NSX Nsx = new NSX().Nhap();
		Hang hang = new Hang(MaHang, TenHang, Nsx);
		hang.in();
	}
	
}
