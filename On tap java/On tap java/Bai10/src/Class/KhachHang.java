package Class;

import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo124;
	protected int soNha124;
	protected String maCongTo124;
	public KhachHang() {
	}
	public KhachHang(String tenChuHo124, int soNha124, String maCongTo124) {
		this.tenChuHo124 = tenChuHo124;
		this.soNha124 = soNha124;
		this.maCongTo124 = maCongTo124;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo124 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha124 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo124 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo124);
		System.out.println("\tSo nha: " + soNha124);
		System.out.println("\tMa cong to: " + maCongTo124);
	}
}
