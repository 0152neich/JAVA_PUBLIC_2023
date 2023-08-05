package BTVN_BUOI2;

import java.util.Scanner;

public class Bai2b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0;
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
			s += f;
		}
		System.out.println(s);
	}
}
