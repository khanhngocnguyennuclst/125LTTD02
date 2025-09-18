package Class;
import java.util.Scanner;
public class Sach extends TaiLieu {
	// thuoc tinh
	private String tacGia124;
	private int soTrang124;

	// phuong thuc
	// ham khoi tao khong doi so
	public Sach() {
	}
	// ham khoi tao co doi so
	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia124, int soTrang124) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tacGia124 = tacGia124;
		this.soTrang124 = soTrang124;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia124 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang124 = sc.nextInt();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia124);
		System.out.println("\tSo trang: " + soTrang124);
	}
}
