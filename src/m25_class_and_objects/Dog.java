package m25_class_and_objects;

public class Dog { //object

    /*
        - this class will be used a template for the custom object Dog
        - no main method since I don't want to use this specific class to run a program
          -> class will be used for Dog object later
        - custom classes used for custom objects

        Task:
        1. in order to make sure I will be able to store different breeds, names, color, age of dogs
           for different objects, I need to add field by using instance variables
           (which are declare within the class outside any blocks)
     */

    public String name;
    public String breed; //==>> these will be stored in the Dog object
    public int age;
    public String color;

    public void bark(){ /*methods to determine what kind of methods object can have,
                         what actions behaviors object can perform
                         I want to make sure method belongs to object
                         each object has a separate copy of method, so I don't use static keyword
                         when called in either object that one will state e.g. dog's barking*/

        System.out.println(name + " is barking.");//instance method , belongs to an object
    }

    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    //toString implicitly given for every class, need to modify toString method
    //toString() method -> String return method, returns String representation of object
    //==>> will be executed autom whenever object reference variable is being called in print statement

   /* public String toString() {
        //whatever string method returns in custom class that's what you'll get when you print its object
        return "name: " + name ; */


        //Shortcut to create toString method
        //1. right click, 2. go to generate, 3. toString(), 4. select attributes to include


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}


