package Bai5_BieuThucDieuKien;

public class SwitchCase {
    public static void main(String[] args) {
        String platform = "window";
        switch (platform) {
            case "window":
                System.out.println("Chạy trên win");
                break;
            case "macos":
                System.out.println("Chạy trên mac");
                break;
            case "linux":
                System.out.println("Chạy trên linux");
                break;
            default:
                System.out.println("Lỗi");

        }
    }
}
