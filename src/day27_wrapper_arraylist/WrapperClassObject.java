package day27_wrapper_arraylist;

public class WrapperClassObject {
    public static void main(String[] args) {
        int a = 5; //primitive data type for varaible a

      //  Integer a2 = new Integer(10); //deprecated/not use anymore after Java version 9

        Integer a3 = 20; //20 --> int ---> Integer --->Autoboxing

        int a4 = a3; // Integer ---> int ------ > unboxing
        System.out.println(a);
        System.out.println(a3);
        System.out.println(a4);

        byte b = 2;
        Byte b2 = 20; // Wrapper Class type / Object type / Non-Primitive

    }
}
