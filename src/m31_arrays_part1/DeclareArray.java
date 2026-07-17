package m31_arrays_part1;

import java.util.Arrays;

public class DeclareArray {
    public static void main(String[] args) {

        int[] scores;
        scores = new int [4]; //Array size is fixed -> here will get 0000 by default
                                //[] declare it's an Array
        //==>if I know exact values and how many need to be stored in array I could use {}
        //BUT, if don't know exact elements but only know how many -> declare instantiate array first then assign values


        //assigning element values
        scores [0] = 85;
        scores [1] = 101;
        scores [2] = 70;
        scores [3] = 90;


        //System.out.println(scores);
        //need to call two string method first then pass argument
        //toString converts array into a string representation
        System.out.println(Arrays.toString(scores));
        System.out.println(scores[0]);
        // want to access first element of array,
        //first give name of array then index num in []
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        System.out.println("----------------------------------------------------------------");

        String[] names = new String[5]; //array can contain 5 elements , by default all are null
        System.out.println(Arrays.toString(names));
        //use this instantiation if you don't know exact elements only

        String[] names2 = {"Java", "Python", "C#", "Ruby", "C++"}; //Curly braces initialization
        //if you know how many what elements are use this initialization
        System.out.println(Arrays.toString(names2));



    }
}
