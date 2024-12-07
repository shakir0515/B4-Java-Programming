package day24_methods;

public class MyFirstMethod {
    public static void main(String[] args) {
        printHelloWorld(); // I called a method name printHelloWOrld
        System.out.println("Hello World!");


        System.out.println("Bye");
        printHelloWorld50();
        System.out.println("================");
        printHelloWorld50();


    }

    //public method
    //static method
    //void method does not return anything doing some action
    // non parametrized
    public static void printHelloWorld () {
        System.out.println("Hello World!!");
    }

    public static void printHelloWorld50() {

        for (int i = 0; i < 50; i++) {
            System.out.println("Hello World 50");
        }
    }

}
