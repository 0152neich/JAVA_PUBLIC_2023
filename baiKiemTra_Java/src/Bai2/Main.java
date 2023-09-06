package Bai2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Classroom classroom = new Classroom();
		System.out.println("Nhap thong tin lop va sv: ");
		classroom.input();
		System.out.println("Danh sach thong tin sv: ");
		classroom.output();
	}

}
