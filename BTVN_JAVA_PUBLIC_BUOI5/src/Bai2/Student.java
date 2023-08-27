package Bai2;

import java.util.Scanner;

public class Student {

    private String Name;
    private String Class;
    private double Score;
    private Faculty y = new Faculty();

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getClassName() {
        return this.Class;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double Score) {
        this.Score = Score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    public Student() {
    }

    public Student(String Name, String Class, double Score, Faculty y) {
        this.Name = Name;
        this.Class = Class;
        this.Score = Score;
        this.y = y;
    }

    public void Input() {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten hoc sinh: ");
        Name = sc.nextLine();
        System.out.print("Nhap ten lop: ");
        this.Class = sc.nextLine();
        System.out.print("Nhap diem: ");
        Score = sc.nextDouble();
        sc.nextLine();
        y.Input();
    }

    public void Output() {
        System.out.println("Ten hoc sinh la: " + this.Name);
        System.out.println("Hoc sinh lop: " + this.Class);
        System.out.println("Diem: " + this.Score);
        y.Output();
    }
}