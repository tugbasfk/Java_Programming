package m32_arrays_part2;

public class SumOfOddNumbers {
    //write a method that returns the sum of each odd number of an integer array
    public static void main(String[] args) {
        int[] x = {2, 5, 7, 2, 3};
        int[] y = {3, 3, 2, 3, 2, 3};

        //finding odd nums of array x
        System.out.println(sumOfOddNumbers(x));
        //need to pass argument which is my array name to the method, else it will give an error
        //sumOfOddNumbers -> return method, returns me a value , value can be passed into print statement
        System.out.println(sumOfOddNumbers(y));

    }


    //public static for modifiers , return type int, to be able to return int
    public static int sumOfOddNumbers(int[] numbers) {
        //later on when this method is passed (int [] array) needs to be passed
        int sum = 0; //0 I will need to add every single odd number on top of this variable

        //getting and adding odd nums to sum
        //treat parameter (int) as array that will be given
        //for-each loop for accessing each element because I don't need to use index nums, and no modific req
        //shortcut for array iteration

        for (int number : numbers) { //variable
            // number is representing every single num of array numbers
            if (number % 2 != 0) {
                //make sure odd num is added to sum so sum will be updated by :
                sum += number; //adds value and updates
                //under the above condition , number will be odd
                //this for loop repeats the condition for every single elements of numbers
                //num of iteration of for loop will be determined by the length of array numbers
                //iteration order for for-loop: first element to last element
            }

        }

        return sum; //because this is a return method, I need to return a value
    }
}
