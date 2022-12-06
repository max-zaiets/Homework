package Lesson6HW.Task4;

enum Vehicles {
    NISSAN(50000), AUDI(100000), MASERATI(250000);

    double price;
    String colour;

    Vehicles(double price) {
        this.price = price;
    }

    public String getColour(){
        return colour;
    }

    @Override
    public String toString(){
        return  "Car: " + this.name() + " \n" +
                "Colour: " + this.colour + "\n" +
                "Price: " + this.price;
    }
}
