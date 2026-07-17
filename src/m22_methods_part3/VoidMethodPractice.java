package m22_methods_part3;

public class VoidMethodPractice {

    /*
    Create a method named displayGrade that passes an int parameter named score
    and displays the grade of the student.
    Example1:
        displayGrade(95);
        output:
            Excellent, you made an A.
     */
    public static void main(String[] args) {
        displayGrade(190);
    }
    public static void displayGrade(int score) {

        if(score < 0 || score > 100){
            System.out.println("Invalid input "  + score);
            return; //makes sure the code doesn't run after invalid input was entered
        }

        if (score >= 90) {
            System.out.println("Excellent, you made an A. ");
        } else if (score >= 80) {
            System.out.println("Good job, you made a B. ");
        } else if (score >= 70) {
            System.out.println("You made a C. ");
        }else if(score >=60 ){
            System.out.println("You passed with a D. ");
        }else{
            System.out.println("Failed. ");
        }

    }
}
