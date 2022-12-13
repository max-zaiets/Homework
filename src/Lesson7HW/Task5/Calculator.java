package Lesson7HW.Task5;

public class Calculator {
    public static double add(double a, double b){
        return a+b;
    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static double mul(double a, double b){
        return a*b;
    }
    public static double div(double a, double b){
        try {
            return a / b;
        }catch (ArithmeticException e){
            System.out.println("You cannot divide by 0");
        }
        return 0;
    }
}
