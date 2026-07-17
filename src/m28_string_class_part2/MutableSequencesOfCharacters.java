package m28_string_class_part2;

public class MutableSequencesOfCharacters {
    public static void main(String[] args) {

        //StringBuilder preferred because it is not synchronized -> faster

        StringBuilder stringBuilder = new StringBuilder("Java");

        //stringBuilder.append(17); //returns Java17
        stringBuilder.append(" Programming");//returns Java Programming
        //don't need to assign it back to string variable stringBuilder because it is mutable
        System.out.println(stringBuilder);


        stringBuilder.reverse();

        System.out.println(stringBuilder);


        String result = stringBuilder.toString();
        System.out.println(result);

        //toString turns stringBuilder into string not a stringBuilder
//returns a string object so I can assign it to string variable

        StringBuffer stringBuffer = new StringBuffer("Java");
        stringBuffer.append(" Programming"); //command hover over method and click to see keyword behind
        System.out.println(stringBuffer);
       // StringBuffer.reverse();
        //(String result2 = StringBuffer.toString();
        //methods are the same for buffer and builder, however, in buffer contains synchronized keyword
        //in append method of stringBuffer meaning stringBuffer is synchronized -> only difference


    }
}
