package Lesson5HW.Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friendsNames = new ArrayList<>();
        friendsNames.add("Lukash");
        friendsNames.add("Petro");
        friendsNames.add("Stepan");
        friendsNames.add("Olya");
        friendsNames.add("Albina");
        friendsNames.add("Susan");

        Iterator<String> it = friendsNames.iterator();

        for(String s:
                    friendsNames){
            System.out.println(s);
        }

        System.out.println("-----------------------------------");


        Collections.sort(friendsNames);

        for(String s:
                friendsNames){
            System.out.println(s);
        }
    }
}
