package Bai14_TinhKeThuaVaDongGoi.TinhKeThua;

public class GiaoVien extends Person {
    private float luong;

    //Phải có hàm xây dựng đủ tham số của cha
    public GiaoVien(String name, int age, float height, float luong) {
        super(name, age, height);//dùng hàm super để đảm bảo truyền data từ cha sang con
        this.luong = luong;
    }

    public void getInfo(){
        super.getInfo();//hàm getInfo của cha vì gọi qua từ khoá super
    }
    public float getLuong(){
        return luong;
    }

    public static void main(String[] args) {
        GiaoVien gv = new GiaoVien("Tuyết", 30, 160, 5000000);
        gv.getInfo();//hàm getInfo của con
        System.out.println(gv.getLuong());

    }


}
