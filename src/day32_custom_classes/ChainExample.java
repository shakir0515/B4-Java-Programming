package day32_custom_classes;

// Template Class
public class ChainExample {

    // 1st Constructor - NON-Parameterized Constructor
    public ChainExample () {
        System.out.println("First");
    }


    // 2nd Constructor - Parameterized (parameters int)
    public ChainExample (int i) {
        this();
        System.out.println("Second");
    }


    // 3rd Constructor - Parameterized (parameter String)
    public ChainExample (String str) {
        this(4);
        System.out.println("Third");
    }

}
