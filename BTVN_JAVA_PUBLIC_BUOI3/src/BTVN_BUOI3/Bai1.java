package BTVN_BUOI3;

import java.util.Scanner;

public class Bai1 {
	static final int MAX = 1000;

	static int[] dem(int[] a, int n) {
		int[] cnt = new int[MAX];
		for (int i = 0; i < n; i++) {
			cnt[a[i]]++;
		}
		return cnt;
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
		
		int[] cnt = Bai1.dem(a, n);
		for (int i = 0; i < MAX; i++) {
			if (cnt[i] > 0) {
				System.out.println("so " + i + " xuat hien " + cnt[i] + " lan");
			}
		}
	}
}
