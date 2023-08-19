package Bai3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sinhVien[] sv = new sinhVien[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("\nNhap thong tin sinh vien thu " + (i + 1));
			sv[i] = new sinhVien();
			sv[i].Nhap();
		}
		
		System.out.println("Danh sach 5 sinh vien: ");
		System.out.printf("%-10s %-20s %-8s %-8s %-8s %-8s%n", "Ma sinh vien", "Ho ten", "Diem toan", "Diem li", "Diem hoa", "Diem TB");
		
		for (int i = 0; i < 5; i++) {
			sv[i].Xuat();
		}
	}
}
