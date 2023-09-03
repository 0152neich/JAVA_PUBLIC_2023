package Bai1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cat cat = new Cat();
		Dog dog = new Dog();
		System.out.println("Nhap thong tin cua meo: ");
		cat.input();
		System.out.println("Thong tin cua meo: ");
		cat.output();
		cat.tiengKeu();
		System.out.println("Nhap thong tin cua cho: ");
		dog.input();
		System.out.println("Thong tin cua cho: ");
		dog.output();
		dog.tiengKeu();
	}

}