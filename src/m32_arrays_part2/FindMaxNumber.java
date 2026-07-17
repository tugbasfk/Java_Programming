package m32_arrays_part2;

public class FindMaxNumber {

    public static void main(String[] args) {
        int[] x = {10, 2, 3, 40, 20};
        System.out.println(MaxValue(x));

        int[] y = {6, 8, 3, 5, 1, 9};
        System.out.println(MaxValue(y));

    }

    public static int MaxValue(int[] numbers) {
        //int because I will be working with int and want the return type to be int
        //first; make sure array object is not empty or null, else loop to iterate array cannot be applied

        if (numbers == null || numbers.length == 0) {
            //numbers.length == 0 means array is empty
            //numbers ==0 means array object has never been created
            System.out.println("Array is empty.");
            return 0;
        }


        int max = numbers[0];
        //assigned first element of array to the variable max, assuming first element is max num -> not final


        //get every single element of array numbers,
        // to see if any other element is greater than the current max num I have
        //if there's an element greater than current max num,
        // I will replace current max num with num that's greater
        //need to repeat this process for every single element of array, so after iteration
        //I will only have max num that can be stored in variable

        for (int number : numbers) {
            //call for-each loop to get elements because no modific is requ,
            // only need to access numbers to see if it's max num
            //variable number is representing numbers of array numbers

            //create a condition to check if there's a number in array greater than current max num
            if (number > max) { //whenever there's a num greater than current max, number should replace current max
                max = number; //therefore, variable max needs to be updated by number that is greater
                //now I have max value stored in max and need to return it in the end
            }

        }
        return max; //

    }
}
/*
manual debug:
suppose array given : {10, 2, 3, 40, 20}
int max = numbers[0]; //when this statement gets executed first element of array will be assigned to max variable
- first max num will be 10
        for (int number : numbers) {
        if (number > max) {
        max = number;
        }
        }
-> for-each loop is going to check if there's an element even greater, every time there is
    it will reassign the variable max
-> when loop executed first, num will be 10
    => is 10 greater than > current max num which is 10
    => if not , it's going to check next num
    => in next iteration num will be 2, is 2 > 10 ==> false -> max variable will not update
    => in next iteration num will be 3, is 3 > 10 ==> false -> max variable will not update
    => in next iteration num will be 40, is 40 > 10 ==> true -> will be assigned to max variable
    ==> after this iteration max value will be 40
        => in next iteration num will be 20, is 20 > 40 ==> false -> max variable will not update




 */