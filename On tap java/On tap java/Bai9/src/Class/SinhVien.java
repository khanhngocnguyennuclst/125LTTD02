package Class;
import java.util.Scanner;
public class SinhVien {
	protected String hoTen124;
	protected String maSV124;
	protected String ngaySinh124;
	protected String lop124;
	public SinhVien() {
	}
	public SinhVien(String hoTen124, String maSV124, String ngaySinh124, String lop124) {
		this.hoTen124 = hoTen124;
		this.maSV124 = maSV124;
		this.ngaySinh124 = ngaySinh124;
		this.lop124 = lop124;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen124 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV124 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh124 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop124 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen124);
		System.out.println("\tNgay sinh: " + ngaySinh124);
		System.out.println("\tMa sinh vien: " + maSV124);
		System.out.println("\tLop: " + lop124);
	}
}
