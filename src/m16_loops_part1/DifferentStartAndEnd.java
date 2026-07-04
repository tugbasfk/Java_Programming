package m16_loops_part1;
        /*
        print nums from 5 - 20(inclusive) on same line with space
        print nums from 20 - 10(exclusive)
        print nums form 10 -100 (inclusive) with increment of 10
        print nums from 50 -10 (exclusive) with a decrement of 4
        print "Hello" 5 times
         */
public class DifferentStartAndEnd {

    public static void main(String[] args) {

        for (int i = 5; i < 21 ; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

        System.out.println("------------------------------------------");

        //for (int i = 20; i < 10 ; i++) ==> loop will neve be executed since it start from 20
        //and will keep being incremented since 20 is larger than 10
        // I need i>10 because i<10 would imply all nums need to be larger than 10,
        // which they already are and because I want to exclude 10
        for (int i = 20; i > 10 ; i--) {
            //i -= 1 is same as i--
            //i's only accessible within blocks so you can use multiple i's throughout
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("------------------------------------------------");

        for (int i = 10; i <= 100; i +=10) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("------------------------------------------------");

        for (int i = 50; i > 10 ; i -=4) { //if I want to go backwards i need i > x
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("------------------------------------------------");

        for (int i = 5; i < 10 ; i++) {
            // i < 10  excludes 10, so my max num to reach will be 9
            //starting from 5 to 9 I have 5,6,7,8,9 ==> 5 times the loop will run
            System.out.println("Hello");

        }






























    }
}
