package m14_selecction_statements_part1;

public class WeeklyWage {

    public static void main(String[] args) {

      /*write a program to calculate weekly wage for given hours
      normally weekly wage is $900, multiply by 1.5 if working hours exceed 40
       */

        //double because wage could be float or int
        double wage = 900;
        int hours = 40;

        if (hours > 40) {
            wage *= 1.5;
        }
        System.out.println("wage = " + wage);








    }
}
