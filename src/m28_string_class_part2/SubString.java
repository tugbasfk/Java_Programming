package m28_string_class_part2;

public class SubString {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        String firstWord = str.substring(0, str.indexOf(" "));
        //Substring starting from index 0 to index of " " will be returned excluding the " ".
        System.out.println("first word = " + firstWord);

        String secondWord = str.substring(str.indexOf(" ") + 1);
        //+1 skips the space and not providing an endIndex is not necessary since it will by default end string
        System.out.println("secondWord = " + secondWord);


    }
}
