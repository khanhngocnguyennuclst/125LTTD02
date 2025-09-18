package Class;
import java.util.Scanner;
public class Nguoi {
	// thuoc tinh
	protected String hoTen124;
	protected String ngaySinh124;
	protected String queQuan124;
	public Nguoi() {

	}
	public Nguoi(String hoTen124, String ngaySinh124, String queQuan124) {
		this.hoTen124 = hoTen124;
		this.ngaySinh124 = ngaySinh124;
		this.queQuan124 = queQuan124;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen124 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh124 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan124 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen124);
		System.out.println("\tNgay sinh: " + ngaySinh124);
		System.out.println("\tQue quan: " + queQuan124);
	}
}
