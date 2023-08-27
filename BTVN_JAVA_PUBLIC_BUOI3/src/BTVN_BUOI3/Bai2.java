package BTVN_BUOI3;

import java.util.Scanner;

public class Bai2 {

	static int[] them(int[] a, int b, int c) {
		int[] newa = new int[a.length + 1];
		int j = 0;
		for (int i = 1; i <= newa.length; i++) {
			if (i == b) {
				newa[i - 1] = c;
			} else {
				newa[i - 1] = a[j];
				j++;
			}
		}
		return newa;
	}

	static int[] xoa(int[] a, int b) {
		int[] newa = new int[a.length - 1];
		int j = 0;
		for (int i = 1; i <= a.length; i++) {
			if (i == b) {
				continue;
			} else {
				newa[j] = a[i - 1];
				j++;
			}
		}
		return newa;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu cua mang: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("Nhap cac phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		int b;
		do {
			System.out.print("Nhap vi tri can them phan tu: ");
			b = sc.nextInt();
		} while (b < 0 || b >= n);
		System.out.print("Nhap gia tri phan tu moi: ");
		int c = sc.nextInt();
		int[] newa = Bai2.them(a, b, c);
		System.out.print("Mang sau khi them phan tu la : ");
		for (int i = 0; i < newa.length; i++) {
			System.out.print(newa[i] + " ");
		}
		System.out.println();
		int m;
		do {
			System.out.print("Nhap vi tri can xoa phan tu: ");
			m = sc.nextInt();
		} while (m < 0 || m >= n);
		int[] newarr = Bai2.xoa(a, m);
		System.out.print("Mang sau khi xoa phan tu la:");
		for (int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i] + " ");
		}
	}
}
