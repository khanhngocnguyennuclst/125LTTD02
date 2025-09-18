package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen124;
	protected Date ngaySinh124;
	protected String queQuan124;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this.hoTen124 = hoTen124;
		this.ngaySinh124 = ngaySinh124;
		this.queQuan124 = queQuan124;
	}

	// ham nhap vao thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen124 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh124= strToDate(strDate);

		System.out.print("\tNhap que quan: ");
		queQuan124 = sc.nextLine();
	}

	private Date strToDate(String strDate) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen124);
		System.out.println("\tNgay sinh: " + ngaySinh124);
		System.out.println("\tQue quan: " + queQuan124);
	}

	// ham lay ra que quan
	public String getQueQuan() {
		return queQuan124;
	}

	// ham lay ra thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh124;
	}
}

