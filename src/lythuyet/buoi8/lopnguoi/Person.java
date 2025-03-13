package lythuyet.buoi8.lopnguoi;
public abstract class Person {
    public String name;
    public String address;

    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }

    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getAddress() ;

    public abstract void setAddress(String address);

    public abstract void display();
}