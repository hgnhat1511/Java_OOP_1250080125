package lab1.bai5;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
    double a,b,c ;
        Scanner kb = new Scanner(System.in); 
    System.out.println("nhap a: ");
    a = kb.nextDouble();
    System.out.println("nhap b: ");
    b = kb.nextDouble();
    System.out.println("nhap c: ");
    c = kb.nextDouble();
    
    double temp = a;
    if (temp>b){
    temp=b;
    if (temp>c)
    temp=c;
    }
    System.out.println("so be nhat la : " + temp); 
    }
}