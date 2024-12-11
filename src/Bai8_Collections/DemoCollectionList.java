package Bai8_Collections;

import java.util.ArrayList;
import java.util.List;

public class DemoCollectionList {
    public static void main(String[] args) {

    List<Integer> listNumber = new ArrayList();
    listNumber.add(12);
    listNumber.add(5);
    listNumber.add(30);

    System.out.println("==Truy xuất đồng loạt hết tất cả giá trị==");
    for( int value: listNumber){
        System.out.println(value);
    }
        System.out.println("==Truy xuất thông vị trí cụ thể==");
        System.out.println(listNumber.get(2));
    }
    }
