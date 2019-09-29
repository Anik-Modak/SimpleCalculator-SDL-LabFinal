package com.example.cse.samplecalculator_sdl_labfinal;

public class Controller {
    private static String operator = "";
    private static String var1 = "";
    private static String var2 = "";

    public static String setOperation(String view)
    {
        if(isOperator(view) == true)
        {
            operator = view;
            return GetLastNumber()+operator+GetCurrentNumber();
        }

        else if(view == "clear")
        {
            operator = "";
            var1 = "";
            var2 = "";
            return "";
        }

        else if(view == "delete")
        {
            if(var1.length()>1)
                var1  = var1.substring(0,var1.length()-1);
            else
                var2  = var2.substring(0,var2.length()-1);
            return GetLastNumber() + operator + GetCurrentNumber();
        }

        else if(view == "=")
        {
            if(operator == "+") return Model.Add(var2, var1);
            if(operator == "-") return Model.Subtract(var2, var1);
            if(operator == "*") return Model.Multiply(var2, var1);
            if(operator == "/") return Model.Division(var2, var1);
            if(operator == "^") return Model.Power(var2, var1);
            if(operator == "%") return Model.Mod(var2, var1);
            if(operator == "Sqrt of ") return Model.Sqrt(var1);
            else return "MATH ERROR";
        }

        else
        {
            if(GetLastNumber().length() >= 10 && operator == "")
            {
                return GetLastNumber()+operator+GetCurrentNumber();

            }
            else if(GetCurrentNumber().length() >= 10 && operator != "")
            {
                return GetLastNumber()+operator+GetCurrentNumber();

            }
            else if(operator == "") SetLastNumber(view);
            else SetCurrentNumber(view);
            return GetLastNumber()+operator+GetCurrentNumber();
        }
    }

    private static boolean isOperator(String op)
    {
        if(op == "+" || op == "-" || op == "*" || op == "/" || op == "^" || op == "%" || op == "Sqrt of ") return true;
        return false;
    }

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
}
