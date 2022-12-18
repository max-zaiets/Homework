package Java_Essential.Lesson3HW.Task2;

public class Main {
    public static void main(String[] args) {
        Pupil pupil1 = new BadPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new ExcellentPupil();

        ClassRoom classRoom = new ClassRoom(pupil1,pupil2,pupil3);

        classRoom.getPupil1().read();
        classRoom.getPupil1().write();
        classRoom.getPupil1().study();
        classRoom.getPupil1().relax();

        System.out.println("--------------------");

        classRoom.getPupil2().read();
        classRoom.getPupil2().write();
        classRoom.getPupil2().study();
        classRoom.getPupil2().relax();

        System.out.println("--------------------");

        classRoom.getPupil3().read();
        classRoom.getPupil3().write();
        classRoom.getPupil3().study();
        classRoom.getPupil3().relax();

        System.out.println("--------------------");

        classRoom.getPupil4().read();
        classRoom.getPupil4().write();
        classRoom.getPupil4().study();
        classRoom.getPupil4().relax();
    }
}
