package m18_loops_part3;

public class WhileLoop {

    public static void main(String[] args) {

//for loop is more convenient if you know how many times to iterate code segment
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("--------------------------------");



        int j = 0;
        while(j < 11){
            System.out.print(j + " ");
            j++; //incrementing at end because I want to print out 0 first

            /*
            int j = 0;
            while(j < 11){
            System.out.print(j + " "); ==> infinite loop since there is no incrementing
             */
        }
        System.out.println();
        System.out.println("--------------------------------");











    }
}
