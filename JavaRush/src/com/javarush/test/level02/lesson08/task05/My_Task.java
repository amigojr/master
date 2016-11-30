package com.javarush.test.level02.lesson08.task05;

/**
 * напишите метод (процедуру) Klichko, которая будет принимать стору и выводить ее на экран 1 раз
 */

//объявление класса с именем My_Task
class My_Task
{ //начало класса My_Task

    //объявление метода (процедуры) с именем Klichko, котороя принимает входной параметр - стороку
    static void Klichko(String s)
    { //начало метода Klichko
        System.out.print(s); //вывод на экран входного параметра s
    } //конец метода Klichko

    //входная точка в программу My_Task
    public static void main(String[] args)
    { //начало метода main
        Klichko("Бе-бе-бе"); //вызов метода Klichko, передача в него входного параметра - строки "Бе-бе-бе"
    } ///конец метода main
} //конец программы/коласса main