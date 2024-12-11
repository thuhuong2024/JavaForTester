package Bai7_Mang;

public class Mang {
    public static void main(String[] args){
        //khai báo và khởi tạo mảng
        String sinhvienArray[] = new String[3];

        //gán giá trị
        sinhvienArray[0] = "Hoa";
        sinhvienArray[1] = "Phong";
        sinhvienArray[2] = "Lan";

        //truy xuất giá trị thủ công qua vị trí
        System.out.println(sinhvienArray[1]);

        System.out.println("------------");

        //duyệt mảng để truy xuất giá trị đồng loạt
        for(int i = 0; i< sinhvienArray.length; i++) {
            System.out.println(sinhvienArray[i]);
        }

        System.out.println("------------");

        //duyệt mảng qua vòng lặp for cải tiến
        for(String temp : sinhvienArray){
            System.out.println(temp);

        }



    }
}
