package Bai13_TrangThaiStatic;

public class DemoHamStatic {
    public String name;
    public int age;
    public static String className ="Đại học Bách Khoa Hà Nội";

    public static void getInfo(){
        System.out.println(className);//Biến static có thể gọi trực tiếp ở hàm static

        DemoHamStatic demo = new DemoHamStatic();
        System.out.println(demo.name);//Biến thông thường, muốn gọi vào hàm static phải thông qua đối tượng


    }
}
