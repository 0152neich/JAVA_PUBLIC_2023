package Bai3;

import java.util.Scanner;

public class sinhVien {
	private int maSinhVien;
	private String hoTen;
	private double diemToan;
	private double diemLi;
	private double diemHoa;
	
	public sinhVien() {
		
	}

	public sinhVien(int maSinhVien, String hoTen, double diemToan, double diemLi, double diemHoa) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diemToan = diemToan;
		this.diemLi = diemLi;
		this.diemHoa = diemHoa;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLi() {
		return diemLi;
	}

	public void setDiemLi(double diemLi) {
		this.diemLi = diemLi;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	
	public double diemTB() {
		return (double)((diemToan + diemLi + diemHoa)/3);
	}
	public void Nhap() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Nhap ma sinh vien: ");
	    maSinhVien = sc.nextInt();
	    sc.nextLine();
	    System.out.print("Nhap ho ten: ");
	    hoTen = sc.nextLine();
	    System.out.print("Nhap diem toan: ");
	    diemToan = sc.nextDouble();
	    System.out.print("Nhap diem li: ");
	    diemLi = sc.nextDouble();
	    System.out.print("Nhap diem hoa: ");
	    diemHoa = sc.nextDouble();
	}

	
	public void Xuat() {
	    System.out.printf("%-10s %-20s %-8.2f %-8.2f %-8.2f %-8.2f%n", maSinhVien, hoTen, diemToan, diemLi, diemHoa,
	            diemTB());
	}

}
