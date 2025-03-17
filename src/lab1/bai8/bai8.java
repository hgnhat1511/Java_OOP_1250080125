package lab1.bai8;
import java.util.Scanner;

public class bai8 {
    public static int sodau(int n) 
    { 
        while (n >= 10)  
            n /= 10; 
        return n; 
    }
    public static int socuoi(int n) 
    { 
        return (n % 10);  
    } 
    public static void main(String[] args){
    int n;

    Scanner kb = new Scanner(System.in);
  
    System.out.println("nhap chu so ban dau:");
    n = kb.nextInt();
    System.out.println("chu so dau va cuoi la: " +sodau(n) + " va " +socuoi(n));  
    }
}