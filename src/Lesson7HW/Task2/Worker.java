package Lesson7HW.Task2;

import java.util.Date;

public class Worker implements Comparable{ // implementing comparable interface to use Arrays.sort() method

    public static final long maxExperience = 10; // decided to make max experience a constant as it is the same for all objects
    private String surname;
    private String initials;
    private String occupation;
    private Date empYear;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Date getEmpYear() {
        return empYear;
    }

    public void setEmpYear(Date empYear) {
        this.empYear = empYear;
    }

    public String toString() {
        return ("(" + surname + ", " + initials + ", " + occupation + ", " + empYear + ")");
    }

    @Override
    public int compareTo(Object o) {
        return toString().compareTo(o.toString());
    }
}
