package m11_operators_part1;

public class ImplicitCasting {

    public static void main(String[] args) {


        byte num1 = 25;

        int num2 = (int)num1; //casting operator // implicitly done so I dont wuite need to write down (int)

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

         double num3;
         int num4 = 10;

         num3 = num4; //10.0 stored in num3 // implicitly casted to double cause num3 is double
         System.out.println("num3 = " + num3); //10.0 cause num3 is double
         System.out.println("num4 = " + num4); //num4 is int so 10 is output
















    }
}
