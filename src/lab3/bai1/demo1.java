package lab3.bai1;
import java.util.Scanner;

class hocsinh {
    int maso;
    String hoten;
    float dtb;

    public String getHoten() {
        return hoten;
    }

    public int getMaso() {
        return maso;
    }

    public float getDtb() {
        return dtb;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public hocsinh() {
        this.maso = 0;
        this.hoten = null;
        this.dtb = 0f;
    }

    public hocsinh(int maso, String hoten, float dtb) {
        this.maso = maso;
        this.hoten = hoten;
        this.dtb = dtb;
    }

    public hocsinh(hocsinh tmp) {
        this.maso = tmp.maso;
        this.hoten = tmp.hoten;
        this.dtb = tmp.dtb;
    }

    public void nhapHS() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap ma so hoc sinh: ");
        maso = nhap.nextInt();
        nhap.nextLine();
        System.out.println("nhap ho ten hoc sinh: ");
        hoten = nhap.nextLine();
        System.out.println("nhap diem trung binh hoc sinh : ");
        dtb = nhap.nextFloat();
    }

    public void xuatHS() {
        System.out.println("ma so" + maso + "ho ten " + hoten + "diem trung binh" + dtb);
    }

    public void xeploai() {
    if (dtb<5){
        System.out.println("xep loai yeu");
    } else if (dtb>=5&&dtb<7) {
        System.out.println("xep loai TB");
    } else if (dtb>=7&&dtb<9) {
        System.out.println("xep loai kha");
    } else {
        System.out.println("xep loai gioi");
    }
    }
}
 public class demo1 {
     public static void main(String[] args) {
         hocsinh hs1 = new hocsinh();
         hs1.nhapHS();
         hs1.xuatHS();

         hocsinh hs2=new hocsinh(125,"hoangnhat",8.7f);
         hs2.xuatHS();

         hocsinh hs3 = new hocsinh(hs2);
         hs3.xuatHS();
         hs3.setHoten("tran minh tai");
         hs3.xuatHS();

         float max= hs1.getDtb();
         String ht= hs1.getHoten();

         if (max< hs2.getDtb()){
             max= hs2.getDtb();
             ht= hs2.getHoten();
         }
         if (max< hs3.getDtb()){
             max= hs3.getDtb();
             ht= hs3.getHoten();
         }
         System.out.println("hoc sinh " +ht +"la nguoi co so dtb cao nhat voi: " +max +" diem");
     }
 }