package lythuyet.buoi8.lopnguoi;

public class Customer extends Person {
    private int balance;

    public Customer(String name, String address, int balance){
        super(name,address);
        this.balance=balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name=name;
    }
    @Override
    public String getAddress() {
        return address;
    }
    @Override
    public void setAddress(String address) {
        this.address=address;
    }
    @Override
    public void display(){
        System.out.println("Ten: "+getName());
        System.out.println("Address: "+getAddress());
        System.out.println("Balance: "+ balance);
    }
}