/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class QLCB {
    //thuoc tinh
    private ArrayList<CanBo> dscb;
    //phuong thuc
    //Ham khoi tao
    public QLCB(){
        dscb=new ArrayList<CanBo>(10);
    }
    
    //Ham them can bo
    public void themCanBo(CanBo cb){
        dscb.add(cb);
    }
    public void nhapDanhSach(Scanner sc){
        CanBo cb;
        System.out.print("Nhap vao so luong can bo: ");
        int n=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Nhap thong tin chi tiet: ");
        for(int i=0;i<n;i++){
            System.out.println("Lan thu nhap: "+(i+1)+":");
            System.out.println("Chon lcan bo (1-KySu ; 2-NhanVien ; 3-CongNhan): ");
            int chon124=sc.nextInt();
            sc.nextLine();
            cb=new CanBo();
            
            switch (chon124) {
                case 1:
                    cb=new KySu();
                    break;
                case 2:
                    cb=new NhanVien();
                    break;
                case 3:
                    cb=new CongNhan();
                    break;
                    
                default:
                    cb=new KySu();
                    
            }
            cb.nhapThongTin(sc);
            //Them cbo vao danh sach
            themCanBo(cb);
        }
    }
    //Ham tim kiem theo ten
    public void timKiemCanBo(String hoTen124){
        for(CanBo cb : dscb){
            if(hoTen124.equals(cb.getHoTen())){
                cb.hienThiThongTin();
            }
        }
    }
}
