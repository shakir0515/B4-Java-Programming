package day36_inheritance.access_mod.b;

import day36_inheritance.access_mod.a.First;
//Different package different class
public class Third extends First {
    public static void main(String[] args) {
        First f = new First();
        System.out.println(f.one);
//        System.out.println(f.two);
//        System.out.println(f.three);
//        System.out.println(f.four);

        Third t = new Third();
        System.out.println(t.one);
        System.out.println(t.two);
//        System.out.println(t.three);
//        System.out.println(t.four);
    }
/* object 'f' is in the same package and different class
     object 's' is in the same package and different class
     object 's' is in the same package and different class


    public -> accessible different package - different class
    protected -> accessible different package - different class
    if there's INHERITANCE:
    -if you reach protected variable by parent class object - NOT ACCESIBLE
    -If you try to reach variable by child class object - ACCESSIBLE
    default -> accessible different package - different class
    private -> NOT accessible different package - different class
     */
}
