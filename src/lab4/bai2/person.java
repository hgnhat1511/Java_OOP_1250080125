package lab4.bai2;

public class person{
    private String name;
    private String address;

    public person(String name,String address){
        this.name=name;
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
        public String toString() {
            return "name= " + name + ", address= " + address + " ";
        }
}
