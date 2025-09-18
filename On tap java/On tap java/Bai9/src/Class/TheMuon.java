package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	// thuoc tinh
	private int soMuon124;
	private Date ngayMuon124;
	private Date hanTra124;
	private String soHieu124;

	// phuong thuc
	// ham khoi tao khong doi so
	public TheMuon() {

	}

	// ham khoi tao co doi so
	public TheMuon(int soMuon124, Date ngayMuon124, String soHieu124) {
		this.soMuon124 = soMuon124;
		this.ngayMuon124 = ngayMuon124;
		this.soHieu124 = soHieu124;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so muon: ");
		soMuon124 = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon124 = strToDate(strNgayMuon);

		String strNgayTra = "31-12-2020";
		hanTra124 = strToDate(strNgayTra);

		System.out.println("\tNhap so hieu: ");
		soHieu124 = sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon124);
		System.out.println("\tNgay muon: " + ngayMuon124);
		System.out.println("\tHan tra: " + hanTra124);
		System.out.println("\tSo hieu: " + soHieu124);
	}

	// ham lay ra thong tin ve han tra
	public Date getHanTra() {
		return hanTra124;
	}
}
