package lab4.bai2;

public class main {
    public static void main(String[] args) {
        person person = new person("nguyen van phap", "123 le van si");
        System.out.println(" thong tin nguoi do la: " + person);

        student student=new student(" nguyen thi no","456 cong hoa","computer science",2,5000);
        System.out.println(" thong tin cua hoc sinh do la: " + student);

        staff staff=new staff(" anh huynh dep trai"," 789 cao the "," Tech University",60000.0);
        System.out.println(" thong tin cua nguoi do la: " + staff);
    }
}
