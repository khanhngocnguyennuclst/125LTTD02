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
public class KhachTro extends Nguoi{
    private int soNgayTro124;
    private String loaiPhong124;
    private double giaPhong124;
    
    public KhachTro(){
       
    }
    public KhachTro(String hoTen124,int CMND124,int soNgayTro124,String loaiPhong124,Double giaPhong124 ){
        this.hoTen124=hoTen124;
        this.CMND124=CMND124;
        this.soNgayTro124=soNgayTro124;
        this.loaiPhong124=loaiPhong124;
        this.giaPhong124=giaPhong124;
    }
    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("\tNhap so ngay tro: ");
        soNgayTro124 = sc.nextInt(); 
        sc.nextLine();

        System.out.print("\tNhap loai phong: ");
        loaiPhong124 = sc.nextLine();

        System.out.print("\tNhap gia phong: ");
        giaPhong124 = sc.nextDouble(); 
        sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tSo ngay tro: " + soNgayTro124);
        System.out.println("\tLoai phong: " + loaiPhong124);
        System.out.println("\tGia phong: " + giaPhong124);
    }
    public int getSoNgayTro(){
        return soNgayTro124;
    }
    public Double getGiaPhong(){
        return giaPhong124;
    }
}
