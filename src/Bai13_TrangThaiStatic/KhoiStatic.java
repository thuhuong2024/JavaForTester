package Bai13_TrangThaiStatic;

public class KhoiStatic {
    public String name;
    public int age;
    public static String className ="Đại học Bách Khoa Hà Nội";

    //Khối static luôn chạy trước hàm main
    static{
        System.out.println("Đây là khối Static");
    }

    public static void main(String[] args) {
        System.out.println(className);
    }

}
