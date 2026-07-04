package m14_selecction_statements_part1;

public class Number {

    public static void main(String[] args) {

        /*write a program that checks the value of the variable num
        if num greater 0 -> num is pos
        if num less than 0 -> num is neg
        if num neither greater nor less than 0 -> num is 0
         */


        int num = 100;
//each statement will be checked one by one => inefficient
      /*  if (num > 0){ //true -> positive output
            System.out.println("positive");
        }
        if (num < 0){
            System.out.println("negative");
        }
        if(num == 0){
            System.out.println("zero");
        }
*/

//if first block true , other blocks will be eliminated
        if ( num > 0){
            System.out.println("positive");
        }else if (num<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }














    }
}
