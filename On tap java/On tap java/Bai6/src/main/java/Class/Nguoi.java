/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Nguoi {
    protected String hoTen124;
    protected Date ngSinh124;
    protected int CMND124;
    
    public Nguoi(){
    
    }
    public Nguoi( String hoTen124,Date ngSinh124,int CMND124 ){
        this.hoTen124=hoTen124;
        this.ngSinh124=ngSinh124;
        this.CMND124=CMND124;
    }
    public void nhapThongTin(Scanner sc)       {
        System.out.print("\t Nhap ho ten:");  
        hoTen124=sc.nextLine();
        System.out.print("\t Nhap ngay sinh:");
        String strDate=sc.nextLine();
        ngSinh124=strToDate(strDate);
        System.out.print("\t Nhap CMND:");
        CMND124=sc.nextInt();
    }   
    private Date strToDate(String strDate){
        Date date= null;
        SimpleDateFormat spf= new SimpleDateFormat("dd-MM-yyyy");
        try{
            date=spf.parse(strDate);
        } catch (ParseException e){
            System.out.println("Loi dinh dang ngay thang!!");
        }
        return date;
    }
    public void hienThiThongTin() {
    System.out.println("\tHo ten: " + hoTen124);
    System.out.println("\tNgay sinh: " + ngSinh124);
    System.out.println("\tHo ten: " + hoTen124);
    }   
    public int getCMND124(){
        return CMND124;
    }
}
