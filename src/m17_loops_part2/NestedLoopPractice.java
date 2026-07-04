package m17_loops_part2;

public class NestedLoopPractice {

    public static void main(String[] args) {


        for (int i = 1; i < 5 ; i++) { //every time the outer loop runs 1 time inner loop runs 3 times
            System.out.println("Outer loop iteration  " + i); //outside of inner loop to print this only 4 times
            for (int j = 1; j < 4 ; j++) {
                System.out.println("i = " + i + " | " + "j = " + j);

            }

        }






















    }
}
