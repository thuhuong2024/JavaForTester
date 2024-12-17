package Bai11_Lop_DoiTuong;

public class DemoDoiTuong {
    int id = 1331;
    String name = "Tran Huong";
    void displayInfor(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        //Khởi tạo đối tương
        DemoDoiTuong demo1 = new DemoDoiTuong();

        //Truy xuất thành phần của lớp thông qua đối tượng
        demo1.displayInfor();

        //Khai báo kiểu Annonymous
        new DemoDoiTuong().displayInfor();

    }


}
