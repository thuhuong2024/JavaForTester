package Bai12_PhamViTruyCap_HamXayDung.PhamViTruyCap;

import Bai12_PhamViTruyCap_HamXayDung.HamXayDung.Student;
//từ khoá extends đại diện cho sự kế thừa class
public class DemoProtected extends Student {
    protected String address ="HN";
    protected String getAddress(){
        return address;
    }

    public static void main(String[] args) {
        DemoProtected demoProtected = new DemoProtected();
        demoProtected.getPhone();//gọi được protected khác package vì đã kế thừa
    }

}
