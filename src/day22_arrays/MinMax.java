package day22_arrays;

public class MinMax {
    public static void main(String[] args) {

        int [] nums = {500, 120, -80, 90, 250, -10};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int eachElement : nums) {
            if (eachElement> max) {
                max = eachElement;
            }

            if (eachElement< min){
                min = eachElement;
            }
        }

        System.out.println(max);
        System.out.println(min);


    }
}
