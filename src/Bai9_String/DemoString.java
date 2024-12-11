package Bai9_String;

public class DemoString {
    public static void main(String[] args) {
        String str1 = "Anh Tester, Testing with Postman";
        String str2 = "Automation Test";
        System.out.println("Anh Tester".toUpperCase());
        System.out.println(str1.toUpperCase());

        //Nối chuỗi bằng dấu + hoặc  concat
        System.out.println("Họ và tên: "+ str1);
        System.out.println( str1.concat(" ") + str2);

        // Cắt chuỗi
        //System.out.println(str1.substring(str1,3));

        //Độ dài chuỗi
        System.out.println(str1.length());

        //Tách chuỗi bằng hàm split
        System.out.println(str1.split(",")[0]);// lấy giá trị đầu tiền của mảng sau khi tách chuỗi

        //Loại bỏ khoảng trắng đầu cuối bằng hàm trim
        System.out.println(str1.trim());

        //So sánh chứa bằng hàm contains
        System.out.println(str1.contains("Tester"));
        System.out.println(str1.contains("Hương"));

        //So sánh bằng dùng hàm equals
        String str3 = "Automation Test";
        String str4 = "Automation Test";
        String str5 = "automation test";
        System.out.println(str3.equals(str4));

        //So sánh bằng ko phân biệt hoa thường
        System.out.println(str3.equalsIgnoreCase(str5));

        //Kiểm tra chuỗi có rỗng hay ko
        String str6 = "  ";
        System.out.println("Có tính khoảng trắng: " + str6.isEmpty());
        System.out.println("Không tính khoảng trắng: " + str6.isBlank());


    }
}
