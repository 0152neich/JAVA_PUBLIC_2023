package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Classroom classroom = new Classroom();
		System.out.println("Nhap thong tin lop va sv: ");
		classroom.input();
		System.out.println("Nhap ten sinh vien can tim: ");
		String name2 = sc.nextLine();
		System.out.println("Danh sach thong tin sv: ");
		classroom.output();
		System.out.println("Danh sach sinh vien sau khi tim kiem: ");
		ArrayList<Student> matchingStudents = classroom.searchByName(name2);
		for (Student student : matchingStudents) {
		    student.output();
		}
	}

}
