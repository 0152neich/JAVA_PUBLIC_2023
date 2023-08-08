package BTVN_BUOI2;
//a
import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phuong trinh da cho co vo so nghiem");
				} else {
					System.out.println("Phuong trinh da cho vo nghiem");
				}
			} else {
				if (c == 0) {
					System.out.println("Phuong trinh da cho co nghiem la 0");
				} else {
					if (-c / b > 0) {
						System.out.println("Phuong trinh da cho co 2 nghiem la: " + Math.sqrt(-c / b) + " va "
								+ (-Math.sqrt(-c / b)));
					} else {
						System.out.println("Phuong trinh da cho vo nghiem");
					}
				}
			}
		} else {
			double d = b * b - 4 * a * c;
			double y1 = (-b - Math.sqrt(d)) / (2 * a);
			double y2 = (-b + Math.sqrt(d)) / (2 * a);
			if (d < 0) {
				System.out.println("Phuong trinh da cho vo nghiem");
			} else if (d == 0) {
				if (-b / (2 * a) < 0) {
					System.out.println("Phuong trinh da cho vo nghiem");
				} else {
					System.out.println("Phuong trinh da cho co 2 nghiem la:" + Math.sqrt(-b / (2 * a)) + " va "
							+ (-Math.sqrt(-b / (2 * a))));
				}
			} else {
				System.out.println("Phuong trinh da cho co 4 nghiem la:");
				System.out.println("x1 = " + Math.sqrt(y1));
				System.out.println("x2 = " + (-Math.sqrt(y1)));
				System.out.println("x3 = " + Math.sqrt(y2));
				System.out.println("x4 = " + (-Math.sqrt(y2)));
			}
		}
	}
}
