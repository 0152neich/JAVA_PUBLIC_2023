package Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<HangHoaDienTu> dsHangHoaDienTu = new ArrayList<>();
		List<HangHoaGiaDung> dsHangHoaGiaDung = new ArrayList<>();

		System.out.print("Nhap so luong hang hoa gia dung: ");
		int nGiaDung = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < nGiaDung; i++) {
			System.out.println("Nhap thong tin hang hoa gia dung thu " + (i + 1) + ":");
			HangHoaGiaDung giaDung = new HangHoaGiaDung();
			giaDung.input();
			dsHangHoaGiaDung.add(giaDung);
		}

		System.out.print("Nhap so hang hoa dien tu: ");
		int nDienTu = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < nDienTu; i++) {
			System.out.println("Nhap thong tin hang hoa dien tu thu " + (i + 1) + ":");
			HangHoaDienTu dienTu = new HangHoaDienTu();
			dienTu.input();
			dsHangHoaDienTu.add(dienTu);
		}

		System.out.println("Danh sach hang hoa gia dung:");
		for (HangHoaGiaDung giaDung : dsHangHoaGiaDung) {
			giaDung.output();
		}

		System.out.println("Danh sach hang hoa dien tu:");
		for (HangHoaDienTu dienTu : dsHangHoaDienTu) {
			dienTu.output();
		}
	}
}
