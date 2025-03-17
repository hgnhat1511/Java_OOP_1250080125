package lab1.bai12;
import java.util.Scanner;

public class bai12 {
    public static int daoNguoc(int n) {
        int somoi = 0;
        while (n != 0) {
            int socuoi = n % 10; 
            somoi = somoi * 10 + socuoi; 
            n/= 10;
        }
        return somoi ;       
    }
    public static boolean kiemTraSoDoiXung(int n) {
        return n == daoNguoc(n);
    }
    public static void main(String[] args){
    int n;

    Scanner kb = new Scanner(System.in);
  
    System.out.println("nhap chu so muon kiem tra:");
    n = kb.nextInt();
    if (kiemTraSoDoiXung(n)) {
        System.out.println(n + " la so doi xung");
    } else {
        System.out.println(n + " kp so doi xung");
        }
    }
}