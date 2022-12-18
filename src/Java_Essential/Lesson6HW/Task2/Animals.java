package Java_Essential.Lesson6HW.Task2;

enum Animals {
    WHALE(80), TURTLE(200), MOUSE(3);
    int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return  "Animal: " + this.name() + " \n" +
                "Age: " + this.age;
    }
}
