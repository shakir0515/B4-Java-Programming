package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
        Remove Long Strings

        Create a method that will accept an ArrayList of Strings and an int. Remove any String elements that have less characters than the given number.
        Return the modified ArrayList of Strings

        @param list - Given ArrayList of Strings @param int - max number of characters @return - ArrayList of Strings

        Ex: {"one", "two", "three", "four", "five", "six"} Max number: 4
        Output: {“three, “four”, “five”
 */
public class RemoveLongString {

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println("Original:"  + list);

        System.out.println("Update: " + removeLongStrings(list, 4));
        System.out.println("Update: " + removeLongStrings(list, 5));
        System.out.println("Update: " + removeLongStrings(list, 10));

    }

    public static ArrayList <String> removeLongStrings (ArrayList <String> list, int num) {  // 6

        ArrayList <String> updatedList = new ArrayList<>(list);  // ["one", "two", "three", "four", "five", "six"]
        updatedList.removeIf( eachElem -> eachElem.length() < num);

        return updatedList;
    }

}