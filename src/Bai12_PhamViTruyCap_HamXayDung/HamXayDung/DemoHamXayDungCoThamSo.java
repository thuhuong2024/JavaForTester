package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class DemoHamXayDungCoThamSo {
    public String name;
    public int age;

    //Khai báo hàm xây dựng ko có tham số, hầu như luôn có
    public DemoHamXayDungCoThamSo(){
        System.out.println("Đây là hàm xây dựng ko có tham số");
    }

    //Khai báo hàm xây dựng có tham số
    public DemoHamXayDungCoThamSo(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void showInfo(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        DemoHamXayDungCoThamSo demo1 = new DemoHamXayDungCoThamSo("Huong",27);
        demo1.showInfo();
        
        DemoHamXayDungCoThamSo demo2 = new DemoHamXayDungCoThamSo("Anh Tester",30);
        demo2.showInfo();
    }
}
