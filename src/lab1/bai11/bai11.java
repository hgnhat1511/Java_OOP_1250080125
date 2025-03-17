package lab1.bai11;
import java.util.Scanner;

public class bai11 {
    public static int daoNguoc(int n) {
        int somoi = 0;
        while (n != 0) {
            int socuoi = n % 10; 
            somoi = somoi * 10 + socuoi; 
            n/= 10;
        }
        return somoi ;
    }
    public static void main(String[] args){
    int n;

    Scanner kb = new Scanner(System.in);
  
    System.out.println("nhap chu so ban dau:");
    n = kb.nextInt();
    System.out.println("so dao nguoc la: " + daoNguoc(n) );  
    }
}

