package lab1.bai3;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
    double C;
    double F;

    Scanner kb = new Scanner(System.in);
  
    System.out.println("nhap nhiet do do F:");
    F = kb.nextDouble();
    C = (F - 32)/1.8;
    System.out.print("nhiet do do C la: "+ C );
    kb.close();
}
}