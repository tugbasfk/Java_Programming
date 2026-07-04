package m17_loops_part2;

public class NumberTriangle {

    public static void main(String[] args) {
        //write a program that prints the number triangle starting at 1 - given num


        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }


    }
}
