package Bai14_TinhKeThuaVaDongGoi.TinhDongGoi;

public class Student {
    //Triển khai tính đóng gói trong java
    private String name;
    private int age;
    private String birthday;
    private String address;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;

    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
