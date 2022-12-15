package Lesson7HW.Task5;

public class Calculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){ // правильно будет сделать return type double, но тогда не нужно ловить exception(а это сказано в задании), так как деление на 0 возможно для double
        try {
            return a / b; // если на вход в каждом методе этого класса пустить double, то не будет смысла ловить ArithmeticException, и так будет правиллнее. Плюс при делении может получится double.
        }catch (ArithmeticException e){
            System.out.println("You cannot divide by 0");
            System.exit(0);
        }
        return 0;
    }
}
