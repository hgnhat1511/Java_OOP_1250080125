package lythuyet.buoi7.bainguoi;
public class Person {
    private String name;
    private String address;

    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display(){
        System.out.println("Ten: "+getName());
        System.out.println("Address: "+getAddress());
    }

}
