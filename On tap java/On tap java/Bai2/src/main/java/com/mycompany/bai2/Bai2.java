/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2;

import java.util.Scanner;
import Class.QLCB;
/**
 *
 * @author LENOVO
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        qlcb.nhapDanhSach(sc);
        System.out.print("Nhap vao ho ten can tim kiem: ");
        String name = sc.nextLine();
        qlcb.timKiemCanBo(name);
        
        sc.close();
    }
}
