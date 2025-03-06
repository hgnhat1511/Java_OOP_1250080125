package Lab2.buoi7.bainguoi;
public class Employee extends Person {
    private int salary;

    public Employee(String name, String address, int salary){
        super(name,address);
        this.salary=salary;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public void display(){
        System.out.println("Ten: "+getName());
        System.out.println("Address: "+getAddress());
        System.out.println("Salary: "+getSalary());
    }

}
