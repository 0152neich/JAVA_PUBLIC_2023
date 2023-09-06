package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
	private int classId;
	private int numberOfStudent;
	ArrayList<Student> listStudent = new ArrayList<>();

	public Classroom() {

	}

	public Classroom(int classId, int numberOfStudent, ArrayList<Student> listStudent) {
		super();
		this.classId = classId;
		this.numberOfStudent = numberOfStudent;
		this.listStudent = listStudent;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	public ArrayList<Student> getListStudent() {
		return listStudent;
	}

	public void setListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma lop: ");
		classId = sc.nextInt();
		System.out.print("Nhap so sv: ");
		numberOfStudent = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < numberOfStudent; i++) {
			Student student = new Student();
			System.out.println("Nhap thong tin sv thu" + (i + 1) + ": ");
			student.input();
			listStudent.add(student);
		}
	}

	public void output() {
		System.out.println("Ma lop: " + this.classId);
		System.out.println("So sv: " + this.numberOfStudent);
		for( Student student : listStudent) {
			student.output();
		}
	}
	
//	public ArrayList<Student> searchByName(String name){
//		ArrayList<Student> newList = new ArrayList<>();
//		for (Student student : listStudent) {
//			if (student.name == name) {
//				newList.add(student);
//			}
//		}
//		return null;
//	}
}
