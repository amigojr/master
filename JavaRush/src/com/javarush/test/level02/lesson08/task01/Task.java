package com.javarush.test.level02.lesson08.task01;

import java.lang.System;

/* Минимум двух чисел
Написать функцию, которая возвращает минимум из двух чисел.
Подсказка:
Нужно написать тело существующей функции min и исправить возвращаемое значение.
*/
public class Task
{
    public static int min(int a, int b)
    {
        int m = min (a, b);

        int m2;
        if(a<b)
            m2=a;
        else
            m2=b;

        return m2; //напишите тут ваш код
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(12,33) );
        System.out.println( min(-20,0) );
        System.out.println( min(-10,-20) );
    }

}