package Java_Essential.Lesson7HW.Task3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Price[] prices = new Price[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < prices.length; i++) {
            Price price = new Price();
            prices[i] = price;

            System.out.println("Enter item " + (i + 1) + " name:");
            price.setItemName(sc.nextLine());


            System.out.println("Enter item " + (i + 1) + " shop name:");
            price.setShopName(sc.nextLine());

            try {
                System.out.println("Enter item " + (i + 1) + " price in UAH:");
                price.setUah_price(sc.nextDouble());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input string is not a double type ");
                sc.nextLine();
            }

        }


        Arrays.sort(prices, (first, second) -> Integer.compare(first.getShopName().compareTo(second.getShopName()), 0));
        showItems(prices);
    }

    public static void showItems(Price[] prices) {
        System.out.println("Enter shop name to look up the item: ");
        Scanner sc = new Scanner(System.in);
        String shopName = sc.next();
        try {
            for (Price price : prices) {
                if (price.getShopName().equals(shopName)) {
                    System.out.println("Item sold in this shop is: " + price.getItemName());
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Shop with the given name does not exist");
        }
    }
}
