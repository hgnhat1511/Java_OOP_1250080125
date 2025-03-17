package lab1.bai9;
import java.util.Scanner;

public class bai9 {
    public static int tong(int n) 
    { 
        int temp;
        int tong=0 ;
        while (n > 0) {
            temp = n % 10;
            tong += temp;
            n /= 10;
        }
        return tong;
    }
    public static int tich(int n) 
    { 
        int temp;
        int tich=1 ;
        while (n > 0) {
            temp = n % 10;
            tich *= temp;
            n /= 10;
        }
        return tich;
    }
    public static void main(String[] args){
    int n;
    Scanner kb = new Scanner(System.in);
    System.out.println("nhap chu so ban dau:");
    n = kb.nextInt();
    System.out.println("tong va tich cua so do la: " + tong(n) + " va " + tich(n));

    }
}