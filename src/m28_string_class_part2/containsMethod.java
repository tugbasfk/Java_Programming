package m28_string_class_part2;

public class containsMethod {

    public static void main(String[] args) {

        String sentence = "I love Java and Python programming languages.";

        //checking if sentence includes Java in it

        boolean hasJava = sentence.toLowerCase().contains("Java"); //to ignore lower/-upper case
        //returns boolean, so I am able to assign it to boolean variable

        System.out.println(hasJava);


    }
}
