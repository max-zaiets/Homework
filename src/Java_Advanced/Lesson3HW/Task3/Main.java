package Java_Advanced.Lesson3HW.Task3;

public class Main {
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2, s.length()-1);

       String[] arr1 = s1.split("\\.\\s");
       String[] arr2 = s2.split("\\.\\s");

       for(String a : arr1){
           System.out.println(a);
       }

        for(String a : arr2){
            System.out.println(a);
        }

    }
}
