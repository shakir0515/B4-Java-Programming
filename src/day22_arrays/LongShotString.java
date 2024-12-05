package day22_arrays;

public class LongShotString {
    public static void main(String[] args) {

        String [] words = {"java", "selenium", "softskill", "mentors"};
        String longest = words[0];
        String shortest = words[0];

        for (String eachElement : words) {
            if(eachElement.length() > longest.length()) {
                longest = eachElement;
            }
            if (eachElement.length()<shortest.length()) {
                shortest= eachElement;
            }
        }

        System.out.println("Longest String: " + longest);
        System.out.println("Shortest String: " + shortest);
    }
}
