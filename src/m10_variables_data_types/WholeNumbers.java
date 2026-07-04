package m10_variables_data_types;

public class WholeNumbers {

    public static void main(String[] args) {

        // DataType variableName = Data;

        byte maxByte = 127;
        short maxShort = 32_767;/*_ replaces comma (,) sine comma is usually used for seperating variables
                                _ makes large num more readable but prints without comma or underscore*/

        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L; //l or L lets compiler know the num is not int by default but is a long int
        System.out.println(maxByte);
        System.out.println(maxShort);
        System.out.println(maxInt);
        System.out.println(maxLong);



    }
}
