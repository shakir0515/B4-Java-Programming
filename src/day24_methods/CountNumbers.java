package day24_methods;

public class CountNumbers {
    public static void main(String[] args) {
        countUpToNum(5);
        countUpToNum(10);

        int a = 100;
        countUpToNum(-10);
    }

    public static void countUpToNum (int num) {

        for (int i = 0; i <= num; i++) {
            System.out.println(i +" ");
        }


    }
}
