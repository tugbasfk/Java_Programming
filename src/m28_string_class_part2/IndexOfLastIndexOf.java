package m28_string_class_part2;

public class IndexOfLastIndexOf {
    public static void main(String[] args) {

        String str = "Java Programming Language";
        int indexOfFirstA = str.indexOf("a");
        System.out.println("Index of first a: " + indexOfFirstA);

        int indexOfSecondA = str.indexOf("a P");
        System.out.println("Index of second a: " + indexOfSecondA);
        /*first time a_P has occurred in string, so it will return 3
         */

        int indexOfThirdA = str.indexOf("a", 5);
        //need to provide two arguments: 1st is character , 2nd is index num where I want program to start counting from
        System.out.println("Index of third a: " + indexOfThirdA);

        int indexOfFourthA = str.indexOf("a", indexOfThirdA + 1);
        //want to look for a after index of 3rd a, indexOfThirdA + 1 means after index of 3rd a
        System.out.println("Index of fourth a: " + indexOfFourthA);

        int indexOfLastA = str.lastIndexOf("a");
        System.out.println("Index of last a: " + indexOfLastA);
        // will count index from back







    }
}
