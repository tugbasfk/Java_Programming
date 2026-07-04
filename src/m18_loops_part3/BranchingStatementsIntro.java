package m18_loops_part3;

public class BranchingStatementsIntro {

    public static void main(String[] args) {

        for (char i = 'A'; i < 'E'; i++) { //will give me characters from A - D
            if(i == 'C'){
                break;          //break keyword used to terminate loops and switch statem
                                // will terminate code before C
            }
            System.out.println(i); //if break wasnt included A - D woulve been printed out
        }
        System.out.println("Hello"); //will be printed since its outside the loops body
        System.out.println("------------------------------------------------------");

        for (int i = 1; i < 6; i++) {
            if (i == 3){
                continue;  //used to end current iteration in a loop and continue to next one
                            //eg skips 3 prints 4
            }
            System.out.println(i); //will print 1 -5

        }








    }
}
