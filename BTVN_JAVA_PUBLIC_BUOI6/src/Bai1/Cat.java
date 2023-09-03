package Bai1;

import java.util.Scanner;

public class Cat extends Animal{
	private String color;
	private String preferances;
	private String ownerName;
	
	public Cat() {
		
	}

	public Cat(String color, String preferances, String ownerName, String name, Byte age, Float weight) {
		super(name, age, weight);
		this.color = color;
		this.preferances = preferances;
		this.ownerName = ownerName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPreferances() {
		return preferances;
	}

	public void setPreferances(String preferances) {
		this.preferances = preferances;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Nhap mau sac cua meo: ");
		String color = sc.nextLine();
		System.out.print("Nhap so thich cua meo: ");
		String preferences = sc.nextLine();
		System.out.print("Nhap ten chu so huu: ");
		String ownerName = sc.nextLine();
		this.color = color;
		this.preferances = preferences;
		this.ownerName = ownerName;
	}
	
	public void output() {
		super.output();
		System.out.println("Mau sac cua meo: " + this.color);
		System.out.println("So thich cua meo: " + this.preferances);
		System.out.println("Ten chu so huu: " + this.ownerName);
	}
	
	@Override
	public void tiengKeu() {
		System.out.println("Tieng keu: Meo meo");
	}

}