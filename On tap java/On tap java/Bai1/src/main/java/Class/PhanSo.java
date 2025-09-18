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
public class PhanSo {
    //Thuộc tính (bao đóng)
    private int tuSo124;
    private int mauSo124;
    
    
    //Phương thức
    //Hàm khởi tạo không đối
    public PhanSo(){
        tuSo124 = 0;
        mauSo124 = 1;
    }
    
    //Hàm khởi tạo có đối
    public PhanSo(int tuSo124,int mauSo124){
        this.tuSo124 = tuSo124;
        this.mauSo124 = mauSo124;
    }
    
    //Hàm nhập phân số
    public void NhapPS(Scanner sc){
        int a124;
        int b124;
        
        do{
            System.out.println("- Nhap vao tu so: ");
            a124 = sc.nextInt();
            
            System.out.println("- Nhap vao mau so: ");
            b124 = sc.nextInt();
            
            //Check
            if(b124 == 0){
                System.out.println("Loi! Mau so khong duoc bang 0.Nhap lai!");
            }else{
                tuSo124 = a124;
                mauSo124 =b124;
            }
        }
        while(b124 == 0);
    }
    
        //Hàm xuất
       public void Xuat(){
        if(tuSo124 * mauSo124 < 0){
            System.out.println("\t-" +Math.abs(tuSo124) + "/" +Math.abs(mauSo124));
        }else{
            System.out.println("\t"+Math.abs(tuSo124) + "/" +Math.abs(mauSo124));
        }
       }
       
       //Hàm cộng
       public PhanSo CongPS(PhanSo ps2){
           int a124 = tuSo124*ps2.mauSo124 + ps2.tuSo124*mauSo124;
           int b124 = mauSo124 * ps2.mauSo124;
           
           return new PhanSo(a124,b124);
       }
       
       //Hàm nhân
       public PhanSo NhanPS(PhanSo ps2){
           int a124 = tuSo124*ps2.tuSo124;
           int b124 = mauSo124*ps2.mauSo124;
           
           return new PhanSo(a124,b124);
       }
       
       //Hàm chia 
       public PhanSo ChiaPS(PhanSo ps2){
           int a124 = tuSo124*ps2.mauSo124;
           int b124 = mauSo124*ps2.tuSo124;
           
           return new PhanSo(a124,b124);
       }
       
       //Hàm tìm USCLN
       private int timUSCLN(int a124 , int b124){
           int r124 = a124%b124;
           
           while(r124!=0){
               a124=b124;
               b124=r124;
               r124=a124%b124;
           }
           return b124;
       }
       
       //Hàm kiểm tra phân số tối giản hay chưa
       public boolean kiemTraToiGian(){
           if(timUSCLN(tuSo124,mauSo124) == 1){
               return true;
           }
           return false;
       }
       
       //Hàm tối giản 
       public void toiGianPS(){
           int x124 = timUSCLN(tuSo124,mauSo124);
           
           tuSo124/=x124;
           mauSo124/=x124;
       }
    }

