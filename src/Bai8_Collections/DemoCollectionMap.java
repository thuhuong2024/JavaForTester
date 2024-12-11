package Bai8_Collections;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {
     //Khai báo kiểu dữ liêu Map
    Map<String, String > map = new HashMap<>();

    //Thêm giá trị dạng key=value
    map.put("name", "Anh Tester");
    map.put("age","30");

    // Truy xuất giá trị thông qua Key
        System.out.println(map.get("name"));

        // Truy xuất hết giá trị
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }
    }
