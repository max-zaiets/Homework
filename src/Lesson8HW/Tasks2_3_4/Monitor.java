package Lesson8HW.Tasks2_3_4;

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString(){
        return super.toString() +
                ", X = " + this.resolutionX +
                ", Y = " + this.resolutionY;
    }

    @Override
    public boolean equals(Object o){
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Device or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Monitor)) {
            return false;
        }

        // typecast o to Device so that we can compare data members
        Monitor m = (Monitor) o;

        // Compare the data members and return accordingly
        return resolutionX == m.resolutionX && resolutionY == m.resolutionY && this.getManufacturer().equals(m.getManufacturer())
                && Float.compare(this.getPrice(), m.getPrice()) == 0 && this.getSerialNumber().equals(m.getSerialNumber());
    }

    @Override
    public int hashCode() {
        int result = this.getManufacturer() == null ? 0 : this.getManufacturer().hashCode();
        result = 31 * result + (int) this.getPrice(); //multiplying by 31 reduces the collision between potentially matching hash codes
        result = 31 * result + (this.getSerialNumber() == null ? 0 : this.getSerialNumber().hashCode());
        result = 31*result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}
