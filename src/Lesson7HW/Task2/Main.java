package Lesson7HW.Task2;

import java.text.*;
import java.time.*;
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
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date2;

            try {
                date2 = dateFormat.parse(dateInput);
                workers[i].setEmpYear(date2);
            } catch (ParseException | InputMismatchException  e ) {
                System.out.println("Cannot set employment start date due to wrong date or parsing given string is impossible");
            }
        }

        Arrays.sort(workers);
        showExpWorkers(workers);

    }

//    Method to print workers name if experience (Worker class constant) is greater than 10
    public static void showExpWorkers(Worker[] workers){
        try {
        for(Worker w: workers) {

            Date empDate = w.getEmpYear(); // employment start date from class object

            LocalDate x = empDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //parsing Date to LocalDate
            LocalDate today = LocalDate.now(); // gets todays date


            Period age = Period.between(x, today); //getting difference between dates
            int years = age.getYears();


            if (years > Worker.maxExperience) {
                    System.out.println("Experience greater than 10 years for : " + w.getSurname());
            }
        }
        }catch (NullPointerException e){
            System.out.println("No dates provided/wrong date formatting");
        }
    }
}
