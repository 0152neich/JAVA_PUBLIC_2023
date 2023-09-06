package Bai2;

import java.util.Scanner;

public class Student extends Person{
	private int id;
	private Address address;
	private double gpa;
	
	public Student() {
		
	}

	public Student(int id, Address address, double gpa, String name, int age, String gender) {
		super(name, age, gender);
		this.id = id;
		this.address = address;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap id: ");
		id = sc.nextInt();
		sc.nextLine();
		address = new Address();
		address.input();
		System.out.print("Nhap gpa: ");
		gpa = sc.nextDouble();
		sc.nextLine();
	}
	
	public void output() {
		super.output();
		System.out.println("Id: " + this.id);
		address.output();
		System.out.println("Gpa: " + this.gpa);
	}

}
