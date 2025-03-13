package lythuyet.buoi8.lopnguoi;
class Employee extends Person {
    private int salary;

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    public void setSalary(int salary) {
        this.salary=salary;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getAddress() {
        return address;
    }
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public void display(){
            System.out.println("Ten: "+getName());
            System.out.println("Address: "+getAddress());
            System.out.println("Salary : " +salary);
    }
}