package lab1.bai1;

import java.util.Scanner;
public class bai1 {
public static void main(String[] args){
    String hoten;
    String ngaysinh;
    int mssv;
    Scanner kb = new Scanner(System.in); 

    System.out.println("nhap ho ten:");
    hoten = kb.nextLine();
    System.out.println("ho ten la: " + hoten);

    System.out.println("nhap ngay sinh:");
    ngaysinh = kb.nextLine();
    System.out.println("ngay sinh la: " + ngaysinh);

    System.out.println("nhap mssv:");
    mssv = kb.nextInt();
    System.out.println("mssv la: " + mssv);
    kb.close();
    }
} 
    

