package Bai3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		May may = new May();
		QuanLi quanLi = new QuanLi();
		PhongMay phongMay = new PhongMay();
		
		phongMay.Input();
		quanLi.Input();
		
		int m = phongMay.getN();
		May[] maY = new May[m];
		for (int i = 0; i < m; i++) {
			may.Input();
			maY[i] = may;
		}
		
		System.out.println("Thong tin da duoc nhap la:");
		System.out.println("1. Thong tin quan ly:");
		quanLi.Output();
		System.out.println("2. Thong tin phong may:");
		phongMay.Output();
		System.out.println("3. Thong tin may:");
		for (int  i = 0; i < m; i++) {
			System.out.println("May thu " + (i + 1) + ": ");
			maY[i].Output();
		}
	}
}
