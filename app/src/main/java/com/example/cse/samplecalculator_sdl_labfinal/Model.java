package com.example.cse.samplecalculator_sdl_labfinal;

public class Model {

    public static String Add(String var2, String var1)
    {
        double a = Double.parseDouble(var2);
        double b = Double.parseDouble(var1);

        double res = a+b;

        String result = String.format("%.3f",res);

        return result;
    }

    public static String Subtract(String var2, String var1 )
    {
        double a = Double.parseDouble(var2);
        double b = Double.parseDouble(var1);

        double res = a-b;

        String result = String.format("%.3f",res);

        return result;
    }

    public static String Multiply(String var2, String var1)
    {
        double a = Double.parseDouble(var2);
        double b = Double.parseDouble(var1);

        double res = a*b;

        String result = String.format("%.3f",res);

        return result;
    }

    public static String Division(String var2, String var1)
    {
        double a = Double.parseDouble(var2);
        double b = Double.parseDouble(var1);

        if(b == 0.0) return "Nan";

        double res = a/b;

        String result = String.format("%.3f",res);

        return result;
    }

    public static String Power(String var2, String var1)
    {
        double a = Double.parseDouble(var2);
        double b = Double.parseDouble(var1);

        double res = Math.pow(a,b);

        String result = String.format("%.3f",res);

        return result;
    }

    public static String Mod(String var2, String var1)
    {
        double a = Double.parseDouble(var2);
        double b = Double.parseDouble(var1);

        double res = a%b;

        String result = String.format("%.3f",res);

        return result;
    }

    public static String Sqrt(String var1)
    {
        double b = Double.parseDouble(var1);

        if(b < 0) return "MATH ERROR";

        double res = Math.sqrt(b);

        String result = String.format("%.3f",res);

        return result;
    }
}