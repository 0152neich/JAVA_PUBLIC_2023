package Bai3;

import java.util.Scanner;

public class HangHoaDienTu extends HangHoa {
	private int thoiGianBaoHanh;
	private int congSuat;

	public HangHoaDienTu() {

	}

	public HangHoaDienTu(int thoiGianBaoHanh, int congSuat, String tenHang, float soLuong, float donGia,
			VatLieu[] dsVL) {
		super(tenHang, tenHang, soLuong, donGia, dsVL);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Nhap thoi gian bao hanh: ");
		thoiGianBaoHanh = sc.nextInt();
		System.out.print("Nhap cong suat: ");
		congSuat = sc.nextInt();
	}
	@Override
	public void output() {
		super.output();
		System.out.println("Thoi gian bao hanh: " + this.thoiGianBaoHanh);
		System.out.println("Cong suat: " + this.congSuat);
	}

}
