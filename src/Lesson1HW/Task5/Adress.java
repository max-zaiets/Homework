package Lesson1HW.Task5;

public class Adress {

    private String index;
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public static void main(String[] args) {
        Adress a = new Adress();
        a.setApartment("5");
        a.setCity("Warsaw");
        a.setCountry("Poland");
        a.setHouse("16");
        a.setIndex("53-059");
        a.setStreet("Przebyszywskiego");

        System.out.println(
                "Country: " + a.getCountry() + "\n" +
                "City: " + a.getCity() + "\n" +
                "Street: " + a.getStreet() + "\n" +
                "House: " + a.getHouse() + "\n" +
                "Apartment: " + a.getApartment() + "\n" +
                "Index: " + a.getIndex() + "\n"
        );
    }
}
