package Lesson7HW.Task3;

public class Price {
    private String itemName;
    private String shopName;
    private double uah_price;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public double getUah_price() {
        return uah_price;
    }

    public void setUah_price(double uah_price) {
        this.uah_price = uah_price;
    }

    @Override
    public String toString(){
        return this.itemName + " " + this.shopName + " " + this.uah_price;
    }


}
