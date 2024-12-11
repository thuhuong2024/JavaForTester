package Bai10_ThuocTinhPhuongThuc;

public class DemoHamCoThamSo {

    public static int cong2SoNguyen(int number1, int number2){
        return number1 + number2;
    }

    public static void showInfomation(String name, int age, String address){
        System.out.println("Họ và tên: "+ name);
        System.out.println("Tuổi: "+ age);
        System.out.println("Địa chỉ: "+ address);
    }

    public static float tinhDienTich(float chieuDai, float chieuRong) {
        return chieuDai* chieuRong;
    }

    public static void main(String[] args) {
        System.out.println(cong2SoNguyen(5,10));

       showInfomation("Hân", 20,"Hà Nam");
       showInfomation("Hương",26,"Hà Nội");

        System.out.println(tinhDienTich(10,20));

    }
}
