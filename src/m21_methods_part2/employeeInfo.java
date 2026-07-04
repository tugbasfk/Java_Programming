package m21_methods_part2;

public class employeeInfo {

    public static void main(String[] args) {
        displayEmployeeInfo("James", 25, "New York");
        //==>> argument's order must be same with parameter's order.
        System.out.println("-----------------------------------------------");

        // Can call method like this as well
        String name = "Isabella";
        int age = 26;
        String city = "Los Angeles ";
        displayEmployeeInfo(name, age, city);

    }

    public static void displayEmployeeInfo(String name, int age, String city) {
        //every singe parameter need data type and name
        //if second parameter still has same data type still have to give separate data type
        System.out.println("Employee name is: " + name);
        System.out.println(name + " is " + age + " years old. ");
        System.out.println(name + " is from " + city + ".");
    }


}
