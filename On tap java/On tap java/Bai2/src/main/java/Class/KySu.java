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
public class KySu extends CanBo {
    //thuoc tinh
    private String nganhDaoTao124;
    //phuong thuc
    //Ham khoi tao khong doi
    public KySu(){
        
    }
    
    //Ham khoi tao co doi
    public KySu(String hoTen124,String ngaySinh124,String gioiTinh124,String diaChi124,String nganhDaoTao124){
        super(hoTen124,ngaySinh124,gioiTinh124,diaChi124);
        this.nganhDaoTao124=nganhDaoTao124;
    }
    
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("\tNhap nhanh dao tao: ");
        nganhDaoTao124=sc.nextLine();
    }
    
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tNganh dao tao: "+nganhDaoTao124);
        
    }
}
