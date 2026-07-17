package m27_string_class_part1;

public class StringIntro {

    public static void main(String[] args) {

        String s1 = "Wooden Spoon"; //String literal
        String s2 = "Wooden Spoon"; //String literal => one String literal saved in String Pool inside Heap for both

        System.out.println(s1 == s2); //will check if both are the same object => if same it will return true

        String s3 = new String("Wooden Spoon"); //creating a String object using "new()",
                                                // a new object in Heap memory will be created outside the String pool
        String s4 = new String("Wooden Spoon");

        System.out.println(s3 == s4);//both are referencing different objects even though they have same exact String
                                    // they allocated in different memory in Heap => output: false

        System.out.println(s1 == s3); //returns false since one is inside and the other is outside the String pool

















    }
}
