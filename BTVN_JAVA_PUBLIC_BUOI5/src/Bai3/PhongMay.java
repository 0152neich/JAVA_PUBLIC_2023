package Bai3;

import java.util.Scanner;

public class PhongMay {
	private String maPhong;
	private String tenPhong;
	private String dienTich;
	private QuanLi quanLi = new QuanLi();
	private May may = new May();
	private int n;
	
	public PhongMay() {
		
	}

	public PhongMay(String maPhong, String tenPhong, String dienTich, QuanLi quanLi, May may, int n) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.dienTich = dienTich;
		this.quanLi = quanLi;
		this.may = may;
		this.n = n;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public String getDienTich() {
		return dienTich;
	}

	public void setDienTich(String dienTich) {
		this.dienTich = dienTich;
	}

	public QuanLi getQuanLi() {
		return quanLi;
	}

	public void setQuanLi(QuanLi quanLi) {
		this.quanLi = quanLi;
	}

	public May getMay() {
		return may;
	}

	public void setMay(May may) {
		this.may = may;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma phong: ");
		maPhong = sc.nextLine();
		System.out.print("Nhap ten phong: ");
		tenPhong = sc.nextLine();
		System.out.print("Nhap dien tich: ");
		dienTich = sc.nextLine();
		System.out.print("Nhap so luong may: ");
		n = sc.nextInt();
		sc.nextLine();
	}
	
	public void Output() {
		System.out.println("Ma phong la: " + this.maPhong);
		System.out.println("Ten phong la: " + this.tenPhong);
		System.out.println("Dien tich phong la:" + this.dienTich);
		System.out.println("So luong may la: " + this.n);
	}
}
