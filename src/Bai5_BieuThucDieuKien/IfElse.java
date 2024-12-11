package Bai5_BieuThucDieuKien;

public class IfElse {
    public static void main(String[] args){
        //Dạng 1: If
        int a = 10;
        int b = 20;
        if(a>5){
            System.out.println("Điều kiện đúng");
        }
        //Dạng 2: If Else
        String address = "Cần Thơ";
        if(address.equals("Cần Thơ")){
            System.out.println("Đây là địa chỉ Cần Thơ");

        }else{
            System.out.println("Đây ko phải là địa chỉ Cần Thơ");
        }
    }
}
