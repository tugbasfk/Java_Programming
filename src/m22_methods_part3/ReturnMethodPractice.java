package m22_methods_part3;

public class ReturnMethodPractice {

    /*
    create a method named calculates that passes the following three parameters:
                        double num1
                        charMathOperator
                        double num2
    The method wil return the result of the two numbers by using the given
    math operator .
    if the math operator is an invalid operator, the method should return 0.

    valid operators +, -, *, /, %
     */
    public static void main(String[] args) {
       double result = calculate(20.5, '*', 2  );
        System.out.println(result);
    }



    public static double calculate(double num1, char mathOperator, double num2){
        boolean validOperator = mathOperator == '+' || mathOperator == '-' ||
                                mathOperator == '*' || mathOperator == '%';
                //==>to make sure operators are valid

        //if operators are invalid =>
        if(!validOperator){
            return 0;
        }
        double result = (mathOperator == '+') ? num1 + num2 : (mathOperator == '-')? num1 - num2
                         : (mathOperator == '*')? num1 * num2 :  (mathOperator == '/')? num1 / num2
                         : num1 % num2;

return result;
    }
}
