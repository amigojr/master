package com.javarush.test.level02.lesson08.task06;

public class yo {

    public static void func1(String s1) {
        String s_temp = s1 + " привет от func1";
        System.out.println(s_temp);
    }

    public static String func2(String s2) {
        String s_temp = s2 + " алоха от func2";
        System.out.println(s_temp);
        return s_temp;
    }

    public static void main(String args[]) {

        // func1("какой-то текст");

        // func2("какой-то текст");

        String new_str = "начало";
        System.out.println("new_str=" + new_str);
        new_str = func2("какой-то текст");
        System.out.println("new_str=" + new_str);

    }

}
