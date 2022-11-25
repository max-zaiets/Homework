package Lesson3HW.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введіть ключ до своєї версії: ");

        Scanner sc = new Scanner(System.in);
        String userKey = sc.nextLine();

        while (userKey.length() == 0) {   //input validation
            System.out.println("Ви не ввели ключ: ");
            userKey = sc.nextLine();
        }
            if (userKey.equals(ProDocumentWorker.proKey)) {
                System.out.println("Введено ключ до версії Pro");
                ProDocumentWorker pro = new ProDocumentWorker();

            } else if (userKey.equals(ExpertDocumentWorker.expKey)) {
                System.out.println("Введено ключ до версії Expert");
                ExpertDocumentWorker exp = new ExpertDocumentWorker();

            } else {
                System.out.println("Введений ключ невалідний, бажаєте скористатися з базової версіі?");
                DocumentWorker doc = new DocumentWorker();
            }
    }
}
