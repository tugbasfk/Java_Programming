package m14_selecction_statements_part1;

public class Watermelon {

    public static void main(String[] args) {

     int number = 40;
     boolean isEnough = false;

     if (number >=20){ //true ===> will be executed
         System.out.println("I have more than 20 watermelons");
         isEnough = true; //isEnough ==> true (Bool var became true)
     }

     if (isEnough){ //true
         System.out.println("Good job");
     }

     if (!isEnough){ //!true ===> false
         System.out.println("I need more watermelons");
     }




















    }
}
