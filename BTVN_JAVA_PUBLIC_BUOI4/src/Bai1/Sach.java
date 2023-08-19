package Bai1;

import java.util.Scanner;

public class Sach {
	private String maSach;
	private String tenSach;
	private String tacGia;
	private String nhaXuatban;
	private String namXuatban;

	public Sach() {

	}
	
	public Sach(String maSach, String tenSach, String tacGia, String nhaXuatban, String namXuatban) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.nhaXuatban = nhaXuatban;
		this.namXuatban = namXuatban;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public String getNhaXuatban() {
		return nhaXuatban;
	}

	public void setNhaXuatban(String nhaXuatban) {
		this.nhaXuatban = nhaXuatban;
	}

	public String getNamXuatban() {
		return namXuatban;
	}

	public void setNamXuatban(String namXuatban) {
		this.namXuatban = namXuatban;
	}

	public void nhapThongtin() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Nhap ma sach: ");
	    maSach = sc.nextLine();
	    System.out.print("Nhap ten sach: ");
	    tenSach = sc.nextLine();
	    System.out.print("Nhap ten tac gia: ");
	    tacGia = sc.nextLine();
	    System.out.print("Nhap ten nha xuat ban: ");
	    nhaXuatban = sc.nextLine();
	    System.out.print("Nhap nam xuat ban: ");
	    namXuatban = sc.nextLine();
	}

	public void xuatThongtin() {
		System.out.printf("%-15s %-30s %-20s %-20s %-10.2f%n", maSach, tenSach, tacGia, nhaXuatban, namXuatban);
	}
}
