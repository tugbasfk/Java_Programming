package m15_selection_statements_part2;

public class SwitchWithLambdaArrows {

    public static void main(String[] args) {

        int n = 5;

        //Using Lambda Arrows


        switch (n){
            case 1 -> System.out.println("Monday"); //only one code fragment
           //case 1 -> {System.out.println("Monday");
            //          System.out.println("Weekday01");} -> for more code fragments this is syntax
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid Number");

      /* Actually could look like this
       switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Number");
*/

        }
    }
}
