package m21_methods_part2;

public class oddOrEven {

    public static void main(String[] args) {

        //write a method that takes a num as a parameter and displays if a num is even or odd
        oddOrEven(100);
        oddOrEven(10);

        //OR you can give a variable
        int a = 203;
        oddOrEven(a);


    }

    public static void oddOrEven(int number) {
/*instead of repeating if statements over and over again for each num
 I need to check, I can create a method and call it in the main and enter value/variable
 */
        if (number % 2 == 0) {
            System.out.println(number + " is even number. ");
        } else {
            System.out.println(number + " is odd number. ");
        }

    }


}
