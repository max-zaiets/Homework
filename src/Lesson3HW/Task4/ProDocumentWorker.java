package Lesson3HW.Task4;

public class ProDocumentWorker extends DocumentWorker {

    public static final String proKey = "daw1d15@q"; /* плохая идея использовать модификатор public для пароля, н
                                                     о так как это лишь пример, для удобства в Main решил оставить так. Как минимум, стоило бы захешировать*/

    public void editDocument(){
        System.out.println("Документ відредаговано");
    }
    public void saveDocument(){
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт");
    }
}
