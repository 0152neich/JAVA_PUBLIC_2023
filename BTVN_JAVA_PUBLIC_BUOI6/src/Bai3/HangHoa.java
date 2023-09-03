package Bai3;

import java.util.Scanner;

public class HangHoa {
	protected String maHang;
	protected String tenHang;
	protected float soLuong;
	protected float donGia;
	protected VatLieu[] dsVL;

	public HangHoa() {

	}

	public HangHoa(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.dsVL = dsVL;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public float getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public VatLieu[] getDsVL() {
		return dsVL;
	}

	public void setDsVL(VatLieu[] dsVL) {
		this.dsVL = dsVL;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma hang: ");
		String maHang = sc.nextLine();
		System.out.print("Nhap ten hang: ");
		String tenHang = sc.nextLine();
		System.out.print("Nhap so luong: ");
		do {
			System.out.print("Nhap so luong: ");
			soLuong = sc.nextFloat();
			sc.nextLine();
			if (soLuong < 0) {
				System.out.println("So luong khong hop le. Vui long nhap lai.");
			}
		} while (soLuong < 0);
		System.out.print("Nhap don gia: ");
		float donGia = sc.nextFloat();
		sc.nextLine();
		int n = (int) soLuong;
		dsVL = new VatLieu[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin vat lieu thu " + (i + 1) + ": ");
			dsVL[i] = new VatLieu();
			dsVL[i].nhap();
		}
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.dsVL = dsVL;
	}

	public float tongTien() {
		return this.soLuong * this.donGia;
	}

	public void output() {
		System.out.println("Ma hang: " + this.maHang);
		System.out.println("Ten hang: " + this.tenHang);
		System.out.println("So luong: " + this.soLuong);
		System.out.println("Don gia: " + this.donGia);
		System.out.println("Tong tien: " + this.tongTien());
	}

}
