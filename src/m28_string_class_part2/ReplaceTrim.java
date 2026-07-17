package m28_string_class_part2;

public class ReplaceTrim {
    public static void main(String[] args) {

        String str = "Apple Apple Apple";

        str = str.replace("Apple", "Cherry");

        System.out.println(str);
        System.out.println("------------------------------------------------------------------------");

        //str = str.replaceAll("Cherry", "Blueberry");
        //System.out.println(str); => prints Blueberry after cherry was assigned to blueberry


        str = str.replaceFirst("Cherry", "Grape");
        System.out.println(str);
        //str is still referencing to cherry, so I need to reassign str back to str.replaceFirst

        System.out.println("------------------------------------------------------------------------");

        String s = "           Cydeo School     ";

        s = s.trim();
        //retuns string, cannot modify string object because it is immutable , so it creates new string
        System.out.println(s);





    }
}
