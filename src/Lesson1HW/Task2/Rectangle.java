package Lesson1HW.Task2;

import java.util.Scanner;

public class Rectangle {
    private double side1;
    private double side2;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }



    public double areaCalculator(double side1, double side2){
        return side1*side2;
    }

    public double perimeterCalculator(double side1, double side2){
        return side1*2+side2*2;
    }

    public static void main(String[] args) {
        System.out.println("Enter side1 and side2: ");
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();
            rec.setSide1(sc.nextDouble());
            rec.setSide2(sc.nextDouble());

        System.out.println("Area = " + rec.areaCalculator(rec.getSide1(), rec.getSide2()));
        System.out.println("Perimeter = " + rec.perimeterCalculator(rec.getSide1(), rec.getSide2()));



    }
}


