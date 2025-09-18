package Class;
import java.util.Scanner;
public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu124;
	private String tenNXB124;
	private int soBanPhatHanh124;
	public TaiLieu() {
	}
	public TaiLieu(String maTaiLieu124, String tenNXB124, int soBanPhatHanh124) {
		this.maTaiLieu124 = maTaiLieu124;
		this.tenNXB124 = tenNXB124;
		this.soBanPhatHanh124 = soBanPhatHanh124;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu124 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB124 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh124 = sc.nextInt();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu124);
		System.out.println("\tTen nha xuat ban: " + tenNXB124);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh124);
	}
	public String getMaTaiLieu() {
		return maTaiLieu124;
	}
}
