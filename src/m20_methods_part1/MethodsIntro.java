package m20_methods_part1;

public class MethodsIntro {

    public static void main(String[] args) {//need main to make code runable
        //main needs to be independent methods -> cannot declare one method in another's body
        //every method needs to be within class

        System.out.println("Test started. ");
        eat();
        walk();
        play();
        //or I can call methods by using class name
        MethodsIntro.play();
        System.out.println("Test completed. ");


    }


    public static void eat() { //{} define scope of method
        System.out.println("I am eating. ");
    }

    public static void walk() {
        System.out.println("I am walking. ");
    }

    //calling a method inside a method => inner method will be executed first
    public static void play() {
        walk();
        System.out.println("I am playing. ");
    }

}
