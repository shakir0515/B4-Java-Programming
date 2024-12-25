package day31_custom_classes;
//Runner main method
public class UsingCoffee {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();
// Instance members canNOT be reach by class name
        // System.out.println(Coffee.price);
        // any other class member canNOT be reached directly from different file
        // System.out.println(price);


        // If we have toString() method NOT declared, it will print memory location
        // If we have it declared, we can print th object and it will call toString by default
        System.out.println(coffee1);
        // You can do it this way as well but NOT needed
        // System.out.println(coffee1.toString());


        // lets assign values to those instance variables

        // any other class member canNOT be reached directly from different file
        // price = 3.99;
        // sizeInOz = 16.0

        // We need object reference to call the instance variables and then assign values
        coffee1.price = 3.99;
        coffee1.sizeInOz = 16.00;
        coffee1.brand = "Starbucks";
        coffee1.type = "Black";


        // It will call the toString() method by default
        System.out.println(coffee1);

        // Call your custom instance method
        // any other class member canNOT be reached directly from different file
        // drink();
        // Instance members canNOT be reach by class name
        // Coffee.drink();

        System.out.println();
        coffee1.drink();

        System.out.println();
        coffee1.refill(2.0);
        System.out.println(coffee1.sizeInOz);

        System.out.println("--------------------------------");
        Coffee coffee2 = new Coffee();
        System.out.println(coffee2);

        System.out.println();
        coffee2.drink(); // Drinking null type of coffee

        coffee2.refill(10);
        System.out.println(coffee2);





    }
}
