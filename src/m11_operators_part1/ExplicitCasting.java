package m11_operators_part1;

public class ExplicitCasting {

    public static void main(String[] args) {

       double num1 = 100.5;

       short num2 = (short) num1; //need to explicitly name (short)

        System.out.println("num1 =" + num1);
        System.out.println("num2 =" + num2);
        //explicit casting only for int not float so int will always be returned

        int num3 = 500;
        byte num4 = (byte) num3;

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);  //returns -12 -> data loss







    }
}
