package m21_methods_part2;

public class returnMethods {

    public static void main(String[] args) {
       int result =  addNumbers(10, 20); //since return method, I can assign it to a variable
        System.out.println(result);

        //can also call method like this
        System.out.println(addNumbers(100, 200));

    }

  /*  //void keyword specifies that function doesn't return a value
    public static void addNumbers(int num1, int num2){
        int num3 = num1 + num2; //when I add num1 to num2 I get a 3rd int => int num3
        System.out.println("num3 = " + num3);
        //==>>since return type is void I need to add a sout statement to receive an output
    }
    */

    //a retune type may be a primitive type like int, float, or double, a reference/void type
    //if return type is not void , I have a return value _> must return value
    public static int addNumbers(int num1, int num2) {
        int num3 = num1 + num2;
        return num3;



    }


}
