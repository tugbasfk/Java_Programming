package m27_string_class_part1;

public class EqualsMethodVsEqualsOperator {

    /*
    create 2 String objects, str1, str2 with string literal, and initialize with "Java".
    create 2 more String objects, str3, str4 with a new keyword, and initialize with "Java".
    Compare them using "equals()" method and "=="operator.
     */


    public static void main(String[] args) {

      String str1 = "Java";
      String str2 = "Java";

      /*Can be written as:
      String str1 = "Java",
             str2 = "Java";
       */
        System.out.println(str1 == str2); //checking if they are the same objects
        System.out.println(str1.equals(str2)); //checking if both have the same String text or not



      String str3 = new String ("Java");
      String str4 = new String ("Java");

        System.out.println(str3.equals(str4)); //same characters in same order or not?
        System.out.println(str3==str4); //same objects? -> both have own space in Heap so not the same object

        System.out.println(str3==str1); //same text in same order -> true

















    }
}
