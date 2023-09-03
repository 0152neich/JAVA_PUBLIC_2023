package Bai2;

import java.util.Scanner;

public class Student extends Person{
	private String id;
	private String clasS;
	private String school;
	
	public Student() {
		
	}

	public Student(String id, String clasS, String school, String name, String age, String address, Date birthDay) {
		super(name, age, address, birthDay);
		this.id = id;
		this.clasS = clasS;
		this.school = school;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClasS() {
		return clasS;
	}

	public void setClasS(String clasS) {
		this.clasS = clasS;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap id: ");
		this.id = sc.nextLine();
		System.out.print("Nhap lop: ");
		this.clasS = sc.nextLine();
		System.out.print("Nhap truong: ");
		this.school = sc.nextLine();
		System.out.println("Nhap thong tin: ");
		super.input();
	}
	
	public void output() {
		System.out.println("Truong: " + this.school);
		System.out.println("Lop: " + this.clasS);
		System.out.println("Id: " + this.id);
		super.output();
	}

}