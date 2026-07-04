package m16_loops_part1;

public class ForLoop {

    public static void main(String[] args) {

       /* //Not efficient, smart way of coding

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");*/


        for (int i = 0; i < 5; i++ ){
            //we use int i = from initialisation to set ending for loop by using i again
            //int i = 0; i < 5 results in infinite loop because i is always 0 here and <5
            //i++ to increase i so i<5 becomes false and loop ends
            System.out.println("Hello World");
        }


       /* for (;;){
            System.out.println("Hello World");
        } ==> THIS CODE WILL RESULT IN AN INFINITE LOOP
          ==> ;; for initialisation & condition
        */

    }
}
