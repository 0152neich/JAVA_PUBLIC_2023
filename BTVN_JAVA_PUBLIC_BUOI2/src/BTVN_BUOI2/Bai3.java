package BTVN_BUOI2;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean t = true;
		if (n < 2) {
			t = false;
		}
		for (int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				t = false;
				break;
			}
		}
		if (t) {
			System.out.println(n + " la so nguyen to");
		} else {
			System.out.println(n + " khong la so nguyen to");
		}
	}
}
