package Lesson3HW.Task3;

public class Car extends Vehicle{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String model) {
        this.model = model;
        price = 25000;
        speed = 250;
        year = 2022;
        coordinates = "41°24'12.2\"N 2°10'26.5\"E";
    }

    public void showCarInfo(){
        super.showInfo();
        System.out.println("Model: " + model);
    }
}
