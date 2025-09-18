package Class;
import java.util.Scanner;
public class KhoiA extends ThiSinh {
	// thuoc tinh
	private String mon1124;
	private String mon2124;
	private String mon3124;
	public KhoiA() {
	}

	public KhoiA(String mon1124, String mon1243124, String mon3124) {
		this.mon1124 = mon1124;
		this.mon2124 = mon2124;
		this.mon3124 = mon3124;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1124 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2124 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3124 = sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1124 + " - " + mon2124 + " - " + mon3124);
	}
}
