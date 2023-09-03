package BTVN_BUOI3;

import java.util.Scanner;

public class Bai4 {
	
	static boolean sosanhchuoi(String s) {
		String s1 = "";
		for (int i = s.length(); i > 0; i--) {
			s1 += s.charAt(i - 1);
		}
		return s.equals(s1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi can kiem tra: ");
		String s = sc.next();
		System.out.println(sosanhchuoi(s));
	}
}
