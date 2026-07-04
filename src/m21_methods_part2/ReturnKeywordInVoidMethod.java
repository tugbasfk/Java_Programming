package m21_methods_part2;

public class ReturnKeywordInVoidMethod {
    public static void main(String[] args) {
        eligibleToVote (25);
    }

    public static void eligibleToVote(int age){

       if(age < 0 || age > 150){
           System.err.println("Invalid age: " + age);
           return; //exits the method
       }

        if (age >= 18){
            System.out.println("Your are eligible to vote");
        }else{
            System.out.println("Your are not eligible to vote");

        }
    }
}
