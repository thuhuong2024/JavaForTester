public class Student {
    static int a = 20;// biến toàn cục
    public void sayHello() {
        int b = 10;                 // Đây là biến local
        System.out.println("Gia tri cua n la: " + b);
    }

    public static void main(String[] args)
    {
        String name = "Anh Tester";
        int c = 15;// khai báo biến chưa có giá trị
        System.out.println(name);
        System.out.println(a);

    }

}
