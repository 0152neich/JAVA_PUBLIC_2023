package BTVN_BUOI3;

import java.util.Scanner;

public class Bai5 {
	static String chuoi(String s) {
		String[] t = s.trim().split("\\s+");
		String name = "";

		for (String x : t) {
			String w = Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase();
			name += w + " ";
		}
		return name.trim();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String names = Bai5.chuoi(name);
		System.out.println(names);
	}
}
