package Lab2;

import java.util.Arrays;
import java.util.Scanner;

class ArrayOperations {
    private int[] array;
    private Scanner kb;

    public ArrayOperations(Scanner scanner) {
        this.kb = scanner;
    }
    public void inputArray() {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = kb.nextInt();
        array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = kb.nextInt();
        }
    }
    public void displayArray() {
        System.out.println("Các phần tử trong mảng:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public void findElement(int x) {
        boolean found = false;
        System.out.print("Vị trí của " + x + " trong mảng: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Không tìm thấy!");
        }
        System.out.println();
    }
    public int findMax() {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    public int findMin() {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    public void findMaxPosition() {
        int max = findMax();
        System.out.print("Vị trí của phần tử lớn nhất: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public void sortArray() {
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp:");
        displayArray();
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayOperations arrOps = new ArrayOperations(kb);

        arrOps.inputArray();//a
        arrOps.displayArray();//b

        System.out.print("Nhập số nguyên x cần tìm: ");//c
        int x = kb.nextInt();
        arrOps.findElement(x);

        System.out.println("Giá trị lớn nhất: " + arrOps.findMax());//d
        System.out.println("Giá trị nhỏ nhất: " + arrOps.findMin());//e
        arrOps.findMaxPosition();//f

        arrOps.sortArray();//g
    }
}
