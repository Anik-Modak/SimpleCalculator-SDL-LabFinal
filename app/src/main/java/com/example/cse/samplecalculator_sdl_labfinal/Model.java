package com.example.cse.samplecalculator_sdl_labfinal;

public class Model {
    private static String var1 = "";
    private static String var2 = "";

    public static void SetLastNumber(String _var2)
    {
        var2 = var2 + _var2;
    }

    public static String GetLastNumber()
    {
        return var2;
    }

    public static void SetCurrentNumber(String _var1)
    {
        var1 = var1 + _var1;
    }

    public static String GetCurrentNumber()
    {
        return var1;
    }

    public static String Add()
    {
        double a = Double.parseDouble(var2);
        double b = Double.parseDouble(var1);

        double res = a+b;

        String result = String.format("%.1f",res);

        return result;
    }

    public static String Subtract()
    {
        double a = Double.parseDouble(var2);
        double b = Double.parseDouble(var1);

        double res = a-b;

        String result = String.format("%.1f",res);

        return result;
    }

    public static String Multiply()
    {
        double a = Double.parseDouble(var2);
        double b = Double.parseDouble(var1);

        double res = a*b;

        String result = String.format("%.1f",res);

        return result;
    }

    public static String Division()
    {
        double a = Double.parseDouble(var2);
        double b = Double.parseDouble(var1);

        if(b == 0.0) return "MATH ERROR";

        double res = a/b;

        String result = String.format("%.1f",res);

        return result;
    }

    public static String Power()
    {
        double a = Double.parseDouble(var2);
        double b = Double.parseDouble(var1);

        double res = Math.pow(a,b);

        String result = String.format("%.1f",res);

        return result;
    }

    public static String Mod()
    {
        double a = Double.parseDouble(var2);
        double b = Double.parseDouble(var1);

        double res = a%b;

        String result = String.format("%.1f",res);

        return result;
    }

    public static String Sqrt()
    {
        double b = Double.parseDouble(var1);

        if(b < 0) return "MATH ERROR";

        double res = Math.sqrt(b);

        String result = String.format("%.1f",res);

        return result;
    }

    public static void Clear()
    {
        var2 = "";
        var1 = "";
    }

    public static void DeleteLastNumber()
    {
        StringBuilder build = new StringBuilder(var2);
        build.deleteCharAt(var2.length()-1);
        var2 = "";
        var2 += build;
    }

    public static void DeleteCurrentNumber()
    {
        StringBuilder build = new StringBuilder(var1);
        build.deleteCharAt(var1.length()-1);
        var1 = "";
        var1 += build;
    }
}
