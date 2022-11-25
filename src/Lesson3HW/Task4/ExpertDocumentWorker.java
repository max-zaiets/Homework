package Lesson3HW.Task4;

public class ExpertDocumentWorker extends ProDocumentWorker{

    public static final String expKey = "dsgr821!32"; /* плохая идея использовать модификатор public для пароля, н
                                                     о так как это лишь пример, для удобства в Main решил оставить так. Как минимум, стоило бы захешировать*/

    public void saveDocument(){
        System.out.println("Документ збережений в новому форматі");
    }

}
