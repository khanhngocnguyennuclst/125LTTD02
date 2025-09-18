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
public class CongNhan extends CanBo {
    //thuoc tinh
    private String bac124;
   
    //phuong thuc
    //ham khoi tao khong doi
    public CongNhan(){
    }
    
    //ham khoi tao co doi
    public CongNhan(String hoTen124,String ngaySinh124,String gioiTinh124,String diaChi124,String nganhDaoTao124){
        super(hoTen124,ngaySinh124,gioiTinh124,diaChi124);
        this.bac124=bac124;
    }
    
    //Ham nhap
    public void nhapThongTin(Scanner sc){
      super.nhapThongTin(sc);
      System.out.print("\tNhap bac: ");
      bac124=sc.nextLine();
    }
    
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tBac: "+bac124);
    }
}
