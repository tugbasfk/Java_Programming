package m25_class_and_objects;

public class DogClient {

    //create a "DogClient" class and 3 "Dog" objects.
    //class will be run so create a main

    public static void main(String[] args) {

       /*reference name Dog , non-primitive
        object reference variable name dog
        need to initialize value into variable dog
        if dog was obj ref variable of String  then I could only store string  objects into variable dog
        -> data type determines what kind of value can be stored into variable
        when data type Dog I can only store Dog objects into variable
        with = I can give / create dog objects
        */
        Dog dog1 = new Dog();  //first dog object created
        //if you want to assign data instance variable name of object Dog dog1 = new Dog();
        //through object we need to call name and assign data
        dog1.name = "Debbie";
        dog1.breed = "Husky";
        dog1.age = 2;
        dog1.color = "Brown";

        System.out.println("Name: " + dog1.name);
        //to get name of first dog from object reference variable name I use
        //dog1 to access instance variables and methods e.g. name , age
        //name (instance variable) is accessible through object reference
        System.out.println("Breed: " + dog1.breed);
        System.out.println("Age: " + dog1.age);
        System.out.println("Color: " + dog1.color);

        //can also call instance methods of dog object
        dog1.bark();
        dog1.eat();
        dog1.sleep();

        System.out.println(dog1); //will print hash code, need to set up toString() method of dog object
                                  //see Dog class for details


        System.out.println("------------------------------------------------------------------------");

        Dog dog2 = new Dog();
        dog2.name = "Lessy";
        dog2.breed = "Husky";
        dog2.age = 3;
        dog2.color = "White";

        System.out.println("Name: " + dog2.name);
        System.out.println("Breed: " + dog2.breed);
        System.out.println("Age: " + dog2.age);
        System.out.println("Color " + dog2.color);

        System.out.println(dog2);

        dog2.bark();
        dog2.eat();
        dog2.sleep();


        System.out.println("-------------------------------------------------------------------------");


        Dog dog3 = new Dog();

        dog3.name = "Wuffy";
        dog3.breed = "Chihuahua";
        dog3.age = 1;
        dog3.color = "Black";

        System.out.println(dog3);

        dog3.bark();
        dog3.eat();
        dog3.sleep();
    }
}
