package m11_operators_part1;

import javax.crypto.spec.PSource;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println( 10 + 5); //15

        System.out.println(10 - 5); //5

        System.out.println(10 / 5);//2

        System.out.println(10 / 4); /*int / int gives you int value no decimal num
                                    so if 10/4 were 2.5 in Java it will be int 2*/
        System.out.println(10.0 /4.0 ); //this will print out 2.5 since both values are doubles
        //you can also do the following to get double
        System.out.println(10D / 4); //2.5

        System.out.println(10 * 5); //50

        System.out.println(10 % 3);//1
        // Algebra: 10/3=3.333...
        //algebra: 10 - (3*3)=1

        System.out.println(10 % 2);//0

        System.out.println(9 % 2); //1
        //9/2 = 4.5 -> int 4 -> 4*2 = 8 -> 9-8=1


        System.out.println(14 % 2);//0 evenly divisable

        System.out.println(1234 % 10); //4







    }
}
