package m23_method_overloading;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        //one name to display any of the methods
        //which one will be printed first depends on the argument I provide first
        displayValues(10);  //when provided int -> first arg will print
        displayValues((double)20.5); //when provided double -> second arg will print
        displayValues(10, (double) 20.5);
        displayValues(20.5, 10);

    }


    public static void displayValues(int a) {

        System.out.println("First Method");
    }

    public static void displayValues(double a) {
        System.out.println("Second Method");
    }

    public static void displayValues(int a, double b) {

        System.out.println("Third Method");
    }

        /*
    public static int displayValues(int a, double b){

        System.out.println("Third Method");
        return 0; //doesn't matter if it has a return value either, as long as the
                 //names are the same, it is a method overload*/

    public static void displayValues(double a, int b) {
            System.out.println("Fourth Method");
        }

    }

