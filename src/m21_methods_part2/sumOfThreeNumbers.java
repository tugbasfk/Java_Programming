package m21_methods_part2;

public class sumOfThreeNumbers {
    public static void main(String[] args) {
        //write a method that calculates the sum of 3 number

        sumOfThreeNumbers(10, 20, 30);

        int a = 10;
        byte b = 20;
        short c = 30;
        //==>> these data types are compatible so i can use these for the method too
        sumOfThreeNumbers(a, b, c);

        // data type long would give compiler error,
        // so I have to do casting by specifically naming int
        int x = 10;
        long y = 20;
        long z = 30;
        sumOfThreeNumbers(x, (int)y,(int) z);



    }

    public static void sumOfThreeNumbers(int num1, int num2, int num3) {
        //every data type must be specifically named even though they all have the same
        System.out.println("Sum: " + (num1 + num2 + num3));

    }
}
