package m21_methods_part2;

public class passByValue {


    public static void main(String[] args) {

        int a = 5;
        displayCube(a); /*copy of variable a will be assigned to num parameter
                        if parameter num has been updated within method below,
                        the update has nothing to do with the original copy of argument variable a*/
        System.out.println("a = " + a);
        //soutv => shortcut for printing variable
    }

    public static void displayCube(int num) {
        System.out.println("The number is: " + num); //displays num itself
        num /*updating parameter variable*/ = num * num * num; //calculates cube of num
        System.out.println("Cube is: " + num);//displays cube num

        /*==>int num parameter variable will not update original arguments' value
        because pass byb value everytime I pass an argument a new copy of argument will be passed
         */

    }


}
