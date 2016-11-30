package com.javarush.test;

import java.lang.reflect.Method;

/**
 * Created by vb on 8/1/16.
 */
public class mainCl {

    void testMethod(int i, String s) {
        System.out.println(i + s);
    }

    static void reflMethod(String methodName,  args[]) throws Exception {
        Method m = this.getClass().getMethod(methodName);
        m.invoke(args);
    }

    public static void main(String[] args) {

        int I = 1;
        reflMethod("testMethod", 1, "aa");
    }
}
