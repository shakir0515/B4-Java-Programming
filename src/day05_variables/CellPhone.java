package day05_variables;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Samsung";
        String model = "Galaxy S24 Ultra";
        String color = "green";
        double price = 1300;
        int storage = 512;
        boolean hasCamera = true;
        char sim ='A';

        System.out.println("I just bought " + brand + " " + model + " from  Samsung");

        System.out.println("It is in the color of " + color + " and it has " + storage + " GB");

        System.out.println("It has " + sim  + " sim card and with the camera being " + hasCamera + ", the total price $" + price);

        System.out.println("-----");
        String fullMessage ="I just bought " + brand + " " + model + " from  Samsung" + "\nIt is in the color of " + color + " and it has " + storage + " GB" + "\nIt has " + sim  + " sim card and with the camera being " + hasCamera + ", the total price $" + price;
        System.out.println(fullMessage);


    }




}
