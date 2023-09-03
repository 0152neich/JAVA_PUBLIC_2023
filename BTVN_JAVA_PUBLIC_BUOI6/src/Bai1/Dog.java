package Bai1;

import java.util.Scanner;

public class Dog extends Animal{
	private String character;
	
	public Dog() {
		
	}

	public Dog(String character, String name, Byte age, Float weight) {
		super(name, age, weight);
		this.character = character;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tinh cach cua cho: ");
		String chatacter = sc.nextLine();
		this.character = chatacter;
	}
	
	public void output() {
		super.output();
		System.out.println("Tinh cach cua cho: " + this.character);
	}
	
	@Override
	public void tiengKeu() {
		System.out.println("Tieng keu: Gau gau");
	}

}