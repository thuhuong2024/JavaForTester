public class Bai4_ToanTu {
    public static void main(String[] args)
    {
        int a = 2;
        int b = 3;
        int c = 4;
//      System.out.println(a+b); // a = 30
//      System.out.println(a % 2); // = 0
//      System.out.println(a += b);// a = a + b= 30

//       System.out.println(a*b/c);//tinh toan tu trai qua phai
//       System.out.println(a/b*c);

        // Ép kiểu dữ liêu
        float d = 35.8f;
        int e = (int)d+ 1;
        System.out.println(e);

        String numberString = String.valueOf(e);
        System.out.println(numberString + 40);// chuyển kiểu số về dạng chuỗi
        System.out.println(Integer.parseInt(numberString) + 40);// chuyển kiểu chuỗi về dạng số






    }
}
