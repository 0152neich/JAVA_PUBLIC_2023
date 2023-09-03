package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		sc.nextLine();
		List<Student> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Student student = new Student();
			System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ": ");
			student.input();
			list.add(student);
		}
		
		System.out.println("Thong tin sinh vien: ");
		for(Student s : list) {
			s.output();
		}
	}

}