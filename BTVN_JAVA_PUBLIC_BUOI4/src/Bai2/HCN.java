package Bai2;

import java.util.Scanner;

public class HCN {
	private double chieuDai;
	private double chieuRong;
	
	public HCN(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public HCN() {
		
	}
	
	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chieu dai: ");
		chieuDai = sc.nextDouble();
		System.out.print("Nhap chieu rong: ");
		chieuRong = sc.nextDouble();
	}
	
	public void veHCN() {
		for(int i = 0; i < chieuDai; i++) {
			for (int j = 0; j < chieuRong; j++) {
				if(i == 0 || i == chieuDai - 1 || j == 0 || j == chieuRong - 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public double dienTich() {
		return (chieuDai * chieuRong);
	}
	
	public double chuVi() {
		return (chieuDai + chieuRong) * 2;
	}
	
	public void in() {
		System.out.println("Dien tich cua HCN la: " + dienTich());
		System.out.println("Chu vi cua HCN la: " + chuVi());
	}
}
