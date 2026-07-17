package m31_arrays_part1;

public class ArrayLength {

    public static void main(String[] args) {


        //String [] names = new String [4]; -> if I don't know exact numbers

        String[] names = {"James", "Sara", "Julia", "Hazel"};
        int lengthOfArray = names.length;
        System.out.println("Length of Array = " + lengthOfArray);

        //last index num of array
        int lastIndex = lengthOfArray - 1;
        System.out.println(names[lastIndex]);//accessing elements of an array

        System.out.println("------------------------------------------------");

        int[] numbers = {40, 50, 60, 70};
        //I want to access and display them in separate lines ,
        //so I need to iterate starting from first to last element

        /*for (int i = 0; i < numbers.length; i++) {
            //initialization index always start from 0 , so i = 0
            //i < numbers.length because I want my last index num
            // and < only includes length -1 which is last index num
            System.out.println(numbers[i]);
            //once all is set I can use i as my index number to get access to elements of array
            // by passing i into []
            ==>>used this for loop to get elements from first to last
            */

      /*  //if I want elements from last to first
        for (int i = numbers.length - 1; i >= 0; i--) {
            //for reversed order, initialization starts from last numb which I can get by using numbers.length-1
            //for condition = loop should continue to iterate until specific condition is met
            //loop needs to be iterated as long as i >=0because we're going in reversed order
            //and should stop when it reaches 0
            System.out.println(numbers[i]);*/

        //shortcut for iteration elements of array
        //numbers.fori / variableName.fori
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

            System.out.println("-----------------------------------------------------------");

            //shortcut for reverse loop
            //numbers.forr / variableName.forr -> r is for reverse

            for (int i1 = numbers.length - 1; i1 >= 0; i1--) {
                System.out.println(numbers[i1]);

            }
        }

    }
}





