package m10_variables_data_types;

public class FloatingPoints {

    public static void main(String[] args) {

        float maxFloat = 3.14F; // float by default taken as double so we add f or F to the end
        double maxDouble;
        //->these are local variables: are only accessible  within a scope of block
        maxDouble = 3.14; // can add D or d to end but not necessary

        System.out.println(maxFloat);
        System.out.println(maxDouble);
    }
}
