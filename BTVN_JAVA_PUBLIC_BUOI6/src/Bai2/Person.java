package Bai2;

import java.util.Scanner;

public class Person {
	protected String name;
	protected String age;
	protected String address;
	protected Date birthDay;
	
	public Person() {
		
	}

	public Person(String name, String age, String address, Date birthDay) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		String name = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		String age = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		String address = sc.nextLine();
		birthDay = new Date();
		System.out.println("Nhap ngay sinh nhat: ");
		birthDay.input();
		this.name = name;
		this.age = age;
		this.address = address;
		this.birthDay = birthDay;
	}
	
	public void output() {
		System.out.println("Ten: " + this.name);
		System.out.println("Tuoi: " + this.age);
		System.out.println("Dia chi: " + this.address);
		System.out.println("Ngay sinh nhat: ");
		this.birthDay.output();
	}

}