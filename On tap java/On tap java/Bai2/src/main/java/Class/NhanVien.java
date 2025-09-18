/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class NhanVien extends CanBo {
    //Thuoc tinh
    private String congViec124;
    
            
    // Phuong thuc
    //Ham khoi tao khong doi
    public NhanVien(){       
    }
    //Ham khoi tao co doi
    public NhanVien(String hoTen124,String ngaySinh124,String gioiTinh124,String diaChi124){
        super(hoTen124,ngaySinh124,gioiTinh124,diaChi124);
        this.congViec124=congViec124;
    }
    
    //Ham nhap
    public void nhapThongTin(Scanner sc){
        super .nhapThongTin(sc);
        System.out.print("\tNhap cong viec: ");
        congViec124=sc.nextLine();
    }
    
    //Ham hien thi
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tCong viec: "+congViec124);
    }
}


