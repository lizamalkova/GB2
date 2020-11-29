package ru.gb.homework;

public class HomeWork1 {

    public static void main(String[] args){

        /*----------------------------------*/

        byte myByte = 120;
        short mySort = 13542;
        int myInt = 1540;
        long myLong = 130020L;
        float myFloat = 5.63f;
        double myDouble = 45.653;
        char myChar ='*';
        boolean myBoolean = false;

        /*----------------------------------*/

        int a=4, b=3, c=8, d=2;
        int z=a*(b+(c/d));

        System.out.println("Ответ: " + z);

        /*----------------------------------*/

        System.out.println(betweenTenAndTwenty(5,6));

        /*----------------------------------*/

        numberPositiveOrNegative(-5);

        /*----------------------------------*/

        System.out.println(numberNegative(-2));

        /*----------------------------------*/

        hiName("Андрей");

        /*----------------------------------*/

        leapYear(2020);

        /*----------------------------------*/
    }

    static boolean betweenTenAndTwenty(int i, int j)
    {
        int sum=i+j;

        if (sum >= 10 && sum <= 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static void numberPositiveOrNegative(int i)
    {
        if (i >= 0)
        {
            System.out.println("Число " + i + " положительное");
        }
        else
        {
            System.out.println("Число " + i + " отрицательное");
        }
    }

    static boolean numberNegative(int i)
    {
        if (i < 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static void hiName(String name)
    {
        System.out.println("Привет " + name + "!");
    }

    static void leapYear(int year)
    {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            System.out.println("Год " + year + " високосный");
        }
        else
        {
            System.out.println("Год " + year + " невисокосный");
        }
    }
}
