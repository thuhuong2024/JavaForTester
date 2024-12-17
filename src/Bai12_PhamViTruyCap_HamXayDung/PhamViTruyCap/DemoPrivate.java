package Bai12_PhamViTruyCap_HamXayDung.PhamViTruyCap;

public class DemoPrivate {
    private String name ="Anh Tester";
     private void showInfo(){
        System.out.println("Xin chào");
    }

    public static void main(String[] args) {
        DemoPrivate demo = new DemoPrivate();
        demo.showInfo();// private trong 1 lớp thì dùng thoải mái
    }
}
