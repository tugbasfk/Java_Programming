package m32_arrays_part2;

import java.util.Arrays;

public class ReverseArrayElements {
    /*
    write a method to reverse the elements of an integer array.
    The method should take an array of integers as input and reverse the order of its elements and return it.
     */

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        //in order to reverse array I don't need repeating loops again
        int[] result = reverseArray(numbers); //to have int array returned, method needs to be assigned to int
        System.out.println(Arrays.toString(result));

        double[] arr1 = {1.5, 2.5, 3.5}; //need a new method to get a return here because reverseArray is int
        double[] result2 = reverseArray(arr1);
        System.out.println(Arrays.toString(result2));
        //I can use same method name for both since it causes an overload and variables are different

        //which one gets executes depends on which argument you pass

        String[] names ={"Java", "Python", "C#", "C++"};
        String[] result3 = reverseArray(names);
        System.out.println(Arrays.toString(result3));
    }


    public static int[] reverseArray(int[] array) { //to reverse array method must have array itself, else no way to reverse
        //whenever method being called argument needs to be given,
        // arg needs to be int array

        //first create array variable containing reversed array object
        // int[] reversedArray;
        //need to make sure, int[] reversedArray, array can hold all elements of given array, int[] array.
        //if int[] array has 5 elements, int[] reversedArray needs to hold 5 too
        //-> how to make sure of that: instantiate variable int[] reversedArray
        //=> assign given arrays length to int[] reversedArray's length => array.length()

        int[] reversedArray = new int[array.length]; //now all elements 0 by default

        //next, I need to get every single element of int[] array array from first to last
        //and store them in int[] reversedArray
        //to get nums in reversed order, I need to access index num

        //for (int i = array.length - 1; i >= 0; i--) { //i -> index num of int[] array starting last to first
        //now, able to use i as index num to get elements of given array, starting last to first
        //those elements I need to store into new array int[] reversedArray starting index 0 - last
        //need to use another variable to represent new index of new array reversedArray, starting 0 - last

        //to do so: declare 2nd variable, j in for loop initialization, data type same as int,
        // j = 0 because need to make sure last element of given array int[] arr
        // should be assigned to index of new array int[] reversedArray
        //everytime index num of array int[] array decreases I need to make sure index of j increases

        if (array.length <= 1) { //*see notes below
            return array;
        }
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
            //by using i, am able to get elementsof given array startingfrom last index
            //last element of array array[i] needs to be stored at index 0 of new array reversedArray
            // j starts at 0 so element array[i] needs to be assigned to index 0 of new array reversedArray
            //when loop executed for 2nd time array[i] decreased by 1-> will get me 2nd last element
            //2nd last element of array[i] will be assigned to reversedArray[j]
            //in 2nd iteration j = 1
            //loop continues until i >= 0 becomes false

        }

        return reversedArray;
        //return type of method matches value I am returning from method


        /*what if given array had 1 or 0 elements? _> we don't need to repeat loops,
            we return given array itself
            I could create if sentence to avoid unnecessary steps
            => if(array.length <= 1) //is array contains 1 or 0 elements
            return array; => will return array itself , no need to reverse
         */


    }

    public static double[] reverseArray(double[] array) {
        if (array.length <= 1) {
            return array;
        }
        double[] reversedArray = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            /*
            in my for loop I keep int and not double because i and j are array indexes and not array values
            indexes always are in int => they are positions and not values sored in arrays
             */
            reversedArray[j] = array[i];
        }
        return reversedArray;
    }

    public static String[] reverseArray(String[] array) {
        if (array.length <= 1) {
            return array;
        }
        String[] reversedArray = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reversedArray[j] = array[i];
        }
        return reversedArray;
    }
}





