package m23_method_overloading;

public class CalculateArea {

    /*
    write an overload method called "calculateArea" for a circle and rectangle
    - method should take the radius of a circle as a parameter and return the area of the circle
    - 2nd version should take the length and width of a rectangle's parameter
    and return the area of the rectangle.
     */

    public static void main(String[] args) {
        //area I want to store into variable areaOfCircle
        double areaOfCircle = calculateArea(2.5);
        System.out.println("areaOfCircle " + areaOfCircle);

        double areaOfRectangle = calculateArea(3.5, 4.5);
        System.out.println("areaOfRectangle " + areaOfRectangle);
    }
    public static double calculateArea(double radius) {
        //to calculate area of circle method needs additional info which is why we pass a parameter
        return radius * radius * 3.14; //=> for calculating area of circle
        //as soon as radius is given ,
        //method should be able to return area of circle with given radius, so we need to return area

    }
    //need another method with the same name to help me calculate area of rectangle
    public static double calculateArea (double length, double width ){
        return length * width; //calculating area of rectangle
    }
}
