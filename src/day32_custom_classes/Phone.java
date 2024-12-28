package day32_custom_classes;

// Template Class - we set the instructions how the Object of this class will behave
public class Phone {
    // Instance variables - every object has its own copy of these
    String name;
    String brand;
    int memory;
    double version;


    // NON-Parameterized CONSTRUCTOR
    //public Phone (){
    //
    //}


    // Java prioritizes the LOCAL variables over INSTANCE variables if the have same name
    // To make the difference, we use "this"
    public Phone (String name, String brand, int memory, double version) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }

    public Phone (String name){
        this.name = name;
    }


    public Phone (String name, String brand, int memory) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
    }}


