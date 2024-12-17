package Bai14_TinhKeThuaVaDongGoi.TinhDongGoi;

public class ThongTin {
    public static void main(String[] args) {

        //Gán giá trị thông qua hàm set
        Student student1 = new Student();
        student1.setName("Đạt");
        student1.setAge(25);
        student1.setAddress("HCM");
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getAddress());


    }
}


