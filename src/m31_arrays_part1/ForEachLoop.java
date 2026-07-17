package m31_arrays_part1;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {15, 30, 45, 60, 75, 90};
        //need to access each element of array and display them on separate lines
        for (int each : numbers) {
        /*right side of ":" -> data structure, which is my array called numbers
        on the left of ":" -> variable, which represents each element we have in our data structure
        variable name usually given as "each", representing each element of data structure
         */
            System.out.println(each);
            //if you want to update or access elements from last to first you need to use index nums


            //shortcut for creating each loop names.for()
            System.out.println("----------------------------------------------------");

            String[]  names = {"Java", "Python", "C#", "Ruby"};
            for (String name : names) {
                System.out.println(name); //sout(name) because names is stored in name above

            }
            }

        }


    }

