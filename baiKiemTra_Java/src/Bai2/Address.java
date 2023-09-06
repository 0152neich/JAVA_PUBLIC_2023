package Bai2;

import java.util.Scanner;

public class Address {
	private String city;
	private String district;
	
	public Address() {
		
	}

	public Address(String city, String district) {
		super();
		this.city = city;
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten thanh pho: ");
		city = sc.nextLine();
		System.out.print("Nhap ten huyen: ");
		district = sc.nextLine();
	}
	
	public void output() {
		System.out.println("Ten thanh pho: " + this.city);
		System.out.println("Ten huyen: " + this.district);
	}

}
