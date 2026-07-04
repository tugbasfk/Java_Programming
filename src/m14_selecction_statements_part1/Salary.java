package m14_selecction_statements_part1;

public class Salary {

    public static void main(String[] args) {

        int salary = 50000;
        int yearsOnJob = 2;

        if (salary >= 30000) { //true
            if (yearsOnJob >= 2) { //true
                System.out.println("You are qualified for a loan.");
            } else {
                System.out.println("You are not qualified for a loan. ");
            }
        } else {
            System.out.println("Your yearly income has to be at least $30,000");
        }
    }
}
