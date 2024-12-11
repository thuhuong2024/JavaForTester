package Bai8_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoCollectionSet {
    public static void main(String[] args){
        //Set - List - Map

        //Khai báo kiểu Set với loại HashSet, ko sắp xếp được
        Set<String> stringSet = new HashSet<>();
        stringSet.add("CCCD12345");
        stringSet.add("123123123");
        stringSet.add("123123123");
        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("CCCD12345"));

        for(String value:stringSet){
            System.out.println(value);
        }

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("123");
        treeSet.add("ABC");
        treeSet.add("789");

        treeSet.stream().sorted();
        for(String value:treeSet){
            System.out.println(value);
        }


    }
}
