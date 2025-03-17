    package lythuyet.buoi9;

    import java.util.concurrent.LinkedTransferQueue;

    interface IEmployee {
        int caculateslary();
        String getname();
    }
    class Employee implements IEmployee{
        String name ;
        int paymentPerhour;
        public Employee(String name, int paymentPerhour){
            this.name=name;
            this.paymentPerhour=paymentPerhour;
        }
        public Employee(int paymentPerhour, int workinghours) {
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setPaymentPerhour(int paymentPerhour) {
            this.paymentPerhour = paymentPerhour;
        }
        public int getPaymentPerhour() {
            return paymentPerhour;
        }
        @Override
        public int caculateslary() {
            return 0;
        }
        @Override
        public String getname() {
            return "";
        }
    }
    class parttime_Employee extends Employee {
        int workinghours;

        public parttime_Employee(String name, int paymentPerhour, int workinghours) {
            super(name, paymentPerhour);
            this.workinghours = workinghours;
        }
            @Override
            public int caculateslary () {
                return getPaymentPerhour() * workinghours;
        }

    }
    class fulltime_Employee extends Employee{
        public  fulltime_Employee(String name,int paymentperhour){
            super(name,paymentperhour);
        }
        @Override
        public int caculateslary(){
        return getPaymentPerhour();
        }
    }
    public class bai1 {
        public static void main(String[] args) {
            parttime_Employee partTime = new parttime_Employee("nhat", 10, 1);
            fulltime_Employee fullTime = new fulltime_Employee("hoang", 20);

            System.out.println(partTime.getName() + " Salary: " + partTime.caculateslary());
            System.out.println(fullTime.getName() + " Salary: " + fullTime.caculateslary());
        }
    }