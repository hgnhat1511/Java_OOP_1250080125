package lab1.bai6;
import java.util.Scanner;
public class bai6 {
      public static void main(String[] args) {
    double x,y,z ;
        Scanner kb = new Scanner(System.in); 
    System.out.println("nhap x: ");
    x = kb.nextDouble();
    System.out.println("nhap y: ");
    y = kb.nextDouble();
    System.out.println("nhap z: ");
    z = kb.nextDouble();
    if (x == y && y == z ) 
            System.out.println("la tam giac deu"); 
        else if (x == y || y == z || z == x ) 
            System.out.println("la tam giac can "); 
        else if (x != y || y!= z || z != x)
            System.out.println("la tam giac thuong");
        {
            if (x + y < z || x + z < y || y + z < x) 
                System.out.println("k phai tam giac");
        }
    }
}