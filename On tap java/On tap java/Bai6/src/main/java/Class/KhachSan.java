/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Scanner;
public class KhachSan {
    private ArrayList<KhachTro> ds124;
    public KhachSan() {
        ds124 = new ArrayList<KhachTro>(10);
    }
    public void themKhachTro(KhachTro kt) {
        ds124.add(kt);
    }
    // ham nhap danh sach
public void nhapDanhSach(Scanner sc) {
    KhachTro khach;

    System.out.print("Nhap vao so luong khach: ");
    int n = sc.nextInt();
    sc.nextLine();

    System.out.println("Nhap vao thong tin khach tro:");
    for (int i = 0; i < n; i++) {
        System.out.println("Khach tro thu " + (i + 1) + " la:");
        khach = new KhachTro();
        khach.nhapThongTin(sc);
        themKhachTro(khach);
    }
}

// ham hien thi danh sach
public void hienThiDanhSach() {
    for (KhachTro khach : ds124) {
        khach.hienThiThongTin();
    }
}

// ham tinh tien
public double tinhTien(int CMND124) {
    double tien = 0;

    for (KhachTro khach : ds124) {
        if (khach.getCMND124() == CMND124) {
            tien = khach.getSoNgayTro() * khach.getGiaPhong();
        }
    }
    return tien;
}

}

