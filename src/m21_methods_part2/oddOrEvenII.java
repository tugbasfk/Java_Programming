package m21_methods_part2;

public class oddOrEvenII {
    public static void main(String[] args) {
     //write a method that takes a num as a parameter and returns if a num is odd or even

       String s1 =  returnOddOrEven(100);
        System.out.println(s1);
        System.out.println( returnOddOrEven (101)); //value returned from method can be treated as values

        /*
        - I want to check if 100 is odd or even -> I call my method
        - return method can be treated as a regular value,
            -> everytime I call a return method , it's going to return me a value
            -> I want value to be reusable , whatever value it might be
            -> so, I assign it back to a variable
            => since return type is string, I assign it to a string variable
         */
    }

    public static String returnOddOrEven(int number ){

        if(number % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
        /*
        String in the method header means my return value must be a string
        int in () because I want to check numbers and have string returned
         */
    }















}
