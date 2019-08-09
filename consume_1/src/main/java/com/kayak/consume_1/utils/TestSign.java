package com.kayak.consume_1.utils;

import java.util.Base64;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by JayJ on 2019/8/6.
 **/
public class TestSign {
    public static void main(String[] args){
        String str = "admin";
        String encoder = new String(Base64.getEncoder().encode(str.getBytes()));
        System.out.println(encoder);
        String decoder = new String(Base64.getDecoder().decode(encoder.getBytes()));
        System.out.println(decoder);
        HashMap<Object, Object> hashMap = new HashMap<>();
        Random random = new Random();
        int num = random.nextInt(2)%2;
        int i = 0;
        String va = "";
        while (i<8){


            int temp = 65;

            va += (char) (random.nextInt(26)+temp);
            System.out.println(va);
            //String value = (char)(random.nextInt(26)+65);
            System.out.println();
            i++;
        }

    }
}
