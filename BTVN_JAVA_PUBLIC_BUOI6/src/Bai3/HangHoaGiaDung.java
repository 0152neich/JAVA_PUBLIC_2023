package Bai3;

import java.util.Scanner;

public class HangHoaGiaDung extends HangHoa {
	private String chucNang;

	public HangHoaGiaDung() {

	}

	public HangHoaGiaDung(String chucNang, String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL) {
		super(maHang, tenHang, soLuong, donGia, dsVL);
		this.chucNang = chucNang;
	}

	public String getChucNang() {
		return chucNang;
	}

	public void setChucNang(String chucNang) {
		this.chucNang = chucNang;
	}
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		chucNang = sc.nextLine();
	}
	@Override
	public void output() {
		super.output();
		System.out.println("Chuc nang: " + this.chucNang);
	}

}
