/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1;

import Class.PhanSo;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo psTong = new PhanSo();
        
        //Nhap phan so
        System.out.println("Nhap vao phan so thu nhat: ");
        ps1.NhapPS(sc);
        System.out.println("Nhap vao phan so thu hai: ");
        ps2.NhapPS(sc);
        
        //Tinh tong
        psTong = ps1.CongPS(ps2);
        
        //Hien thi phan so
        System.out.println("Phan so thu nhat: ");
        ps1.Xuat();
        System.out.println("Phan so thu hai: ");
        ps2.Xuat();
        System.out.println("=> Tong hai phan so la: ");
        psTong.Xuat();
        
        sc.close();
    }
}
