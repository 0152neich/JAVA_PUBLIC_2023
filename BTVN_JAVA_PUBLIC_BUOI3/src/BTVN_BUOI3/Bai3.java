package BTVN_BUOI3;

import java.util.Scanner;

public class Bai3 {

	static int[] sapxep(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("Nhap cac phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		int[] arr = sapxep(a, n);
		System.out.print("Mang sau khi sap xep la: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
