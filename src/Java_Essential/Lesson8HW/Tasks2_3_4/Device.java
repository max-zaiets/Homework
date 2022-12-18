package Java_Essential.Lesson8HW.Tasks2_3_4;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString(){
        return "manufacturer = " + this.manufacturer +
                ", price = " + this.price +
                ", serial number = " + this.serialNumber;
    }

    @Override
    public boolean equals(Object o){
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Device or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Device)) {
            return false;
        }

        // typecast o to Device so that we can compare data members
        Device d = (Device) o;

        // Compare the data members and return accordingly
        return manufacturer.equals(d.manufacturer) && Float.compare(price, d.price) == 0 && serialNumber.equals(d.serialNumber);
    }

    @Override
    public int hashCode(){
        int result = manufacturer == null ? 0 : manufacturer.hashCode();
        result = 31 * result + (int)price; //multiplying by 31 reduces the collision between potentially matching hash codes
        result = 31 * result +  (serialNumber == null ? 0 : serialNumber.hashCode());
        return result;
    }
}
