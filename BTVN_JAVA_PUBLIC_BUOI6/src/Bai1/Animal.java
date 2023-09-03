package Bai1;

import java.util.Scanner;

public class Animal {
	protected String name;
	protected Byte age;
	protected float weight;
	
	public Animal() {
		
	}

	public Animal(String name, Byte age, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Byte getAge() {
		return age;
	}

	public void setAge(Byte age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		String name = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		Byte age = sc.nextByte();
		System.out.print("Nhap can nang: ");
		Float weight = sc.nextFloat();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void output() {
		System.out.println("Ten loai: " + this.name);
		System.out.println("Tuoi: " + this.age);
		System.out.println("Can nang: " + this.weight);
	}
	
	public void tiengKeu() {
		System.out.println("Animal sound");
	}
}