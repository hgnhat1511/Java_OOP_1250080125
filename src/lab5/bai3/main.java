package lab5.bai3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thong tin hinh tron:");
        System.out.print("Nhap ban kinh: ");
        double radius = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap mau sac: ");
        String color = scanner.nextLine();
        System.out.print("Co duoc to mau khong (true/false): ");
        boolean filled = scanner.nextBoolean();
        circle circle = new circle(radius, color, filled);

        System.out.println("Nhap thong tin hinh chu nhat:");
        System.out.print("Nhap chieu rong: ");
        double width = scanner.nextDouble();
        System.out.print("Nhap chieu dai: ");
        double length = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap mau sac: ");
        color = scanner.nextLine();
        System.out.print("Co duoc to mau khong (true/false): ");
        filled = scanner.nextBoolean();
        rectangle rectangle = new rectangle(width, length, color, filled);

        System.out.println("Nhap thong tin hinh vuong:");
        System.out.print("Nhap canh: ");
        double side = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap mau sac: ");
        color = scanner.nextLine();
        System.out.print("Co duoc to mau khong (true/false): ");
        filled = scanner.nextBoolean();
        square square = new square(side, color, filled);

        System.out.println("\nThong tin hinh tron:");
        System.out.println(circle);

        System.out.println("\nThong tin hinh chu nhat:");
        System.out.println(rectangle);

        System.out.println("\nThong tin hinh vuong:");
        System.out.println(square);

        System.out.println("\nKiem tra equals:");
        System.out.println("Circle va Rectangle co bang nhau khong? " + circle.equals(rectangle));
        System.out.println("Rectangle va Square co bang nhau khong? " + rectangle.equals(square));
    }
}