package lab1.bai7;
import java.util.Scanner;

public class bai7 {
      public static void main(String[] args) {
    double toan,ly,hoa,sinh,maytinh ;
        Scanner kb = new Scanner(System.in); 
    System.out.println("nhap diem toan: ");
    toan = kb.nextDouble();
    System.out.println("nhap diem ly: ");
    ly = kb.nextDouble();
    System.out.println("nhap diem hoa: ");
    hoa = kb.nextDouble();
    System.out.println("nhap diem sinh: ");
    sinh = kb.nextDouble();
    System.out.println("nhap diem maytinh: ");
    maytinh = kb.nextDouble();
     
    double tong = toan+ly+hoa+sinh+maytinh ;
    if((tong/50)*100>90){
        System.out.println("hang A");
    }
    else if((tong/50)*100>80){
        System.out.println("hang B");
    }
    else if((tong/50)*100>70){
        System.out.println("hang C");
    }
    else if((tong/50)*100>60){
        System.out.println("hang D");
    }
    else if((tong/50)*100>40){
        System.out.println("hang E");
     }
    else {
        System.out.println("hang F");
     }
    }  
}
