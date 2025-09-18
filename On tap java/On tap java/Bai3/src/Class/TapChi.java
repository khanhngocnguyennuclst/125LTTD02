package Class;
import java.util.Scanner;
public class TapChi extends TaiLieu {
	// thuoc tinh
	private int soPhatHanh124;
	private int thangPhatHanh124;
	public TapChi() {
	}
	public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh124, int thangPhatHanh124) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh124 = soBanPhatHanh;
		this.thangPhatHanh124 = thangPhatHanh124;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh124 = sc.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh124 = sc.nextInt();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh124);
		System.out.println("\tThang phat hanh: " + thangPhatHanh124);
	}
}
