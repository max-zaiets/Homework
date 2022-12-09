package Lesson7HW.Task2;

import java.text.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<workers.length; i++){  // Entering all data for each worker object
            Worker worker = new Worker();
            workers[i] = worker;

            System.out.println("Enter worker " + (i+1) + " surname:");
            worker.setSurname(sc.nextLine());


            System.out.println("Enter worker " + (i+1) + " initials:");
            workers[i].setInitials(sc.nextLine());

            System.out.println("Enter worker " + (i+1) + " occupation:");
            workers[i].setOccupation(sc.nextLine());

            System.out.println("Enter worker " + (i+1) + " employment start date:");
            String dateInput = sc.nextLine();

            try {
                Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateInput);
                workers[i].setEmpYear(date);
            } catch (ParseException e) {
                System.out.println("Cannot set employment start date due to wrong date format");
            }
        }

        Arrays.sort(workers); //Sort array
        showExpWorkers(workers);

    }





//
//    Method to print workers name if experience (Worker class constant) is greater than 10
//
    public static void showExpWorkers(Worker[] workers){
        try {
        for(Worker w: workers) {


            Date empDate = w.getEmpYear(); // employment start date from class object

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy"); // getting todays date and formatting to match the Worker class Date formatting
            String date = simpleDateFormat.format(w.getEmpYear());
            Date todaysDate = new SimpleDateFormat("dd-MM-yyyy").parse(date);


            long time_difference = todaysDate.getTime() - empDate.getTime();
            long years_difference = (time_difference / (1000L *60*60*24*365));

            System.out.println(years_difference);

            if (years_difference > Worker.maxExperience) {
                    System.out.println("Experience greater than 10 years for : " + w.getInitials());
            }
        }
        }catch (NullPointerException | ParseException e){
            System.out.println("Invalid date format passed to dateToInstant method, use dd-MM-yyyy format");
        }
    }
}
