package Class;
import java.util.Scanner;
public class ThiSinh {
	// thuoc tinh
	private int soBD124;
	private String hoTen124;
	private String diaChi124;
	private String dienUuTien124;
	public ThiSinh() {
	}
	public ThiSinh(int soBD124, String hoTen124, String diaChi124, String dienUuTien124) {
		this.soBD124 = soBD124;
		this.hoTen124 = hoTen124;
		this.diaChi124 = diaChi124;
		this.dienUuTien124 = dienUuTien124;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD124 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen124 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi124 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien124 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD124);
		System.out.println("\tHo ten: " + hoTen124);
		System.out.println("\tDia chi: " + diaChi124);
		System.out.println("\tDien uu tien: " + dienUuTien124);
	}   
	public int getSoBD() {
		return soBD124;
	}
}
