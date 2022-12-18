package Java_Advanced.Lesson1HW.Task3;

public class Car implements Comparable {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }


    public int compareTo(Object o) {
        int tempSpeed = this.speed - ((Car) o).speed;

        if (tempSpeed == 0) {
            int tempPrice = this.price - ((Car) o).price;

            if (tempPrice == 0) {
                int tempModel = this.model.compareTo(((Car) o).model);

                if (tempModel == 0) {
                    return this.color.compareTo(((Car) o).color);

                } else return tempModel;

            } else return this.price - ((Car) o).price;

        } else {
            return tempSpeed;
        }
    }
}
