package m25_class_and_objects;

public class CarClient {

    /*REQUIREMENTS:

    Create a car object and assign the below values to the instance variables and call the below methods:

    Make: Toyota
    Model: Corolla
    Year: 2013
    Color: Black
    Price: $30_000

    start()
    drive()
    stop()
    showCurrentSpeed(65, 70)
     */

    public static void main(String[] args) {

       Car car1 = new Car(); //data type determines what data can be stored in variable.
                            //if I want to store car1 object into variable data type must be Car

        //car1 object reference name
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.year = 2023;
        car1.color = "Black";
        car1.price = 30_000;

        car1.start();
        car1.drive();
        car1.stop();
        car1.showCurrentSpeed(75, 70);


        System.out.println(car1);
        System.out.println("-------------------------------------------------------------");


        Car car2 = new Car();

        car2.make = "Toyota";
        car2.model = "Grand Highlander";
        car2.year =2026;
        car2.color = "Black";
        car2.price = 65_000;

        car2.start();
        car2.drive();
        car2.stop();
        car2.showCurrentSpeed(80, 80);

        System.out.println(car2);

    }
}
