package Class;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi124;
	private int chiSoCu124;
	private double tien124;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi124, int chiSoCu124, double tien124) {
		this.chiSoMoi124 = chiSoMoi124;
		this.chiSoCu124 = chiSoCu124;
		this.tien124 = tien124;
	}

	public BienLai(String tenChuHo124, int chiSoMoi124, int chiSoCu124, double tien124) {
		this.tenChuHo124 = tenChuHo124;
		this.chiSoMoi124 = chiSoMoi124;
		this.chiSoCu124 = chiSoCu124;
		this.tien124 = tien124;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi124 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu124 = sc.nextInt();
		sc.nextLine();
		tien124 = (chiSoMoi124 - chiSoCu124) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi124);
		System.out.println("\tChi so cu: " + chiSoCu124);
		System.out.println("\tTien: : " + tien124);
	}
}
