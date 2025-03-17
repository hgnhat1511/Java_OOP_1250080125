package lab5.bai4;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thong tin hinh tron:");
        movablecircle circle = new movablecircle();
        circle.nhap(scanner);

        System.out.println("Vi tri ban dau: " + circle.toString());

        circle.moveUp();
        System.out.println("Sau khi di chuyen len: " + circle.toString());

        circle.moveDown();
        System.out.println("Sau khi di chuyen xuong: " + circle.toString());

        circle.moveLeft();
        System.out.println("Sau khi di chuyen sang trai: " + circle.toString());

        circle.moveRight();
        System.out.println("Sau khi di chuyen sang phai: " + circle.toString());
    }
}
