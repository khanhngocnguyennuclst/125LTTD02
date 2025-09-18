/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;
import java.util.Scanner;
import Class.TuyenSinh;
/**
 *
 * @author LENOVO
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

		TuyenSinh dsTuyenSinh = new TuyenSinh();

		System.out.println("Nhap vao danh sach thi sinh.");
		dsTuyenSinh.nhapDanhSach(sc);

		System.out.println("Danh sach thi sinh du thi la:");
		dsTuyenSinh.hienThiDanhSach();

		System.out.print("Nhap so bao danh can tim: ");
		int soBaoDanh = sc.nextInt();
		sc.nextLine();

		dsTuyenSinh.timKiemThiSinh(soBaoDanh);

		sc.close();
	}   
}
