package m18_loops_part3;

public class LabelStatement {

    public static void main(String[] args) {

//if I want to print A-D on 5 different lines
        outer: //names code segment
        for (int j = 1; j < 6; j++) {
            System.out.print(j + " : "); // j can be used as line number


            //this only will print A -D on same line
            inner: //names code fragment
            for (char i = 'A'; i < 'E'; i++) {
            //to terminate after 3: ABCD while its in inner loops body
            if (j==3){
                break outer; //breaks entire outer loop and 3 - 5 wont be printed
                            // if i didnt use naming, only 3 would have been effected by break
            }
                System.out.print(i + " ");

            }
            System.out.println();//this will start a new line during each iteration of outerline

        }



    }
}
