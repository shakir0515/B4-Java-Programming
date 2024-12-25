package day31_custom_classes;

public class Coffee {
    //instance variables- each object has its own copy
    double price;
    double sizeInOz;
    String brand;
    String type;


    @Override
    public String toString() {


        return "Coffee:" +
                "\n\tprice: $" + price +
                "\n\tsize in Oz: " + sizeInOz +
                "\n\tbrand: " + brand + '\'' +
                "\n\ttype: " + type;
    }

public void drink() {
    System.out.println("Drinking " + type.toLowerCase() + " coffee");
}


public void refill (double addOz) {
    System.out.println("Refiling " + addOz + " oz");

    sizeInOz += addOz;


}
}
