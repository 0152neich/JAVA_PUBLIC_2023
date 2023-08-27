package Bai2;

import java.util.Scanner;

public class Faculty {

    private String Name;
    private String Date;
    private School x = new School();

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    public Faculty() {
    }

    public Faculty(String Name, String Date, School x) {
        this.Name = Name;
        this.Date = Date;
        this.x = x;
    }

    public void Input() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Nhap ten khoa: ");
        Name = sc.nextLine();
        System.out.print("Nhap ngay vao khoa: ");
        Date = sc.nextLine();
        System.out.print("Nhap ten truong: ");
        x.setName(sc.nextLine());
        System.out.print("Nhap ngay vao truong: ");
        x.setDate(sc.nextLine());
        x.getDate();
    }

    public void Output() {
        System.out.println("Ten khoa la: " + this.Name);
        System.out.println("Ngay vao khoa la: " + this.Date);
        System.out.println("Ten truong la: " + this.x.getName());
        System.out.println("Ngay vao truong la: " + this.x.getDate());
    }
}
