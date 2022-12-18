package Java_Essential.Lesson8HW.Tasks2_3_4;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString(){
        return super.toString() +
                ", speed = " + this.speed +
                ", mac = " + this.mac;
    }

    @Override
    public boolean equals(Object o){
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Device or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof EthernetAdapter)) {
            return false;
        }

        // typecast o to Device so that we can compare data members
        EthernetAdapter e = (EthernetAdapter) o;

        // Compare the data members and return accordingly
        return speed == e.speed && mac.equals(e.mac) && this.getManufacturer().equals(e.getManufacturer())
                && Float.compare(this.getPrice(), e.getPrice()) == 0 && this.getSerialNumber().equals(e.getSerialNumber());
    }

    @Override
    public int hashCode() {
        int result = this.getManufacturer() == null ? 0 : this.getManufacturer().hashCode();
        result = 31 * result + (int) this.getPrice(); //multiplying by 31 reduces the collision between potentially matching hash codes
        result = 31 * result + (this.getSerialNumber() == null ? 0 : this.getSerialNumber().hashCode());
        result = 31*result + speed;
        result = 31 * result + (mac == null ? 0 : mac.hashCode());
        return result;
    }
}
