package lab1.bai10;
import java.util.Scanner;

public class bai10 {
    public static int count(int n) 
    { 
        int count=0;
        while (n != 0){ 
            n /= 10;
            count++; 
        }
        return count; 
    }
    public static void main(String[] args){
    int n;

    Scanner kb = new Scanner(System.in);
  
    System.out.println("nhap chu so ban dau:");
    n = kb.nextInt();
    System.out.println("so chu so la: " + count(n) + " so");  
    }
}
