package Bai3;

import java.util.Scanner;

public class QuanLi {
	private String maQl;
	private String hoTen;
	
	public QuanLi() {
		
	}

	public QuanLi(String maQl, String hoTen) {
		super();
		this.maQl = maQl;
		this.hoTen = hoTen;
	}

	public String getMaQl() {
		return maQl;
	}

	public void setMaQl(String maQl) {
		this.maQl = maQl;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma quan li: ");
		maQl = sc.nextLine();
		System.out.print("Nhap ten quan li: ");
		hoTen = sc.nextLine();
	}
	
	public void Output() {
		System.out.println("Ma quan li la: " + this.maQl);
		System.out.println("Ho ten quan li la: " + this.hoTen);
	}
}
