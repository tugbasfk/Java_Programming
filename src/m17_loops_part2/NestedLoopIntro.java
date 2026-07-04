package m17_loops_part2;

public class NestedLoopIntro {

    public static void main(String[] args) {


        for (int j = 0; j < 5; j++) { //this prints 12345 on five lines
            for (int i = 1; i < 6 ; i++) { //this prints 12345
                System.out.print(i + " ");
            } //when outer loop runs 1 time inner loop does 5 times
             //when outer loop runs 2 time inner loop does 5 times etc.

            System.out.println();

        }



    }
}
