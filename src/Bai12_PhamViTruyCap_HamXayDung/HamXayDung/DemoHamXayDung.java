package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class DemoHamXayDung {
    public String name;
    public int age;

    //Khai báo hàm xây dựng, tên hàm trùng với tên lớp
    public DemoHamXayDung(){
        System.out.println("Tôi nằm trong hàm xây dựng");
        name = "Java for Tester";//Khởi tạo giá trị
        age = 20;
    }

    public void showInfo(){
        System.out.println(name);
        System.out.println(age);

    }

    public static void main(String[] args) {
        DemoHamXayDung demo = new DemoHamXayDung();
        demo.showInfo();
    }
}
