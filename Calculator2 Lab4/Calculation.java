package com.example.calculator_class;

public class Calculation {

    public static double addition(double a,double b)
    {
        return  a+b;
    }

    public static double subtraction(double a,double b)
    {
        return  a-b;
    }

    public static double multiplication(double a,double b)
    {
        return  a*b;
    }

    public static double division(double a,double b)
    {
        if(b==0)return 0;
        else
        return  a/b;
    }
}
