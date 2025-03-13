package lythuyet.buoi8.lopnguoi;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("mai thi sang", "hcm", 500);
        Customer cus = new Customer("hoang nhat", " me hi ca", 207);

        emp.display();
        cus.display();
    }
}
