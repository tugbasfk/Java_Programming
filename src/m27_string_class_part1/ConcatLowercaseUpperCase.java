package m27_string_class_part1;

public class ConcatLowercaseUpperCase {
    public static void main(String[] args) {

        String str = "Cydeo";
        /*str.concat(" School"); will return Cydeo School
                                because it cannot modify object str since it's immutable
                                but since there is no reference to the new String variable it will be collected by garbage collector
        System.out.println(str);returns Cydeo because variable str has not been updated
                                 -> .concat can only create new object but cannot modify already existing one
        if I want to store the new variable into str variable I need to assign it back to it:
         */

        str = str.concat(" School");
        System.out.println(str);

        //if I don't want new variable to go to garbage collector I have to assign it to a new variable
        String lowerCaseStr = str.toLowerCase(); //cydeo school
        System.out.println(lowerCaseStr);

        String upperCaseStr = str.toUpperCase(); //CYDEO SCHOOL
        System.out.println(upperCaseStr);














    }
}
