package Bai10_ThuocTinhPhuongThuc;

import java.util.ArrayList;

public class DemoPhuongThuc {
    //Khai báo hàm KO trả về giá trị
    public void displayInfo(){
        System.out.println("Hello Student");
        System.out.println("Địa chỉ của tôi ở: " + getAddress());

    }

    //Khai báo hàm CÓ trả về giá trị loại string
    public String getAddress(){
        return "HCM";
    }
     public static String getName(){
        return "Linh";
    }

    //Vi dụ gọi hàm thông qua 1 hàm khác
    public  static float chieuDai(){
        return 13.5F;
    }
    public static int chieuRong(){
        return 10;
    }
    public static float tinhDienTich() {
        return chieuDai() * chieuRong();
    }

    //Ví dụ hàm có tham số
    public ArrayList<Integer> timSoChan(int number){
        ArrayList<Integer> arrayList = new ArrayList();
        for(int i = 0; i<= number; i++){
            if(i%2==0){
                arrayList.add(i);
            }
        }
        return arrayList;// trả về 1 arrayList đã chứa số chẵn
    }

    //Hàm main
    public static void main(String[] args) {
        //Cách 1: nếu hàm ko có từ khoá static thì nó phải thông qua đối tượng lớp để gọi
        DemoPhuongThuc demo = new DemoPhuongThuc();
        demo.displayInfo();

        //Cách 2: hàm có chưa từ khoá static dùng với hàm main thì gọi được trực tiếp luôn
        getName();

        System.out.println(tinhDienTich());

        //In ra giá trị số chẵn từ ArrayList trong hàm timSoChan
        demo.timSoChan(50);
        for(int soChan:  demo.timSoChan(100))
            System.out.println(soChan);



    }
}
