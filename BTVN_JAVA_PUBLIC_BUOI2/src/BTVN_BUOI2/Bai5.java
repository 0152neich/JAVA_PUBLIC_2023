package BTVN_BUOI2;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int m = (b - b%2)/2;
		int n = (c - c%4)/4;
		System.out.println(Math.min(Math.min(a, m), n)*7);
	}
}
