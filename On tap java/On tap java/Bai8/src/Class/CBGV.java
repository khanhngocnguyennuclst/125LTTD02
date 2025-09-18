package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung124;
	private double thuong124;
	private double phat124;
	private double luongThucLinh124;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung124 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong124 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat124 = sc.nextDouble();
		sc.nextLine();

		// tinh luong
		luongThucLinh124 = luongCung124 + thuong124 - phat124;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung124);
		System.out.println("\tThuong: " + thuong124);
		System.out.println("\tPhat: " + phat124);
		System.out.println("\tLuong thuc linh: " + luongThucLinh124);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh124;
	}
}
