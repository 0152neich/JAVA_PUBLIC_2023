package Bai2;

import java.util.Scanner;

public class Date {
	private Byte year;
	private Byte month;
	private Byte day;
	
	public Date() {
		
	}

	public Date(Byte year, Byte month, Byte day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public Byte getYear() {
		return year;
	}

	public void setYear(Byte year) {
		this.year = year;
	}

	public Byte getMonth() {
		return month;
	}

	public void setMonth(Byte month) {
		this.month = month;
	}

	public Byte getDay() {
		return day;
	}

	public void setDay(Byte day) {
		this.day = day;
	}
	
	public void input() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Nhap ngay: ");
	    this.day = sc.nextByte();
	    System.out.print("Nhap thang: ");
	    this.month = sc.nextByte();
	    System.out.print("Nhap nam: ");
	    this.year = sc.nextByte();
	    sc.nextLine();
	}

	
	public void output() {
		System.out.println("Ngay sinh nhat: " + this.day + "/" + this.month + "/" + this.year);
	}

}
