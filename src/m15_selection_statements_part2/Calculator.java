package m15_selection_statements_part2;

public class Calculator {
    public static void main(String[] args) {
     /*write a program that creates calculator by using switch statements
     calculator can do basic arithmetic operations + - / *
     if operator above not give -> "invalid operator"
      */

        //can store int and decimal nums
        double num1 = 100, num2 =20;

        char operator = '+';

        switch(operator){
            //case needs to be value or constant
            case '+': //colon necessary
                System.out.println("addition " + (num1 + num2));
                break;

            case '-': //case values must be unique so the - cannot be +
                System.out.println("subtraction " + (num1 - num2));
                break;
            case '*':
                System.out.println("multiplication " + (num1 * num2));
                break;
            case '/':
                System.out.println("division " + (num1 / num2));
                break;
            default:
            System.out.println("invalid operator ");
            break;


        }






















    }
}
