/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing;
/**
 *
 * @author LENOVO
 */

import java.util.Scanner;
 import Class.KhachSan;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KhachSan ql = new KhachSan();
        ql.nhapDanhSach(sc);

        System.out.print("Nhap vao khach tro can tinh tien: ");
        int cmnd = sc.nextInt();

        System.out.println("--> Tong tien la: " + ql.tinhTien(cmnd));

        sc.close();
    }
}

