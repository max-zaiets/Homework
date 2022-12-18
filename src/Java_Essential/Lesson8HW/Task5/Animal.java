package Java_Essential.Lesson8HW.Task5;

public class Animal {
    private String name;
    private int age;
    private boolean hasTail;

    public Animal(String name, int age, boolean hasTail) {
        this.name = name;
        this.age = age;
        this.hasTail = hasTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    @Override
    public String toString (){
        return "Ім'я: " + this.name + ", вік: " + this.age + ", хвіст: " + booleanTrans(this.hasTail);
    }

    private static String booleanTrans(boolean a){
        return a ? "так" : "ні";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Animal)) {
            return false;
        }
        Animal a = (Animal) obj;
        return name.equals(a.name) && age == a.age && hasTail == a.hasTail;
    }

    @Override
    public int hashCode() {
        int result = (name == null ? 0 : name.hashCode());
        result = 31*result + age;
        result = 31*result + (hasTail ? 1 : 0);
        return result;
    }
}
