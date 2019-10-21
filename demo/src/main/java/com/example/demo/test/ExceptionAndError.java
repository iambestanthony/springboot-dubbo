package com.example.demo.test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by JayJ on 2019/9/16.
 **/
public class ExceptionAndError {
    /**
     * 局部变量不能被public 、private static等访问控制修饰符所修饰，但是成员变量可以。
     * 从变量的内存中的存储方式来看：如果成员变量是使用static修饰的，name这个成员变量是属于类的，如果没有使用static修饰，这个成员变量是属于实例的。二对象存在于堆内存，局部变量则存在于栈内存
     *
     * @param args
     */
    public static void main(String[] args) {
        //int x = f1(0);
        //System.out.println(x);
//        f3();
        f6();
    }

    private static int f1(int i) {
        Integer integer = Integer.valueOf(10);//装箱
        int i1 = integer.intValue();//拆箱
        int num = 1111;
        try {

            System.exit(1);
            num = 10 / 0;
        } catch (Exception e) {
            num = 10/0;
            System.out.println("error:" + e);
        } finally {
            return num;
        }

    }
    private static void f2() {

//        boolean helloTom = Objects.equals(null, "helloTom");
//        System.out.println(helloTom);
        Integer int1 = 3;
        Integer int2 = 3;
        System.out.println(int1 == int2);
    }

    private static void f3() {
        String[] a = new String[]{"java","c++","php"};
        List<String> l1 = Arrays.asList(a);
        System.out.println(l1);
        a[1] = "python";
        System.out.println(l1);
        List<String> collect = Arrays.stream(a).collect(Collectors.toList());
        System.out.println(collect);
    }

    private static void f4(){
        //不可变集合 通过guava获取
//        List<String> list = ImmutableList.of("java", "php");
//        String[] arr = new String[]{"java","c++","php","python"};
//        List<String> list = ImmutableList.copyOf(arr);
//        System.out.println(list+" list的长度："+list.size());
//        list.add(4, "lua");
//        System.out.println(list);
        //可变集合
        String[] arr = new String[]{"python", "c++"};
        ArrayList<String> list = Lists.newArrayList(arr);
        list.add("java");
        list.add("php");
        System.out.println(list);

    }

    private static void f5() {
        //将数组中的元素倒置，①数组转化为集合②通过集合reverse方法倒叙排列
        String[] arr = new String[]{"java", "php", "python"};
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        String[] strings = list.toArray(new String[0]);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }

    private static void f6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa1");
        list.add("aaa2");
        list.add("aaa3");
        list.add("bbb1");
        list.add("bbb2");
        list.add("bbb3");
        list.add("aaa1");
        Stream<String> stringStream = list.stream().map(String::toUpperCase);
        stringStream.forEach(System.out::println);
    }

}
