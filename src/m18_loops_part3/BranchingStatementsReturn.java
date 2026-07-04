package m18_loops_part3;

public class BranchingStatementsReturn {

    public static void main(String[] args) {

        //this loop is printing 1 -5
        for (int i = 1; i < 6; i++) {
            if(i ==3) {
               // break; //exits the loop -> would still execute all sout
               // continue; skips specific iteration ->prints 1,2,4,5
                return; //exits method -> Meaning neither sout will be executed
            }

            System.out.println(i);

        }
        System.out.println("Hello World");
        System.out.println("Hello Cydeo");


/*
continue: jumps to next iteration of loop
break: jumps out of loop's body
return: jumps out of method
 */








    }
}
