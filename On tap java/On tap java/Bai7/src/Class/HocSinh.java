package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop124;
	private String khoHoc124;
	private String kyHoc124;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen, String lop, String khoaHoc, String kyHoc) {
		this.hoTen124 = hoTen124;
		this.lop124 = lop124;
		this.khoHoc124 = khoHoc124;
		this.kyHoc124 = kyHoc124;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop124 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc124 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc124 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop124);
		System.out.println("\tKhoa hoc: " + khoHoc124);
		System.out.println("\tKy hoc: " + kyHoc124);
	}

	// ham lay ra thong tin ve lop
	public String getLop() {
		return lop124;
	}
}
