package m12_operators_part2;

public class ShorthandOperators {

    public static void main(String[] args) {

        //additional assignment operator
        int x = 5;
        System.out.println(x);

        x += 5;//x = x + 5
        System.out.println(x);

        //subtraction assignment operator
        int y = 10;
        System.out.println(y);

       // y = y -4;
        y -= 4;
        System.out.println(y);

        //multiplication assignment operator
        int z = 3;
        System.out.println(z);

        //z = z*5;
        z *= 5;
        System.out.println(z);

        //division assignment operator
        int a = 12;
        System.out.println(a);

        a /= 2;
        System.out.println(a);

        //modula assignment operator
        int b = 10;
        System.out.println(b);

        b %= 3;
        System.out.println(b);

        //different datatypes

        int c = 4;
        c += 20.5; //right side operand will be casted to left side

        System.out.println(c);












    }
}
