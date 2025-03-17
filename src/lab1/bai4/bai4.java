package lab1.bai4;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int year ;
        Scanner kb = new Scanner(System.in); 
    System.out.println("nhap nam: ");
    year = kb.nextInt();
        boolean kt = false;

        if (year % 4 == 0) {
          if (year % 100 == 0) {
            if (year % 400 == 0){
              kt = true;}
            else
              kt = false;
          }    
          else
            kt = true;
        }      
        else
          kt = false;    
        if (kt)
          System.out.println(year + " la nam nhuan");
        else
          System.out.println(year + " khong phai nam nhuan");
      }
    }