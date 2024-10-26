package day05_variables;

public class MyName {
    public static void main(String[] args) {

        char letter1 = 'S';
        char letter2 = 'h';
        char letter3 = 'a';
        char letter4 = 'k';
        char letter5 = 'i';
        char letter6 = 'r';

        System.out.println("letter1 = " + letter1);
        System.out.println("letter2 = " + letter2);
        System.out.println("letter3 = " + letter3);
        System.out.println("letter4 = " + letter4);
        System.out.println("letter5 = " + letter5);
        System.out.println("letter6 = " + letter6);

        System.out.println(0 +letter1);
        System.out.println(0 +letter2);
        System.out.println(0 +letter3);
        System.out.println(0 +letter4);
        System.out.println( 0 + letter5);
        System.out.println( 0 + letter6);

        System.out.println(letter1 + letter2 + letter3 + letter4 + letter5 + letter6);

        String myName = "" + letter1 + letter2 + letter3 + letter4 + letter5 + letter6;
        System.out.println(myName);


    }

}
