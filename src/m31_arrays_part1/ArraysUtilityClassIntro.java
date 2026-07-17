package m31_arrays_part1;

import java.util.Arrays;

public class ArraysUtilityClassIntro {

    public static void main(String[] args) {

        //toString(arr): returns a string represent of contents in array
        int[] numbers = {43, 12, 4, 1, 3, 5};
        //System.out.println(numbers);  -> I use toSTring to avoid hash code error
        System.out.println(Arrays.toString(numbers));


        //equals(arr): checks if both arrays are equal, returns boolean
        int[] n1 = {4, 5, 6, 10, 100};
        int[] n2 = {4, 5, 6, 10, 100};
        //System.out.println(n1 == n2); return false because they are two different objects and are not the same
        System.out.println(Arrays.equals(n1, n2)); //returns true because arrays are the same i order, num etc.
        //need to pass arrays you want to compare


        //sort(arr): sorts elements of an array in ascending order
        int[] scores = {95, 85, 90, 65, 55, 75};
        String[] languages = {"Zulu", "Spanish", "Italian", "english", "1Polish", "arabic"};

        /* Arrays.sort(scores/languages); is a void method and will not return any data,
        so I need to add System.out.println(Arrays.toString(scores/languages)); for each to get an output
         */
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        Arrays.sort(languages);
        System.out.println(Arrays.toString(languages));
        //upper/-lower case letters have diff ACSII & influence the order

        /*binarySearch(arr, value): searches specified elements in array with help of
        Binary Search Algorithm. Array must be sorted in ascending order
         */
        int[] numX = {4, 6, 18, 7, 10, 55};
        Arrays.binarySearch(numX, 7);
        //System.out.println(Arrays.binarySearch(numX, 7)); //returns index num as -3 -> cannot be
        //need sort() method first to make sure Array will be sorted
        Arrays.sort(numX); //Array will become -> [4, 6, 7, 10, 18, 55] -> 7 at index num 2
        System.out.println(Arrays.binarySearch(numX, 7));


        //copyOf(arrVar, length): copies specific Array and returns new array
        double[] d1 = {2.3, 4.5, 12.4};
        double[] d2 = Arrays.copyOf(d1, d1.length);
        //(d1 copies elements of Array, if I want all elements of array I do d1.length
        //d2 will return my new Array and hold all elements from d1 and its entire length
        System.out.println(Arrays.toString(d2));
        System.out.println(d1 == d2);
        /*to check if they are the same object
        returns false because copyOf() creates new array by copying specific array
        if I do double[] d2 = Arrays.copyOf(d1, 10);  -> length of array d2 becomes10 but d1 only has 3
        first 3 elements will be kept, remaining 7 will be default 0.0
         */


        //copyOfRange(arrVar, from, to): returns new Array, copies specific range of specified Array
        int[] nums = {0, 1, 2, 3, 4, 5, 6};
        int[] newNums = Arrays.copyOfRange(nums, 2, 5);
        //ending index is excluded so when I enter 5 my returned index will be4
        System.out.println(Arrays.toString(newNums));


        //fill(arrVar, value): assigns specified value to each element of specified Array.
        //if I want values not to be default 0 , I can use fill() method
        //value I pass on to fill () will pass value to first array specified
        int[] nums2 = new int[5];
        Arrays.fill(nums2, 20); //every single element in array will become 20
        System.out.println(Arrays.toString(nums2));


        //deepToString(arrVar): returns a string representation of multi-dimensional array
        //asList(arrVar): returns fixed-size list backed by specified arrays

    }
}
