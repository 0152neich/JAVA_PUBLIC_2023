package Bai1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so luong sach :");
		int n = sc.nextInt();

		Sach[] lst = new Sach[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nNhap thong tin cuon sach thu " + (i + 1));
			lst[i] = new Sach();
			lst[i].nhapThongtin();
		}

		System.out.println("Thong tin sach:");
		System.out.printf("%-15s %-30s %-20s %-20s %-10s%n", "Ma sach", "Ten sach", "Tac gia", "Nha xuat ban",
				"Nam xuat ban");
		for (int i = 0; i < n; i++) {
			lst[i].xuatThongtin();
		}
	}
}
