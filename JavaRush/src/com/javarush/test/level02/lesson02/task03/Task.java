package com.javarush.test.level02.lesson02.task03;

/* Man и woman
В методе main создай объект Man, занеси его ссылку в переменную man.
Создай также объект Woman и занеси его ссылку в переменную woman.
В man.wife занеси ссылку на новосозданный объект Woman.
В woman.husband занеси ссылку на новосозданный объект Man.
*/
public class Task
{
    public static void main(String[] args)
    {
            //напишите тут ваш код
    }

    public static class Man
    {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman
    {
        public int age;
        public int height;
        public Man husband;
    }
}
