package com.example.hashtest.demo;

import java.util.HashMap;
import java.util.Hashtable;

public class HashDemo {
    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("one", "欧阳娜娜");
        hashMap.put("two", "迪丽热巴");

        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("1", "杨幂");
        hashtable.put("2", "佟丽娅");

        System.out.println(hashMap.toString());
        System.out.println(hashtable.toString());
    }
}
