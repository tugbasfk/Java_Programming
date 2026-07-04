package m18_loops_part3;

public class DoWhileLoop {

    public static void main(String[] args) {

        int n =100;
        while (n<0){//false -> loop will not be executed
            System.out.println("While Loop: Hello");
        }
        System.out.println("--------------------------------------------------");

        do{ //gets executed first before while block is checked
            System.out.println("Do - While Loop: Hello World ");
        }while (n<0); //false

        System.out.println("--------------------------------------------------");

        int i =0;
        do{
            System.out.println(i + " ");
            i++;
        }while(i<11);
















    }
}
