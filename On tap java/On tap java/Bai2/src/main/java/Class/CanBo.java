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
public class CanBo {
        //Thuộc tính
    private String hoTen124;
    private String ngaySinh124;
    private String gioiTinh124;
    private String diaChi124;
    
    //Phuong thuc
    //Ham khoi tao khong doi
    public CanBo(){  
    }
    //Ham khoi tao co doi
    public CanBo(String hoTen124, String ngaySinh124, String gioiTinh124, String diaChi124){
        this.hoTen124 = hoTen124;
        this.ngaySinh124=ngaySinh124;
        this.gioiTinh124=gioiTinh124;
        this.diaChi124=diaChi124;
    }
    //Ham nhap
    public void nhapThongTin(Scanner sc){
        System.out.println("\tNhap ho ten: ");
        hoTen124=sc.nextLine();
        System.out.println("\tNhap ngay sinh (dd/MM/yy): ");
        ngaySinh124=sc.nextLine();
        System.out.println("\tNhap gioi tinh: ");
        gioiTinh124=sc.nextLine();
        System.out.println("\tNhap dia chi: ");
        diaChi124=sc.nextLine();
    }
    //Ham hien thi
    public void hienThiThongTin(){
        System.out.printf("\tHo ten: "+hoTen124);
        System.out.printf("\tNgay sinh: "+ngaySinh124);
        System.out.printf("\tGioi tinh: "+gioiTinh124);
        System.out.printf("\tDia chi: "+diaChi124);
    }
    
    //Ham lay thong tin ho ten
    public String getHoTen(){
        return this.hoTen124;
    }
}
