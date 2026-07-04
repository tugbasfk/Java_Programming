package m15_selection_statements_part2;

public class SwitchConstantsExample {

    /*constant variables declared as final
    outside of blocks /main within class
    known as static constant variables
    can only have one variable
     */

    public static final int OPTION_ONE = 1;
    public static final int OPTION_TWO = 2;
    public static final int OPTION_THREE = 3;

    public static void main(String[] args) {


        int choice = 2;

        switch (choice){
            case OPTION_ONE: //case 1: would be a literal but opt one is constant
                System.out.println("option one was selected.");
                break;
            case OPTION_TWO:
                System.out.println("option two was selected.");
                break;
            case  OPTION_THREE:
                System.out.println("option three was selected.");
                break;
            default:
                System.out.println("invalid selection");
        }





    }
}
