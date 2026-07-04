package m14_selecction_statements_part1;

public class Grading {

    public static void main(String[] args) {

        /*write a program that evaluates the given score using nested if
        score less than 60 -> "Fail"
        score >= 60but less than 90 -> "pass"
        score >=90 -> "passed with distinction
        score not between 0 - 100 -> "Invalid score"
         */

         int score = 95;

         if(score >=0 && score <= 100) { // if score is valid 3 possible outputs

             if(score >= 90) {
                 System.out.println("passed with distinction");

             }else if(score >= 60){
                 System.out.println("passed");

             }else{
                 System.out.println("failed");

             }


         }else{
             System.out.println("invalid score"); //if score not between 0 - 100
         }



    /* OR
    int score = 95;
    String result;

    if(score >=0 && score <= 100) { // if score is valid 3 possible outputs

             if(score >= 90) {
               result =  "passed with distinction";

             }else if(score >= 60){
                 result = "passed";

             }else{
                result = "failed";

             }


         }else{
             result = "invalid score"; //if score not between 0 - 100
         }
         System.out.println(result);

     */
















    }
}
