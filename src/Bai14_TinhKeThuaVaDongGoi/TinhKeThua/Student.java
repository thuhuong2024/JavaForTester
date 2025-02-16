package Bai14_TinhKeThuaVaDongGoi.TinhKeThua;

public class Student extends Person {
    private String phone;
    private String address;

    public Student(String name, int age, float height,String phone, String address) {
        super(name, age, height);//Đảm bảo đúng cấu trúc ở class cha, còn ở trên có 2 tham số mới thì ko ảnh hưởng gì
        this.phone = phone;
        this.address = address;
    }

    public void getInfo(){
        super.getInfo();//Hàm này sẽ hiểu từ class CHA
        System.out.println("Phone: "+ phone);
        System.out.println("Address: " + address);
    }

    public String getAddress(){
        return address;
    }

    public String getPhone(){
        getInfo();//Hàm này sẽ hiểu từ class CON
        return phone;
    }

    public static void main(String[] args) {
        Student student = new Student("Linh",30, 165,"123456789","Hà Nội");
        student.getInfo();

//        System.out.println(student.getPhone());
//        System.out.println(student.getAddress());
    }
}
