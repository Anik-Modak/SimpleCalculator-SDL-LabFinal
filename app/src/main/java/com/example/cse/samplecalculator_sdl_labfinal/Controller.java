package com.example.cse.samplecalculator_sdl_labfinal;

public class Controller {
    private static String operator = "";

    public static String setOperation(String view)
    {
        if(isOperator(view) == true)
        {
            operator = view;
            return Model.GetLastNumber()+operator+Model.GetCurrentNumber();
        }

        else if(view == "clear")
        {
            operator = "";
            Model.Clear();
            return "";
        }

        else if(view == "delete")
        {
            if(operator == "") Model.DeleteLastNumber();
            else
            {
                if(Model.GetCurrentNumber() == "") operator = "";
                else Model.DeleteCurrentNumber();
            }

            return Model.GetLastNumber()+operator+Model.GetCurrentNumber();
        }

        else if(view == "=")
        {
            if(operator == "+") return Model.Add();
            if(operator == "-") return Model.Subtract();
            if(operator == "*") return Model.Multiply();
            if(operator == "/") return Model.Division();
            if(operator == "^") return Model.Power();
            if(operator == "%") return Model.Mod();
            if(operator == "Sqrt of ") return Model.Sqrt();
            else return "MATH ERROR";
        }

        else
        {
            if(Model.GetLastNumber().length() >= 10 && operator == "")
            {
                return Model.GetLastNumber()+operator+Model.GetCurrentNumber();

            }
            else if(Model.GetCurrentNumber().length() >= 10 && operator != "")
            {
                return Model.GetLastNumber()+operator+Model.GetCurrentNumber();

            }
            else if(operator == "") Model.SetLastNumber(view);
            else Model.SetCurrentNumber(view);
            return Model.GetLastNumber()+operator+Model.GetCurrentNumber();
        }
    }

    private static boolean isOperator(String op)
    {
        if(op == "+" || op == "-" || op == "*" || op == "/" || op == "^" || op == "%" || op == "Sqrt of ") return true;
        return false;
    }
}
