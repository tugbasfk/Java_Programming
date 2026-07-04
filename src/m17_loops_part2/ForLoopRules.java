package m17_loops_part2;

public class ForLoopRules {

    public static void main(String[] args) {

       /* //1. avoid infinite loops:

        for(;;){ //initialization and condition required even though this will compile too
            System.out.println("cydeo");


    }

        for (int i = 0; i > -1 ; i++) { //positive num will make condition always true and run forever
            System.out.println("Cydeo");
        }

        for (int i = 1; i < 11 ;) {
            //if no iterator given, i won't change and condition will always be true and keep running
            System.out.println("Cydeo");

        }
         */

        //2. Multiple variables can be given in initialization
        for (int i = 1, j = 10, k = 100; i < 11 ; i++, j+=10, k +=100) {
            System.out.println(i + " == " + j + " == " + k);
        //whenever i reaches 10 runs as initiated by i < 11, j will stop too
        //so j will stop after i stops and have had 10 runs if j condition not specified
        //if I want to add condition for j I need to use i < 11 &&  j < x
        //===>  (int i = 1, j = 10; i < 11 && j <11 ; i++, j+=10)
        }

        System.out.println("----------------------------------------------------------");


        //3. Re-Assigning a variable in the for loop block

        int x;
        for(x = 0; x < 5; x++){
            System.out.println(x);
        }
        System.out.println("-----------------------------------------------------------");

        //4. loop variables cannot be used outside of loop's body

        for (int i = 10; i <= 120; i+=20) {
            System.out.println(i);

        }
        //System.out.println(i); -> won't print since outside of loop {}



































        }
}
